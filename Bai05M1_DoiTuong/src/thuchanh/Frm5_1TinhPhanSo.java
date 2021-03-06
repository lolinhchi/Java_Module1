package thuchanh;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Frm5_1TinhPhanSo extends JFrame {

	private JPanel contentPane;
	private JTextField txtTs1;
	private JTextField txtMs1;
	private JTextField txtMs2;
	private JTextField txtTs2;
	private JTextField txtKq;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frm5_1TinhPhanSo frame = new Frm5_1TinhPhanSo();
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
	public Frm5_1TinhPhanSo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 529, 302);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Phân số 1");
		lblNewLabel.setBounds(74, 30, 67, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblPhnS = new JLabel("Phân số 2");
		lblPhnS.setBounds(381, 30, 67, 14);
		contentPane.add(lblPhnS);
		
		JLabel lblNewLabel_1 = new JLabel("Tử số");
		lblNewLabel_1.setBounds(10, 65, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Mẫu số");
		lblNewLabel_1_1.setBounds(10, 107, 46, 14);
		contentPane.add(lblNewLabel_1_1);
		
		txtTs1 = new JTextField();
		txtTs1.setBounds(55, 62, 86, 20);
		contentPane.add(txtTs1);
		txtTs1.setColumns(10);
		
		txtMs1 = new JTextField();
		txtMs1.setColumns(10);
		txtMs1.setBounds(55, 104, 86, 20);
		contentPane.add(txtMs1);
		
		txtMs2 = new JTextField();
		txtMs2.setColumns(10);
		txtMs2.setBounds(362, 104, 86, 20);
		contentPane.add(txtMs2);
		
		JLabel lblNewLabel_1_2 = new JLabel("Tử số");
		lblNewLabel_1_2.setBounds(306, 65, 46, 14);
		contentPane.add(lblNewLabel_1_2);
		
		txtTs2 = new JTextField();
		txtTs2.setColumns(10);
		txtTs2.setBounds(362, 62, 86, 20);
		contentPane.add(txtTs2);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Mẫu số");
		lblNewLabel_1_1_1.setBounds(306, 107, 46, 14);
		contentPane.add(lblNewLabel_1_1_1);
		
		JComboBox cbTinh = new JComboBox();
		cbTinh.setModel(new DefaultComboBoxModel(new String[] {"+", "-", "*", ":"}));
		cbTinh.setBounds(218, 85, 46, 20);
		contentPane.add(cbTinh);
		
		JLabel lblNewLabel_2 = new JLabel("Kết quả");
		lblNewLabel_2.setBounds(10, 164, 57, 14);
		contentPane.add(lblNewLabel_2);
		
		txtKq = new JTextField();
		txtKq.setBounds(55, 161, 86, 20);
		contentPane.add(txtKq);
		txtKq.setColumns(10);
		
		JButton btnTinh = new JButton("Tính");
		btnTinh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int ts = 0;
					int ms = 1;
//					int ts1 = Integer.parseInt(txtTs1.getText());
//					int ms1 = Integer.parseInt(txtMs1.getText());
//					int ts2 = Integer.parseInt(txtTs2.getText());
//					int ms2 = Integer.parseInt(txtMs2.getText());
					
					/*
					 * if(cbTinh.getSelectedIndex() == -1) {
					 * JOptionPane.showMessageDialog(contentPane, "Vui lòng chọn phép tính!"); }else
					 * if(cbTinh.getSelectedIndex() == 0) { ts = ts1*ms2 + ts2*ms1; ms = ms1*ms2;
					 * txtKq.setText(ts + "/" + ms); }else if(cbTinh.getSelectedIndex()== 1) { ts =
					 * ts1*ms2 - ts2*ms1; ms = ms1*ms2; txtKq.setText(ts + "/" + ms); }else
					 * if(cbTinh.getSelectedIndex() == 2) { ts = ts1*ts2; ms = ms1*ms2;
					 * txtKq.setText(ts + "/" + ms); }else if(cbTinh.getSelectedIndex() == 3) { ts =
					 * ts1*ms2; ms = ms1*ts2; txtKq.setText(ts + "/" + ms); }
					 */
					PhanSo p1 = new PhanSo(txtTs1.getText(), txtMs1.getText());
					PhanSo p2 = new PhanSo(txtTs2.getText(), txtMs2.getText());
					PhanSo kq = new PhanSo();
					int phepToan = cbTinh.getSelectedIndex();
					switch(phepToan) {
					case 0:
						kq = p1.cong(p2);
						txtKq.setText(kq.xuat());
						break;
					case 1:
						kq = p1.tru(p2);
						txtKq.setText(kq.xuat());
						break;
					case 2:
						kq = p1.nhan(p2);
						txtKq.setText(kq.xuat());
						break;
					case 3:
						kq = p1.chia(p2);
						txtKq.setText(kq.xuat());
						break;
					case -1:
						JOptionPane.showMessageDialog(contentPane, "Vui lòng chọn phép tính!");
					}
				}catch (Exception e1) {
					JOptionPane.showMessageDialog(contentPane, "Vui lòng nhập đúng định dạng!");
				};
			}
		});
		btnTinh.setBounds(55, 207, 89, 23);
		contentPane.add(btnTinh);
		
		JButton btnLamlai = new JButton("Làm lại");
		btnLamlai.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtTs1.setText("");
				txtMs1.setText("");
				txtTs2.setText("");
				txtMs2.setText("");
				txtKq.setText("");
				cbTinh.setSelectedIndex(-1);
				
			}
		});
		btnLamlai.setBounds(359, 207, 89, 23);
		contentPane.add(btnLamlai);
	}
}
