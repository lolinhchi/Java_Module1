package thucHanh;

import java.awt.EventQueue;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Bai3_1 extends JFrame {

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
					Bai3_1 frame = new Bai3_1();
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
	public Bai3_1() {
		setTitle("Thông tin liên hệ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 439, 581);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Thông tin liên hệ");
		lblNewLabel.setBounds(10, 11, 110, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Họ tên");
		lblNewLabel_1.setBounds(10, 54, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("SĐT");
		lblNewLabel_1_1.setBounds(10, 93, 46, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Hình ảnh");
		lblNewLabel_1_1_1.setBounds(10, 133, 46, 14);
		contentPane.add(lblNewLabel_1_1_1);
		
		txtHoten = new JTextField();
		txtHoten.setBounds(92, 51, 250, 20);
		contentPane.add(txtHoten);
		txtHoten.setColumns(10);
		
		txtSdt = new JTextField();
		txtSdt.setColumns(10);
		txtSdt.setBounds(92, 90, 169, 20);
		contentPane.add(txtSdt);
		
		txtHinh = new JTextField();
		txtHinh.setColumns(10);
		txtHinh.setBounds(92, 130, 250, 20);
		contentPane.add(txtHinh);
		
		
		
		JSeparator separator = new JSeparator();
		separator.setBounds(34, 223, 349, 2);
		contentPane.add(separator);
		
		JLabel lblNewLabel_1_2 = new JLabel("Họ tên");
		lblNewLabel_1_2.setBounds(10, 268, 46, 14);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("SĐT");
		lblNewLabel_1_1_2.setBounds(10, 314, 46, 14);
		contentPane.add(lblNewLabel_1_1_2);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Hình ảnh");
		lblNewLabel_1_1_1_1.setBounds(10, 364, 46, 14);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		JLabel lblHoten = new JLabel("");
		lblHoten.setBounds(92, 268, 250, 23);
		contentPane.add(lblHoten);
		
		JLabel lblSdt = new JLabel("");
		lblSdt.setBounds(92, 314, 169, 23);
		contentPane.add(lblSdt);
		
		JLabel lblHinh = new JLabel("");
		lblHinh.setBounds(92, 364, 169, 167);
		contentPane.add(lblHinh);
		
		
		JButton btnNewButton = new JButton("Hiển thị");
		btnNewButton.setBackground(SystemColor.window);
		btnNewButton.setBounds(172, 168, 89, 23);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblHoten.setText(txtHoten.getText().toString());
				lblSdt.setText(txtSdt.getText().toString());
				lblHinh.setIcon(new ImageIcon(txtHinh.getText().toString()));
			}
		});
		
	}
}
