package thuchanh.bai6_2;

public class NhanVienLanhDao extends NhanVien {

	private int ssp;
	

	public int getSsp() {
		return ssp;
	}

	public void setSsp(int ssp) {
		this.ssp = ssp;
	}

	public NhanVienLanhDao() {
		super();
		// TODO Auto-generated constructor stub
	}

	public NhanVienLanhDao(int heSo) {
		super(heSo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double tinhLuong() {
		// TODO Auto-generated method stub
		return super.tinhLuong()+ ssp*200000;
	}
}
