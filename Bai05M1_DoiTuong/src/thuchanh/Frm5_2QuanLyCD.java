package thuchanh;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Frm5_2QuanLyCD extends JFrame {

	private JPanel contentPane;
	private JTextField txtMaCD;
	private JTextField txtTenCD;
	private JTextField txtCasi;
	private JTextField txtSobh;
	private JTextField txtGia;
	
	public int tong = 0;
	public String chuoiCD ="";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frm5_2QuanLyCD frame = new Frm5_2QuanLyCD();
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
	public Frm5_2QuanLyCD() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 557, 362);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Mã CD");
		lblNewLabel.setBounds(10, 46, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblTnCd = new JLabel("Tên CD");
		lblTnCd.setBounds(204, 46, 46, 14);
		contentPane.add(lblTnCd);
		
		txtMaCD = new JTextField();
		txtMaCD.setBounds(54, 43, 86, 20);
		contentPane.add(txtMaCD);
		txtMaCD.setColumns(10);
		
		txtTenCD = new JTextField();
		txtTenCD.setBounds(260, 43, 212, 20);
		contentPane.add(txtTenCD);
		txtTenCD.setColumns(10);
		
		JLabel lblCaS = new JLabel("Ca sĩ");
		lblCaS.setBounds(10, 101, 46, 14);
		contentPane.add(lblCaS);
		
		txtCasi = new JTextField();
		txtCasi.setBounds(54, 98, 124, 20);
		contentPane.add(txtCasi);
		txtCasi.setColumns(10);
		
		JLabel lblSBiHt = new JLabel("Số bài hát");
		lblSBiHt.setBounds(204, 101, 65, 14);
		contentPane.add(lblSBiHt);
		
		txtSobh = new JTextField();
		txtSobh.setBounds(279, 98, 46, 20);
		contentPane.add(txtSobh);
		txtSobh.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Giá thành");
		lblNewLabel_1.setBounds(345, 101, 65, 14);
		contentPane.add(lblNewLabel_1);
		
		txtGia = new JTextField();
		txtGia.setBounds(400, 98, 131, 20);
		contentPane.add(txtGia);
		txtGia.setColumns(10);
		
		JTextArea txtChuoi = new JTextArea();
		txtChuoi.setBounds(54, 163, 446, 149);
		contentPane.add(txtChuoi);
		JButton btnThem = new JButton("Thêm mới");
		
		btnThem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				CD cd = new CD(txtMaCD.getText().toString(), txtTenCD.getText().toString(), txtCasi.getText().toString(), txtSobh.getText().toString()
						, Integer.parseInt(txtGia.getText().toString()));
				tong += cd.getGia();
				chuoiCD += cd.toString();
				txtChuoi.setText(chuoiCD + "\n Tổng giá thành: "+ tong);
			}
		});
		btnThem.setBounds(140, 129, 89, 23);
		contentPane.add(btnThem);
		
		JButton btnTiep = new JButton("Tiếp tục");
		btnTiep.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtCasi.setText("");
				txtGia.setText("");
				txtMaCD.setText("");
				txtSobh.setText("");
				txtTenCD.setText("");
			}
		});
		btnTiep.setBounds(289, 129, 89, 23);
		contentPane.add(btnTiep);
		
		
	}
}
