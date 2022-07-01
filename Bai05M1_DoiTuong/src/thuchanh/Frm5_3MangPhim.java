package thuchanh;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Frm5_3MangPhim extends JFrame {

	private JPanel contentPane;
	private JTextField txtTen;
	private JTextField txtTheloai;
	private JTextField txtNgay;
	private JTextField txtRap;
	Phim[] phim = new Phim[3];
	public int index = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frm5_3MangPhim frame = new Frm5_3MangPhim();
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
	public Frm5_3MangPhim() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 676, 506);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblHinh = new JLabel("");
		lblHinh.setBounds(108, 106, 256, 267);
		contentPane.add(lblHinh);
		
		txtTen = new JTextField();
		txtTen.setBounds(397, 106, 171, 20);
		contentPane.add(txtTen);
		txtTen.setColumns(10);
		
		txtTheloai = new JTextField();
		txtTheloai.setColumns(10);
		txtTheloai.setBounds(397, 165, 171, 20);
		contentPane.add(txtTheloai);
		
		txtNgay = new JTextField();
		txtNgay.setColumns(10);
		txtNgay.setBounds(397, 224, 171, 20);
		contentPane.add(txtNgay);
		
		txtRap = new JTextField();
		txtRap.setColumns(10);
		txtRap.setBounds(397, 291, 171, 20);
		contentPane.add(txtRap);
		
		JButton btnBack = new JButton("");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(index > 0  ) {
					index --;
					txtTen.setText(phim[index].getTen());
					txtTheloai.setText(phim[index].getTheloai());
					txtNgay.setText(phim[index].getNgayChieu());
					txtRap.setText(phim[index].getRap());
					lblHinh.setIcon(new ImageIcon(phim[index].getHinh()));
				}else {
					JOptionPane.showMessageDialog(contentPane, "Đây là điểm đầu!");
				}
			}
			
		});
		btnBack.setIcon(new ImageIcon("D:\\LoLinhChi_WorkSpace\\HinhAnh\\8725397_arrow_circle_left_icon.png"));
		btnBack.setBounds(10, 210, 64, 64);
		contentPane.add(btnBack);
		
		JButton btnNext = new JButton("");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(index < 2) {
					index++;
					txtTen.setText(phim[index].getTen());
					txtTheloai.setText(phim[index].getTheloai());
					txtNgay.setText(phim[index].getNgayChieu());
					txtRap.setText(phim[index].getRap());
					lblHinh.setIcon(new ImageIcon(phim[index].getHinh()));
				}else {
					JOptionPane.showMessageDialog(contentPane, "Đây là điểm cuối!");
				}
			}
		});
		btnNext.setIcon(new ImageIcon("D:\\LoLinhChi_WorkSpace\\HinhAnh\\8725431_arrow_circle_right_icon.png"));
		btnNext.setBounds(586, 210, 64, 64);
		contentPane.add(btnNext);
		
		phim[0] = new Phim("Chàng trai năm ấy", "Lãng mạn", "22/12/2022", "Hòa Bình", "D:/LoLinhChi_WorkSpace/HinhAnh/changtrainamay.jpg");
		phim[1]  = new Phim("Biệt đội chim cánh cụt", "Hoạt hình", "01/01/2022", "BHB", "D:/LoLinhChi_WorkSpace/HinhAnh/bietdoichimcanhcut.jpg");
		phim[2]  = new Phim("Big hero 6", "Hoạt hình", "01/01/2022", "BHB", "D:/LoLinhChi_WorkSpace/HinhAnh/bighero6.jpg");
		
		//
		txtTen.setText(phim[0].getTen());
		txtTheloai.setText(phim[0].getTheloai());
		txtNgay.setText(phim[0].getNgayChieu());
		txtRap.setText(phim[0].getRap());
		lblHinh.setIcon(new ImageIcon(phim[0].getHinh()));
		
		
	}

}
