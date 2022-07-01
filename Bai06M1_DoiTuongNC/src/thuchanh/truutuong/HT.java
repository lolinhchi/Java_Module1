package thuchanh.truutuong;

public class HT extends HinhHoc {

	private int bk;
	
	public int getBk() {
		return bk;
	}

	public void setBk(int bk) {
		this.bk = bk;
	}

	
	public HT(int bk) {
		super();
		this.bk = bk;
	}

	public HT() {
		super();
	}

	@Override
	public double chuVi() {
		// TODO Auto-generated method stub
		return 2*bk*Math.PI;
	}

	@Override
	public double dienTich() {
		// TODO Auto-generated method stub
		return bk*bk*Math.PI;
	}
	@Override
	public String tenHinh() {
		// TODO Auto-generated method stub
		return "H�nh tr�n";
	}

}
