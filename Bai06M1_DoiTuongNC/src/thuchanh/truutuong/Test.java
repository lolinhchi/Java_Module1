package thuchanh.truutuong;

public class Test {

	public static void main(String[] args) {
		HinhHoc[] hh = new HinhHoc[3];
		hh[0] = new HCN(2,3);
		hh[1] = new HT(2);
		hh[2] = new HV(3);
		for(HinhHoc h : hh) {
			System.out.println(h.tenHinh() + " Chu vi: " + h.chuVi() + " Diện tích: "+ h.dienTich() + "\n");
		}
	
	}
}
