package thuchanh;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Nguoi {

	private String ht;
	private Date ns;
	private boolean gt;
	private static int soNguoi;
	
	public static int getSoNguoi() {
		return soNguoi;
	}
	static {
		soNguoi = 0;
	}
	public String getHt() {
		return ht;
	}
	public void setHt(String ht) {
		this.ht = ht;
	}
	public Date getNs() {
		return ns;
	}
	public void setNs(Date ns) {
		this.ns = ns;
	}
	public boolean getGt() {
		return gt;
	}
	public void setGt(boolean gt) {
		this.gt = gt;
	}
	public Nguoi(String ht, Date ns, boolean gt) {
		this.ht = ht;
		this.ns = ns;
		this.gt = gt;
		soNguoi++;
	}
	public Nguoi() {
		this.ht = null;
		this.ns = null;
		this.gt = false;
		soNguoi++;
	
	}
	public String xuat() {
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		return String.format("%s - %s - %s",this.ht,this.ns != null? df.format(this.ns) : null, this.gt );
	}
	
	
	
}
