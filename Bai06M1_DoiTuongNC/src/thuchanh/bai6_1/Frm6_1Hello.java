package thuchanh.bai6_1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Frm6_1Hello extends JFrame {

	private JPanel contentPane;
	private JTextField txtTen;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frm6_1Hello frame = new Frm6_1Hello();
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
	public Frm6_1Hello() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 574, 484);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtTen = new JTextField();
		txtTen.setBounds(87, 42, 127, 20);
		contentPane.add(txtTen);
		txtTen.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setBounds(31, 45, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblAnimal = new JLabel("Animal");
		lblAnimal.setBounds(31, 108, 46, 14);
		contentPane.add(lblAnimal);
		
		JComboBox cbLoai = new JComboBox();
		cbLoai.setModel(new DefaultComboBoxModel(new String[] {"Dog", "Cat", "Pig"}));
		cbLoai.setBounds(87, 104, 87, 22);
		contentPane.add(cbLoai);
		
		JLabel lblHello = new JLabel("Hello");
		lblHello.setBounds(31, 233, 243, 43);
		contentPane.add(lblHello);
		
		JLabel lblHinh = new JLabel("H\u00ECnh");
		lblHinh.setBounds(302, 45, 220, 209);
		contentPane.add(lblHinh);
		JButton btnNewButton = new JButton("Say Hello");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ten = txtTen.getText();
				String loai = cbLoai.getSelectedItem().toString();
				switch(loai) {
				case "Dog":
					Dog dog = new Dog(ten, "D:/LoLinhChi_WorkSpace/HinhAnh/1_dog.png");
					lblHello.setText(ten + " says " + dog.sayHello());
					lblHinh.setText("");
					lblHinh.setIcon(new ImageIcon(dog.getImage()));
					break;
				case "Cat":
					Cat cat = new Cat(ten, "D:/LoLinhChi_WorkSpace/HinhAnh/1_cat.png");
					lblHello.setText(ten + " says " + cat.sayHello());
					lblHinh.setText("");
					lblHinh.setIcon(new ImageIcon(cat.getImage()));
					break;
				case "Pig":
					Pig pig = new Pig(ten, "D:/LoLinhChi_WorkSpace/HinhAnh/1_pig.png");
					lblHello.setText(ten + " says " + pig.sayHello());
					lblHinh.setText("");
					lblHinh.setIcon(new ImageIcon(pig.getImage()));
					break;
				}
			}
		});
		btnNewButton.setBounds(125, 169, 89, 23);
		contentPane.add(btnNewButton);
		
		
	}
}
