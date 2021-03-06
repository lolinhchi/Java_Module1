package thuchanh.Bai7_1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.awt.event.ActionEvent;

public class FrmInMang extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmInMang frame = new FrmInMang();
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
	public FrmInMang() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 328, 479);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Loại mảng");
		lblNewLabel.setBounds(10, 40, 77, 14);
		contentPane.add(lblNewLabel);
		
		JComboBox cbLoai = new JComboBox();
		cbLoai.setModel(new DefaultComboBoxModel(new String[] {"Chuỗi", "Số Nguyên", "Số Thực"}));
		cbLoai.setBounds(97, 36, 140, 22);
		contentPane.add(cbLoai);
		
		JLabel lblNewLabel_1 = new JLabel("Nhập mảng(mỗi phần tử cách nhau 1 khoảng trắng)");
		lblNewLabel_1.setBounds(10, 102, 290, 14);
		contentPane.add(lblNewLabel_1);
		
		JTextArea txtaMang = new JTextArea();
		txtaMang.setLineWrap(true);
		txtaMang.setBounds(20, 127, 253, 85);
		contentPane.add(txtaMang);
		
		JLabel lblNewLabel_2 = new JLabel("Mảng sau khi sắp xếp");
		lblNewLabel_2.setBounds(10, 235, 186, 14);
		contentPane.add(lblNewLabel_2);
		
		JTextArea txtASx = new JTextArea();
		txtASx.setLineWrap(true);
		txtASx.setBounds(20, 260, 253, 85);
		contentPane.add(txtASx);
		
		JButton btnNewButton = new JButton("Sắp xếp tăng");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int chon = cbLoai.getSelectedIndex();
				String[] mang = txtaMang.getText().split(" ");
				List ds = new ArrayList();
				switch(chon) {
				case 0:
					ds.addAll(Arrays.asList(mang));
					break;
				case 1:
					for(String s: mang) {
						ds.add(Integer.parseInt(s));
					}
					break;
				case 2:
					for(String s:mang) {
						ds.add(Double.parseDouble(s));
					};
					break;
				}
				Collections.sort(ds);
				txtASx.setText(ds.toString());
			}
		});
		btnNewButton.setBounds(107, 374, 107, 23);
		contentPane.add(btnNewButton);
	}
}
