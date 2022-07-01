package thucHanh;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;

public class Bai3_2 extends JFrame {

	private JPanel contentPane;
	private JTextField txtHoten;
	private JTextField txtSdt;
	private JTextField txtHinh;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bai3_2 frame = new Bai3_2();
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
	public Bai3_2() {
		setTitle("Thêm mới liên hệ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 579, 273);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Thêm mới liên hệ");
		lblNewLabel.setBounds(10, 11, 132, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Họ tên");
		lblNewLabel_1.setBounds(10, 49, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("SĐT");
		lblNewLabel_1_1.setBounds(10, 94, 46, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Ảnh");
		lblNewLabel_1_2.setBounds(10, 149, 46, 14);
		contentPane.add(lblNewLabel_1_2);
		
		txtHoten = new JTextField();
		txtHoten.setBounds(55, 46, 175, 20);
		contentPane.add(txtHoten);
		txtHoten.setColumns(10);
		
		txtSdt = new JTextField();
		txtSdt.setColumns(10);
		txtSdt.setBounds(55, 91, 132, 20);
		contentPane.add(txtSdt);
		
		txtHinh = new JTextField();
		txtHinh.setColumns(10);
		txtHinh.setBounds(55, 146, 175, 20);
		contentPane.add(txtHinh);
		
		JLabel lblHinh = new JLabel("");
		lblHinh.setBounds(328, 11, 145, 152);
		contentPane.add(lblHinh);
		
		JButton btnNewButton = new JButton("Thêm liên hệ");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton.setBounds(55, 200, 132, 23);
		contentPane.add(btnNewButton);
		
		JButton btnChon = new JButton("...");
		btnChon.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser fc = new JFileChooser("D:/LoLinhChi_WorkSpace");
				fc.setDialogTitle("Chọn ảnh liên hệ");
				fc.setFileFilter(new FileNameExtensionFilter("*.jpg", "jpg"));
				fc.setFileFilter(new FileNameExtensionFilter("*.png", "png"));
				int chon = fc.showOpenDialog(contentPane);
				if(chon == JFileChooser.APPROVE_OPTION) {
					File file = fc.getSelectedFile();
					txtHinh.setText(file.getAbsolutePath());
					lblHinh.setIcon(new ImageIcon(file.getAbsolutePath()));
				}
			}
		});
		btnChon.setBounds(240, 145, 29, 23);
		contentPane.add(btnChon);
	}

}
