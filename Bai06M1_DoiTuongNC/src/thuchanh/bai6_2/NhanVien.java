package thuchanh.bai6_2;

public class NhanVien {

	private final double luongCoban = 1550000;
	private int heSo;
	public int getHeSo() {
		return heSo;
	}
	public void setHeSo(int heSo) {
		this.heSo = heSo;
	}
	public double getLuongCoban() {
		return luongCoban;
	}
	public NhanVien() {
		heSo = 0;
	}
	public NhanVien(int heSo) {
		this.heSo = heSo;
	}
	public double tinhLuong() {
		return luongCoban*heSo;
	}
	
}
