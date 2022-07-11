package thuchanh.Bai8_2;

public class Qua {

	private String hinhDang;
	private String mau;
	private String ten;
	private int trongLuong;
	public String getHinhDang() {
		return hinhDang;
	}
	public void setHinhDang(String hinhDang) {
		this.hinhDang = hinhDang;
	}
	public String getMau() {
		return mau;
	}
	public void setMau(String mau) {
		this.mau = mau;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public int getTrongLuong() {
		return trongLuong;
	}
	public void setTrongLuong(int trongLuong) {
		this.trongLuong = trongLuong;
	}
	public Qua(String hinhDang, String mau, String ten, int trongLuong) {
		this.hinhDang = hinhDang;
		this.mau = mau;
		this.ten = ten;
		this.trongLuong = trongLuong;
	}
	public Qua() {
	}
	public double tinhPhi() {
		return 10000 + 200*this.trongLuong;
	}
	@Override
	public String toString() {
		String chuoi = "Hộp quà: Có hình: " + hinhDang + "\nvà giấy bao màu: " + mau + ",\nphí làm hộp: 10000"
				+ "\nBên trong đựng quà:\n" + ten + "\ncó trọng lượng " + trongLuong + "g\nTiền gửi quà: "
				+ tinhPhi();
		return chuoi;
	}
	
}
