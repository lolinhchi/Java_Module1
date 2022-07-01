package thucHanh;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class Table extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField txtHoten;
	private JTextField txtDienthoai;
	private JTextField txtHinh;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Table frame = new Table();
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
	public Table() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 453, 488);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(46, 28, 336, 195);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setColumnSelectionAllowed(true);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"H\u1ECD T\u00EAn", "\u0110i\u1EC7n Tho\u1EA1i", "H\u00ECnh \u1EA3nh"
			}
		));
		scrollPane.setViewportView(table);
		
		JLabel lblNewLabel = new JLabel("Họ tên");
		lblNewLabel.setBounds(52, 258, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblinThoi = new JLabel("Điện thoại");
		lblinThoi.setBounds(52, 300, 57, 14);
		contentPane.add(lblinThoi);
		
		JLabel lblNewLabel_1_1 = new JLabel("Hình ảnh");
		lblNewLabel_1_1.setBounds(46, 348, 52, 14);
		contentPane.add(lblNewLabel_1_1);
		
		txtHoten = new JTextField();
		txtHoten.setBounds(117, 255, 113, 20);
		contentPane.add(txtHoten);
		txtHoten.setColumns(10);
		
		txtDienthoai = new JTextField();
		txtDienthoai.setColumns(10);
		txtDienthoai.setBounds(117, 297, 113, 20);
		contentPane.add(txtDienthoai);
		
		txtHinh = new JTextField();
		txtHinh.setColumns(10);
		txtHinh.setBounds(117, 342, 113, 20);
		contentPane.add(txtHinh);
		
		JButton btnNewButton = new JButton("Thêm mới");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ht, dt, ha;
				ht = txtHoten.getText().toString();
				dt = txtDienthoai.getText().toString();
				ha = txtHinh.getText().toString();
//				DefaultTableModel model = new DefaultTableModel();
//				table.setModel(model);
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new String[] {ht, dt, ha});
			}
		});
		btnNewButton.setBounds(293, 296, 100, 20);
		contentPane.add(btnNewButton);
	}
}
