package thuchanh;

public class CD {
	private String maCD;
	private String tenCD;
	private String caSi;
	private String soBh;
	private int gia;
	public String getMaCD() {
		return maCD;
	}
	public void setMaCD(String maCD) {
		this.maCD = maCD;
	}
	public String getTenCD() {
		return tenCD;
	}
	public void setTenCD(String tenCD) {
		this.tenCD = tenCD;
	}
	public String getCaSi() {
		return caSi;
	}
	public void setCaSi(String caSi) {
		this.caSi = caSi;
	}
	public String getSoBh() {
		return soBh;
	}
	public void setSoBh(String soBh) {
		this.soBh = soBh;
	}
	public int getGia() {
		return gia;
	}
	public void setGia(int gia) {
		this.gia = gia;
	}
	public CD(String maCD, String tenCD, String caSi, String soBh, int gia) {
		super();
		this.maCD = maCD;
		this.tenCD = tenCD;
		this.caSi = caSi;
		this.soBh = soBh;
		this.gia = gia;
	}
	@Override
	public String toString() {
		return  maCD + " - " + tenCD + " - " + caSi + " - " + soBh + " - " + gia + "\n";
	}
	

}
