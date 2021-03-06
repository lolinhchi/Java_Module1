package thuchanh;

import java.util.Date;

public class HocSinh extends Nguoi {

	private String tr;
	private String lp;
	public HocSinh() {
		super();
	}
	public HocSinh(String ht, Date ns, boolean gt, String tr, String lp) {
		super(ht, ns, gt);
		this.tr = tr;
		this.lp = lp;
	}
	public String getTr() {
		return tr;
	}
	public void setTr(String tr) {
		this.tr = tr;
	}
	public String getLp() {
		return lp;
	}
	public void setLp(String lp) {
		this.lp = lp;
	}
	public String xuat() {
		return String.format("%s - %s - %s", super.xuat(), this.tr, this.lp);
	}
	
}
