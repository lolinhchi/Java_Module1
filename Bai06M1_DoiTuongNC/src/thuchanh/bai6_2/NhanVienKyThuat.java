package thuchanh.bai6_2;

public class NhanVienKyThuat extends NhanVien {

	private int sda; 
	
	public int getSda() {
		return sda;
	}

	public void setSda(int sda) {
		this.sda = sda;
	}

	public NhanVienKyThuat() {
		super();
		// TODO Auto-generated constructor stub
	}

	public NhanVienKyThuat(int heSo, int sda) {
		super(heSo);
		this.sda = sda;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double tinhLuong() {
		// TODO Auto-generated method stub
		return super.tinhLuong()+ sda*1000000;
	}
}
