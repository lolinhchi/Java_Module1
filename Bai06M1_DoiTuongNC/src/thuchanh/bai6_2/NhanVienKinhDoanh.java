package thuchanh.bai6_2;

public class NhanVienKinhDoanh extends NhanVien {


	public NhanVienKinhDoanh() {
		super();
		// TODO Auto-generated constructor stub
	}

	public NhanVienKinhDoanh(int heSo) {
		super(heSo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double tinhLuong() {
		// TODO Auto-generated method stub
		return super.tinhLuong()+ super.tinhLuong()*0.1;
	}
}
