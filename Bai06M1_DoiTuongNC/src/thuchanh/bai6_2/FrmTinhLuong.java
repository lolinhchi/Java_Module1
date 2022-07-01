package thuchanh.bai6_2;

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

public class FrmTinhLuong extends JFrame {

	private JPanel contentPane;
	private JTextField txtHs;
	private JTextField txtThem;
	private JTextField txtLuong;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmTinhLuong frame = new FrmTinhLuong();
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
	
	public FrmTinhLuong() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 402, 438);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Lo\u1EA1i nh\u00E2n vi\u00EAn");
		lblNewLabel.setBounds(10, 31, 92, 14);
		contentPane.add(lblNewLabel);
		JLabel lblThem = new JLabel("S\u1ED1");
		lblThem.setBounds(10, 139, 92, 14);
		contentPane.add(lblThem);
		
		JComboBox cbLoai = new JComboBox();
		cbLoai.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String loai = cbLoai.getSelectedItem().toString();
				switch(loai) {
				case "Hành chính":
					lblThem.setText("Phụ cấp");
					break;
				case "Kỹ thuật":
					lblThem.setText("Số dự án");
					break;
				case "Kinh doanh":
					lblThem.setText("Số sản phẩm");
					break;
				case "Lãnh đạo":
					lblThem.setVisible(false);
					txtThem.setVisible(false);
					break;
				}
			}
		});
		cbLoai.setModel(new DefaultComboBoxModel(new String[] {"", "Hành chính", "Kỹ thuật", "Kinh doanh", "Lãnh đạo"}));
		cbLoai.setBounds(146, 27, 141, 22);
		contentPane.add(cbLoai);
		
		JLabel lblNewLabel_1 = new JLabel("H\u1EC7 s\u1ED1 l\u01B0\u01A1ng");
		lblNewLabel_1.setBounds(10, 78, 92, 14);
		contentPane.add(lblNewLabel_1);
		
		txtHs = new JTextField();
		txtHs.setBounds(146, 75, 86, 20);
		contentPane.add(txtHs);
		txtHs.setColumns(10);
		
		
		txtThem = new JTextField();
		txtThem.setBounds(146, 136, 141, 20);
		contentPane.add(txtThem);
		txtThem.setColumns(10);
		
		JButton btnNewButton = new JButton("T\u00EDnh l\u01B0\u01A1ng");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int index = cbLoai.getSelectedIndex();
				int hs = Integer.parseInt(txtHs.getText());
				NhanVien nv;
				switch(index) {
				case -1:
					lblThem.setVisible(false);
					txtThem.setVisible(false);
					break;
				case 1:
					double pc = Integer.parseInt(txtThem.getText());
					nv = new  NhanVienHanhChinh(hs, pc);
					txtLuong.setText(String.valueOf(nv.tinhLuong()));
					break;
				case 2:
					int sda = Integer.parseInt(txtThem.getText());
					nv = new NhanVienKyThuat(hs, sda) ;
					txtLuong.setText(String.valueOf(nv.tinhLuong()));
					break;
					
				}
			}
		});
		btnNewButton.setBounds(146, 193, 110, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("L\u01B0\u01A1ng");
		lblNewLabel_2.setBounds(56, 268, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		txtLuong = new JTextField();
		txtLuong.setBounds(146, 265, 167, 20);
		contentPane.add(txtLuong);
		txtLuong.setColumns(10);
	}

}
