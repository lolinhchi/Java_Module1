package thuchanh;

import java.awt.EventQueue;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class FrmRenderImage extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmRenderImage frame = new FrmRenderImage();
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
	public FrmRenderImage() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {
				CellRender cr = new CellRender();
				table.getColumnModel().getColumn(2).setCellRenderer(cr);
				table.setRowHeight(80);
				table.repaint();
			}
		});
		/*
		 * addWindowListener(new WindowAdapter() {
		 * 
		 * @Override public void windowOpened(WindowEvent e) {
		 * table.getColumnModel().getColumn(2).setCellRenderer(new TableCellRenderer() {
		 * 
		 * @Override public Component getTableCellRendererComponent(JTable table, Object
		 * value, boolean isSelected, boolean hasFocus, int row, int column) { ImageIcon
		 * icon = new ImageIcon(value.toString()); JLabel lb = new JLabel();
		 * lb.setIcon(icon); return lb; } }); table.setRowHeight(80); table.repaint(); }
		 * });
		 */
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 514, 322);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 478, 183);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Ng\u01B0\u1EDDi", "123456852", "D:\\LoLinhChi_WorkSpace\\HinhAnh\\contact\\aodai2.jpg"},
				{"Ng\u01B0\u1EDDi 1", "0338442222", "D:\\LoLinhChi_WorkSpace\\HinhAnh\\contact\\aman.jpq"},
				{"Ng\u01B0\u1EDDi 2", "01234567", "D:\\LoLinhChi_WorkSpace\\HinhAnh\\contact\\aodai1.jpg"},
			},
			new String[] {
				"H\u1ECD t\u00EAn", "S\u0110T", "H\u00ECnh \u1EA3nh"
			}
		));
		scrollPane.setViewportView(table);
	}
}
