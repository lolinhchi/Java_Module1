package thucHanh;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.text.AttributeSet.ColorAttribute;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class CheckBox extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4420227606937972269L;
	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CheckBox frame = new CheckBox();
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
	public CheckBox() {
		setTitle("Checkbox-Radio");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 449, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel pn_soThich = new JPanel();
		pn_soThich.setBorder(new TitledBorder(null, "S\u1EDF Th\u00EDch", TitledBorder.LEADING, TitledBorder.TOP, null, Color.RED));
		pn_soThich.setBounds(43, 68, 148, 176);
		contentPane.add(pn_soThich);
		pn_soThich.setLayout(null);
		
		JCheckBox cb1 = new JCheckBox("Chơi game");
		cb1.setBounds(6, 29, 97, 23);
		pn_soThich.add(cb1);
		
		JCheckBox cb2 = new JCheckBox("Nghe nhạc");
		cb2.setBounds(6, 74, 97, 23);
		pn_soThich.add(cb2);
		
		JCheckBox cb3 = new JCheckBox("Du lịch");
		cb3.setBounds(6, 118, 97, 23);
		pn_soThich.add(cb3);
		
		JPanel pn_mauSac = new JPanel();
		pn_mauSac.setBorder(new TitledBorder(null, "M\u00E0u s\u1EAFc", TitledBorder.LEADING, TitledBorder.TOP, null, Color.RED));
		pn_mauSac.setBounds(257, 68, 148, 176);
		contentPane.add(pn_mauSac);
		pn_mauSac.setLayout(null);
		
		JRadioButton rdb1 = new JRadioButton("Màu đỏ");
		buttonGroup.add(rdb1);
		rdb1.setBounds(19, 27, 109, 23);
		pn_mauSac.add(rdb1);
		
		JRadioButton rdb2 = new JRadioButton("Màu lam");
		buttonGroup.add(rdb2);
		rdb2.setBounds(19, 72, 109, 23);
		pn_mauSac.add(rdb2);
		
		JRadioButton rdb3 = new JRadioButton("Màu vàng");
		buttonGroup.add(rdb3);
		rdb3.setBounds(19, 116, 109, 23);
		pn_mauSac.add(rdb3);
		
		JButton btnNewButton = new JButton("Xem");
		btnNewButton.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					String soThich="", mauSac="";
					if(cb1.isSelected()) {
							soThich = cb1.getText();
					}
					if(cb2.isSelected()) {
						soThich +=" + " + cb2.getText();
					}
					if(cb3.isSelected()){
						soThich += " + " + cb3.getText();
					}
						
					if(rdb1.isSelected()) {
						mauSac = rdb1.getText();
					}else if(rdb2.isSelected()) {
						mauSac = rdb2.getText();
					}else {
						mauSac = rdb3.getText();
					}
					
					JOptionPane.showMessageDialog(contentPane, "Sở thích của bạn là: "+ soThich+ " Màu sắc bạn ưa thích: "+mauSac);
					}
				}
			}
		);
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnNewButton.setForeground(Color.red);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnNewButton.setForeground(Color.black);
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String soThich="", mauSac="";
			if(cb1.isSelected()) {
					soThich = cb1.getText();
			}
			if(cb2.isSelected()) {
				soThich +=" + " + cb2.getText();
			}
			if(cb3.isSelected()){
				soThich += " + " + cb3.getText();
			}
				
			if(rdb1.isSelected()) {
				mauSac = rdb1.getText();
			}else if(rdb2.isSelected()) {
				mauSac = rdb2.getText();
			}else {
				mauSac = rdb3.getText();
			}
			
			JOptionPane.showMessageDialog(contentPane, "Sở thích của bạn là: "+ soThich+ " Màu sắc bạn ưa thích: "+mauSac);
			}
		});
		btnNewButton.setBackground(SystemColor.inactiveCaption);
		btnNewButton.setBounds(169, 290, 89, 33);
		contentPane.add(btnNewButton);
	}
}
