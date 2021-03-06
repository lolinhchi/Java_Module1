package thuchanh.Bai7_2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class FrmTuDien extends JFrame {

	private JPanel contentPane;
	private JTextField txtWord;
	private JTextField txtMeaning;
	List<Dictionary> lst  = new ArrayList<Dictionary>();
	private JTextField txtW;
	private JTextField txtM;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmTuDien frame = new FrmTuDien();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FrmTuDien() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 592, 385);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 25, 556, 310);
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Show - Insert Word", null, panel, null);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Word");
		lblNewLabel.setBounds(10, 30, 46, 14);
		panel.add(lblNewLabel);
		
		txtWord = new JTextField();
		txtWord.setBounds(66, 27, 131, 20);
		panel.add(txtWord);
		txtWord.setColumns(10);
		
		JLabel lblMeaning = new JLabel("Meaning");
		lblMeaning.setBounds(207, 30, 54, 14);
		panel.add(lblMeaning);
		
		txtMeaning = new JTextField();
		txtMeaning.setColumns(10);
		txtMeaning.setBounds(271, 27, 131, 20);
		panel.add(txtMeaning);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 78, 393, 193);
		panel.add(scrollPane);
		
		JList list = new JList();
		scrollPane.setViewportView(list);
		
		JButton btnInsert = new JButton("Insert");
		btnInsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String word = txtWord.getText();
				String mean = txtMeaning.getText();
				Dictionary dic = new Dictionary(word, mean);
				lst.add(dic);
				Collections.sort(lst);
				DefaultListModel df = new DefaultListModel();
				int i = 0;
				for(Dictionary d : lst) {
					Object item  = d.getWord() +" : "+d.getMean();
					df.add(i, item);
					i++;
				}
				list.setModel(df);
				
			}
		});
		btnInsert.setBounds(431, 26, 89, 23);
		panel.add(btnInsert);
		
		
		
		
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Search", null, panel_1, null);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Word");
		lblNewLabel_1.setBounds(10, 28, 46, 14);
		panel_1.add(lblNewLabel_1);
		
		txtW = new JTextField();
		txtW.setBounds(66, 25, 152, 20);
		panel_1.add(txtW);
		txtW.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Meaning");
		lblNewLabel_3.setBounds(10, 91, 57, 14);
		panel_1.add(lblNewLabel_3);
		
		txtM = new JTextField();
		txtM.setBounds(66, 88, 152, 20);
		panel_1.add(txtM);
		txtM.setColumns(10);
		
		JButton btnSearch = new JButton("");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String word = txtW.getText();
				boolean flag = false;
				for(Dictionary dic : lst) {
					if(dic.getWord().equals(word)) {
						flag = true;
						txtM.setText(dic.getMean());
						break;
					}
				}
				if(flag==false) {
					JOptionPane.showMessageDialog(tabbedPane, "Kh??ng c?? t??? c???n t??m!");
				}
			}
		});
		btnSearch.setIcon(new ImageIcon("D:\\LoLinhChi_WorkSpace\\HinhAnh\\search.jpg"));
		btnSearch.setBounds(228, 20, 46, 30);
		panel_1.add(btnSearch);
	}
}
