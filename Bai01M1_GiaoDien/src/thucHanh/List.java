package thucHanh;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class List extends JFrame {

	private JPanel contentPane;
	private JTextField indextxt;
	private JTextField monantxt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					List frame = new List();
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
	public List() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 462, 565);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Các món ăn");
		lblNewLabel.setBounds(28, 50, 73, 20);
		contentPane.add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(28, 75, 99, 105);
		contentPane.add(scrollPane);
		
		JList list_1 = new JList();
		list_1.setModel(new AbstractListModel() {
			String[] values = new String[] {"Cơm gà", "Khô gà", "Gà rán", "Cơm chiêng", "Pizza", "trà sữa", "sữa tươi", "Kem cheese ", "Kem chuối"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		scrollPane.setViewportView(list_1);
		
		JButton btnNewButton = new JButton("Xem");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int index;
				String tenMon="";
				index = list_1.getSelectedIndex();
				if(index != -1) {
					tenMon = list_1.getSelectedValue().toString();
				}
				indextxt.setText(String.valueOf(index));
				monantxt.setText(tenMon);
				
			}
		});
		btnNewButton.setBounds(153, 114, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Index");
		lblNewLabel_1.setBounds(265, 77, 36, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Món ăn");
		lblNewLabel_1_1.setBounds(254, 145, 47, 20);
		contentPane.add(lblNewLabel_1_1);
		
		indextxt = new JTextField();
		indextxt.setBounds(311, 74, 86, 20);
		contentPane.add(indextxt);
		indextxt.setColumns(10);
		
		monantxt = new JTextField();
		monantxt.setColumns(10);
		monantxt.setBounds(311, 145, 86, 20);
		contentPane.add(monantxt);
		
		JLabel lblNewLabel_2 = new JLabel("Tháng");
		lblNewLabel_2.setBounds(51, 291, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(51, 316, 89, 152);
		contentPane.add(scrollPane_1);
		
		JList list = new JList();
		list.setVisibleRowCount(6);
		scrollPane_1.setViewportView(list);
		
		JButton btnNewButton_1 = new JButton("Phát sinh");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultListModel<String> model = new DefaultListModel<>();
				for(int i = 1; i<=12; i++) {
					model.addElement("Tháng" + i);
				}
				list.setModel(model);
			}
		});
		btnNewButton_1.setBounds(153, 374, 89, 23);
		contentPane.add(btnNewButton_1);
	}
}
