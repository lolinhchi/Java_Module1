package thuchanh.Bai8_2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrmUDGuiQua extends JFrame {

	private JPanel contentPane;
	private JTextField txtHinh;
	private JTextField txtMau;
	private JTextField txtTen;
	private JTextField txtTrongLuong;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmUDGuiQua frame = new FrmUDGuiQua();
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
	public FrmUDGuiQua() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 451, 620);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Thông tin hộp quà");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(10, 24, 162, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblHnhDngHp = new JLabel("Hình dáng hộp quà");
		lblHnhDngHp.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblHnhDngHp.setBounds(35, 59, 122, 14);
		contentPane.add(lblHnhDngHp);
		
		JLabel lblMuSc = new JLabel("Màu sắc");
		lblMuSc.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblMuSc.setBounds(94, 100, 56, 14);
		contentPane.add(lblMuSc);
		
		JLabel lblThngTinQu = new JLabel("Thông tin quà");
		lblThngTinQu.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblThngTinQu.setBounds(72, 166, 85, 14);
		contentPane.add(lblThngTinQu);
		
		JLabel lblTnQu = new JLabel("Tên quà");
		lblTnQu.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTnQu.setBounds(72, 206, 85, 14);
		contentPane.add(lblTnQu);
		
		JLabel lblTrngLng = new JLabel("Trọng lượng");
		lblTrngLng.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTrngLng.setBounds(72, 244, 85, 14);
		contentPane.add(lblTrngLng);
		
		txtHinh = new JTextField();
		txtHinh.setBounds(167, 56, 187, 20);
		contentPane.add(txtHinh);
		txtHinh.setColumns(10);
		
		txtMau = new JTextField();
		txtMau.setColumns(10);
		txtMau.setBounds(167, 97, 187, 20);
		contentPane.add(txtMau);
		
		txtTen = new JTextField();
		txtTen.setColumns(10);
		txtTen.setBounds(167, 203, 187, 20);
		contentPane.add(txtTen);
		
		txtTrongLuong = new JTextField();
		txtTrongLuong.setColumns(10);
		txtTrongLuong.setBounds(167, 241, 187, 20);
		contentPane.add(txtTrongLuong);
		
		JLabel lblNewLabel_1 = new JLabel("g");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(361, 244, 32, 14);
		contentPane.add(lblNewLabel_1);
		
		JTextArea textaKq = new JTextArea();
		textaKq.setLineWrap(true);
		textaKq.setBounds(167, 359, 187, 167);
		contentPane.add(textaKq);
		
		JButton btnNewButton = new JButton("Gửi quà");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String hinhdang = txtHinh.getText();
				String mau = txtMau.getText();
				String ten = txtTen.getText();
				int trongluong = Integer.parseInt(txtTrongLuong.getText());
				Qua qua = new Qua(hinhdang, mau, ten, trongluong);
				textaKq.setText(qua.toString());
			}
		});
		btnNewButton.setBounds(167, 292, 187, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("Thông tin gửi quà");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(35, 422, 115, 14);
		contentPane.add(lblNewLabel_2);
		
		
	}
}
