package thuchanh;

public class Phim {
	private String ten;
	private String theloai;
	private String ngayChieu;
	private String rap;
	private String hinh;
	
	public Phim(String ten, String theloai, String ngayChieu, String rap, String hinh) {
		this.ten = ten;
		this.theloai = theloai;
		this.ngayChieu = ngayChieu;
		this.rap = rap;
		this.hinh = hinh;
	}
	
	public Phim() {
	}

	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public String getTheloai() {
		return theloai;
	}
	public void setTheloai(String theloai) {
		this.theloai = theloai;
	}
	public String getNgayChieu() {
		return ngayChieu;
	}
	public void setNgayChieu(String ngayChieu) {
		this.ngayChieu = ngayChieu;
	}
	public String getRap() {
		return rap;
	}
	public void setRap(String rap) {
		this.rap = rap;
	}
	public String getHinh() {
		return hinh;
	}
	public void setHinh(String hinh) {
		this.hinh = hinh;
	}
	

}
