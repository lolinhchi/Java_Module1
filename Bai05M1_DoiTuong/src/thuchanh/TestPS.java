package thuchanh;

public class TestPS {
	public static void main(String[] args) {
		PhanSo a, b, c;
		a = new PhanSo(1, 2);
		b = new PhanSo(2, 3);
		c = a.cong(b);
		System.out.println(c.xuat());
		System.out.println("Phân số c:" + c.getTs() + "/" + c.getMs());
		//
		
	}

}
