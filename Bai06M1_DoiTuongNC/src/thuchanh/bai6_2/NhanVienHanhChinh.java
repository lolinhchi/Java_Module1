package thuchanh.bai6_2;

public class NhanVienHanhChinh extends NhanVien {

	private double pc;
	
	public double getPc() {
		return pc;
	}

	public void setPc(double pc) {
		this.pc = pc;
	}

	public NhanVienHanhChinh() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public NhanVienHanhChinh(int heSo, double pc) {
		super(heSo);
		this.pc = pc;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double tinhLuong() {
		return super.tinhLuong() + pc;
	}
	
}
