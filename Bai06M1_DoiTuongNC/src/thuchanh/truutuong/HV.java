package thuchanh.truutuong;

public class HV extends HinhHoc {

	private int c;
	
	public HV(int c) {
		super();
		this.c = c;
	}

	public HV() {
		super();
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

	@Override
	public double chuVi() {
		// TODO Auto-generated method stub
		return 4*c;
	}

	@Override
	public double dienTich() {
		// TODO Auto-generated method stub
		return c*c;
	}
	@Override
	public String tenHinh() {
		// TODO Auto-generated method stub
		return "H�nh vu�ng";
	}

}
