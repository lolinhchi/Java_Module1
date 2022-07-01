package thuchanh;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;

public class FrmTongMang extends JFrame {

	private JPanel contentPane;
	private JTextField txtN;
	private JTextField txtTong;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmTongMang frame = new FrmTongMang();
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
	public FrmTongMang() {
		setTitle("T\u00EDnh t\u1ED5ng c\u00E1c ph\u1EA7n t\u1EED trong m\u1EA3ng");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 325);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nh\u1EADp n");
		lblNewLabel.setBounds(10, 32, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblMngcPht = new JLabel("M\u1EA3ng \u0111\u01B0\u1EE3c ph\u00E1t sinh");
		lblMngcPht.setBounds(10, 80, 116, 14);
		contentPane.add(lblMngcPht);
		
		JLabel lblTng = new JLabel("T\u1ED5ng");
		lblTng.setBounds(10, 234, 46, 14);
		contentPane.add(lblTng);
		
		txtN = new JTextField();
		txtN.setBounds(137, 29, 86, 20);
		contentPane.add(txtN);
		txtN.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(136, 80, 192, 131);
		contentPane.add(scrollPane);
		
		JTextArea txtArea = new JTextArea();
		txtArea.setLineWrap(true);
		scrollPane.setViewportView(txtArea);
		
		txtTong = new JTextField();
		txtTong.setColumns(10);
		txtTong.setBounds(137, 231, 86, 20);
		contentPane.add(txtTong);
		
		JButton btnNewButton = new JButton("T\u00EDnh t\u1ED5ng");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n = Integer.parseInt(txtN.getText().toString());
				//tao mang
				int[] mang = new int[n];
				Random rd = new Random();
				for(int i=0; i<mang.length; i++) {
					mang[i] = rd.nextInt(100);
				}
				//tinh tong
				int sum = 0;
				for(int i=0; i<mang.length; i++) {
					sum += mang[i];
				}
				//in mang
				String cMang = "";
				for(int i : mang) {
					cMang += i + " ";
				}
				txtArea.setText(cMang);
				//in tong
				txtTong.setText(Integer.toString(sum));
				
			}
		});
		btnNewButton.setBounds(338, 138, 89, 23);
		contentPane.add(btnNewButton);
	}
}
