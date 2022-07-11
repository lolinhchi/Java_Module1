package thuchanh;

import java.io.Serializable;

public class SanPham implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String tenSp;
	private int sl;
	private double donGia;
	public String getTenSp() {
		return tenSp;
	}
	public void setTenSp(String tenSp) {
		this.tenSp = tenSp;
	}
	public int getSl() {
		return sl;
	}
	public void setSl(int sl) {
		this.sl = sl;
	}
	public double getDonGia() {
		return donGia;
	}
	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}
	public SanPham(String tenSp, int sl, double donGia) {
		this.tenSp = tenSp;
		this.sl = sl;
		this.donGia = donGia;
	}
	public SanPham() {
		super();
	}
	public String xuat() {
		return String.format("%s - %d - %2f", tenSp, sl, donGia);
	}

	
}
