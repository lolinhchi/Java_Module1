package thuchanh.interfacee;

public class HCN implements HinhHoc {

	private int cd;
	private int cr;
	
	public HCN(int cd, int cr) {
		super();
		this.cd = cd;
		this.cr = cr;
	}

	public HCN() {
		super();
	}

	public int getCd() {
		return cd;
	}

	public void setCd(int cd) {
		this.cd = cd;
	}

	public int getCr() {
		return cr;
	}

	public void setCr(int cr) {
		this.cr = cr;
	}

	@Override
	public double chuVi() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double dienTich() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String tenHinh() {
		// TODO Auto-generated method stub
		return null;
	}

}
