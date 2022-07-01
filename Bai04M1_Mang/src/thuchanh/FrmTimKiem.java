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
import java.util.Arrays;
import java.util.Random;
import java.awt.event.ActionEvent;

public class FrmTimKiem extends JFrame {

	private JPanel contentPane;
	private JTextField txtN;
	private JTextField txtX;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmTimKiem frame = new FrmTimKiem();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	private int timX(int x, int[] m) {
		int vitri = -1;
		for(int i=0; i<m.length; i++) {
			if(x == m[i]) {
				vitri = i;
				break;
			}
		}
		return vitri;
	}
	private boolean ssX(int x, int[] m) {
		boolean flag = true;
		for(int i = 0; i<m.length;i++) {
			if(m[i] > x) {
				flag = false;
				break;
			}
		}
		return flag;
	}
	private int[] lonHonX(int x, int[] m) {
		int[] mLon = new int[0];
		for(int i=0; i<m.length; i++) {
			if(m[i] > x) {
				mLon = Arrays.copyOf(mLon, mLon.length +1);
				mLon[mLon.length -1] = m[i];
			}
		}
		return mLon;
	}
	public FrmTimKiem() {
		setTitle("T\u00EDnh t\u1ED5ng v\u00E0 t\u00ECm ki\u1EBFm tromg m\u1EA3ng");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 462, 524);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nh\u1EADp n");
		lblNewLabel.setBounds(10, 27, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNhpX = new JLabel("Nh\u1EADp x");
		lblNhpX.setBounds(10, 74, 46, 14);
		contentPane.add(lblNhpX);
		
		JLabel lblMngPhtSinh = new JLabel("M\u1EA3ng ph\u00E1t sinh");
		lblMngPhtSinh.setBounds(10, 130, 90, 14);
		contentPane.add(lblMngPhtSinh);
		
		JLabel lblKtQuTm = new JLabel("K\u1EBFt qu\u1EA3 t\u00ECm ki\u1EBFm");
		lblKtQuTm.setBounds(10, 280, 97, 14);
		contentPane.add(lblKtQuTm);
		
		txtN = new JTextField();
		txtN.setBounds(117, 24, 86, 20);
		contentPane.add(txtN);
		txtN.setColumns(10);
		
		txtX = new JTextField();
		txtX.setColumns(10);
		txtX.setBounds(117, 71, 86, 20);
		contentPane.add(txtX);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(119, 130, 239, 119);
		contentPane.add(scrollPane);
		
		JTextArea txtAreaMang = new JTextArea();
		txtAreaMang.setLineWrap(true);
		scrollPane.setViewportView(txtAreaMang);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(117, 280, 239, 119);
		contentPane.add(scrollPane_1);
		
		JTextArea txtAreaTim = new JTextArea();
		txtAreaTim.setLineWrap(true);
		scrollPane_1.setViewportView(txtAreaTim);
		
		JButton btnNewButton = new JButton("T\u00ECm ki\u1EBFm");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n = Integer.parseInt(txtN.getText().toString());
				int x = Integer.parseInt(txtX.getText().toString());
				//phat sing mang
				int[] mang = new int[n];
				Random rd = new Random();
				for(int i=0; i<mang.length; i++) {
					mang[i] = rd.nextInt(100);
				}
				String cMang = "";
				for(int i=0; i<mang.length; i++) {
					cMang += mang[i] + " ";
				}
				txtAreaMang.setText(cMang);
				//tim kiem
				int vitri = timX(x, mang);
				if(vitri != -1) {
					StringBuilder txtTim = new StringBuilder("x xuất hiện trong mảng ở vị trí đầu tiên là "+ Integer.toString(vitri));
					if(ssX(x, mang)) {
						txtTim.append("\n x lớn hơn tất cả các phần tử trong mảng");
						
					}else {
						txtTim.append("x không lớn hơn tất cả \n");
						txtTim.append("x nhỏ hơn " + Arrays.toString(lonHonX(x, mang)));
					}
					txtAreaTim.setText(txtTim.toString());
				}else {
					txtAreaTim.setText("x = " + x + " không xuất hiện trong mảng");
				}
				
				
				
			}
		});
		btnNewButton.setBounds(183, 432, 89, 23);
		contentPane.add(btnNewButton);
	}

}
