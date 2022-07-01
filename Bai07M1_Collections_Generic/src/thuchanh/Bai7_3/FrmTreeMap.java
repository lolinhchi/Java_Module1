package thuchanh.Bai7_3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.AbstractButton;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.awt.event.ActionEvent;

public class FrmTreeMap extends JFrame {

	private JPanel contentPane;
	private JTextField txtKey;
	private JTextField txtValue;
	private JScrollPane scrollPane;
	private JList list;
	private JButton btnAdd;
	private JButton btnContinue;
	private Map<String, String> lst = new TreeMap<String, String>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmTreeMap frame = new FrmTreeMap();
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
	public FrmTreeMap() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 451, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Key");
		lblNewLabel.setBounds(10, 34, 46, 14);
		contentPane.add(lblNewLabel);
		
		txtKey = new JTextField();
		txtKey.setBounds(66, 31, 118, 20);
		contentPane.add(txtKey);
		txtKey.setColumns(10);
		
		JLabel lblValue = new JLabel("Value");
		lblValue.setBounds(230, 34, 46, 14);
		contentPane.add(lblValue);
		
		txtValue = new JTextField();
		txtValue.setColumns(10);
		txtValue.setBounds(286, 31, 118, 20);
		contentPane.add(txtValue);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 102, 394, 148);
		contentPane.add(scrollPane);
		
		list = new JList();
		scrollPane.setViewportView(list);
		
		btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String key = txtKey.getText();
				String value = txtValue.getText();
				lst.put(key, value);
				DefaultListModel df = new DefaultListModel();
				int i = 0;
				for(String k:lst.keySet()) {
					Object t = k + " : " + lst.get(k);
					df.add(i, t);
					i++;
				}
				list.setModel(df);
				
			}
		});
		btnAdd.setBounds(106, 68, 89, 23);
		contentPane.add(btnAdd);
		
		btnContinue = new JButton("Continue");
		btnContinue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtKey.setText("");
				txtValue.setText("");
			}
		});
		btnContinue.setBounds(240, 68, 89, 23);
		contentPane.add(btnContinue);
	}

}
