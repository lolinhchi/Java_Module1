package thuchanh;

import java.awt.Component;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;
import java.awt.Image;

public class CellRender extends JLabel  implements TableCellRenderer {

	public CellRender() {
		super();
	}

	@Override
	public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus,
			int row, int column) {
		ImageIcon icon = new ImageIcon(value.toString());
		icon.setImage(icon.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT));
		setIcon(icon);
		
		return  this;
	}
	

}
