package thuchanh;

import java.util.Date;

public class Test {

	public static void main(String[] args) {
		HocSinh hs = new HocSinh();
		System.out.println(hs.xuat());
		HocSinh hs1  = new HocSinh("Lo Linh Chi", new Date(), false, "DHSP", "CNTTA");
		System.out.println(hs1.xuat());
		
		System.out.println("Số người:" + Nguoi.getSoNguoi());
	}
}
