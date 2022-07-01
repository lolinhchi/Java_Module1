package thucHanh;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.Icon;

public class Chao_form extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8955550824168444542L;
	/**
	 * 
	 */
	
	private JPanel contentPane;
	private JTextField tentxt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Chao_form frame = new Chao_form();
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
	public Chao_form() {
		setResizable(false);
		setTitle("Chào");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 428, 465);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nh\u1EADp t\u00EAn");
		lblNewLabel.setBounds(36, 67, 54, 14);
		contentPane.add(lblNewLabel);
		
		tentxt = new JTextField();
		tentxt.setBounds(111, 60, 158, 28);
		contentPane.add(tentxt);
		tentxt.setColumns(10);
		
		JLabel lbl_chao = new JLabel("");
		lbl_chao.setBounds(36, 115, 297, 28);
		contentPane.add(lbl_chao);
		JButton btnNewButton = new JButton("Xu\u1EA5t l\u1EDDi ch\u00E0o");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ten = tentxt.getText();
				lbl_chao.setText("Xin chào " +ten+" đến với Lập trình viên Java");
			}
		});
		btnNewButton.setBounds(47, 189, 112, 28);
		contentPane.add(btnNewButton);
		
		JLabel lbl_icon = new JLabel((Icon) null, JLabel.CENTER);
		lbl_icon.setBounds(94, 238, 212, 177);
		contentPane.add(lbl_icon);
		
		JButton btnNewButton_1 = new JButton("Chọn file");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 JFileChooser fc = new JFileChooser();
				 fc.setDialogTitle("Chọn hình ảnh");
				 fc.setFileFilter(new FileNameExtensionFilter("*.jpg", "jpg"));
				 fc.setFileFilter(new FileNameExtensionFilter("*.png", "png"));
				 int chon = fc.showOpenDialog(contentPane);
				 if(chon == JFileChooser.APPROVE_OPTION) {
					 File file = fc.getSelectedFile();
					 ImageIcon icon = new ImageIcon(file.getAbsolutePath());
//					 icon.setImage(icon.getImage().getScaledInstance(lbl_icon.getWidth(), lbl_icon.getHeight()))
					 lbl_icon.setIcon(icon);
				 }
			}
		});
		btnNewButton_1.setBounds(236, 189, 89, 28);
		contentPane.add(btnNewButton_1);
		
		
		
		
	}
}
