package thucHanh;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class ComboBox extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7681768497831265929L;
	private JPanel contentPane;
	private JTextField txtIndex;
	private JTextField txtMuc;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ComboBox frame = new ComboBox();
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
	public ComboBox() {
		setTitle("ComboBox");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 434, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Các món ăn");
		lblNewLabel.setBounds(27, 47, 73, 25);
		contentPane.add(lblNewLabel);
		
		JComboBox cbMonan = new JComboBox();
		cbMonan.setModel(new DefaultComboBoxModel(new String[] {"Cơm gà", "Gà rán", "Gà gỏi", "Lẩu gà", "Chân gà"}));
		cbMonan.setBounds(27, 76, 89, 25);
		contentPane.add(cbMonan);
		
		JLabel lblNewLabel_1 = new JLabel("Index");
		lblNewLabel_1.setBounds(185, 52, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Mục Chọn");
		lblNewLabel_1_1.setBounds(164, 116, 73, 17);
		contentPane.add(lblNewLabel_1_1);
		
		txtIndex = new JTextField();
		txtIndex.setBounds(238, 49, 86, 20);
		contentPane.add(txtIndex);
		txtIndex.setColumns(10);
		
		txtMuc = new JTextField();
		txtMuc.setColumns(10);
		txtMuc.setBounds(238, 113, 86, 20);
		contentPane.add(txtMuc);
		
		JButton btnXem = new JButton("Xem");
		btnXem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String monAn;
				int index;
				index = cbMonan.getSelectedIndex();
				if(index != -1) {
					txtIndex.setText(String.valueOf(index));
					txtMuc.setText(cbMonan.getSelectedItem().toString());
				}
			}
		});
		btnXem.setBounds(145, 173, 89, 23);
		contentPane.add(btnXem);
		
		JLabel lblCcThng = new JLabel("Các tháng");
		lblCcThng.setBounds(27, 235, 73, 25);
		contentPane.add(lblCcThng);
		
		JComboBox cbThang = new JComboBox();
		cbThang.setBounds(27, 271, 89, 22);
		contentPane.add(cbThang);
		
		JButton btnNewButton = new JButton("Phát sinh");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
				for(int i =1; i<=12; i++) {
					model.addElement("Tháng "+i);
				}
				cbThang.setModel(model);
			}
		});
		btnNewButton.setBounds(189, 271, 89, 23);
		contentPane.add(btnNewButton);
	}
}
