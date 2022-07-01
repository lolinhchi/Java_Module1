package thuchanh;

public class Vd2 {

	private static String doc1so(int so) {
		String[] msc = {"khong" , "mot", "hai", "ba", "bon", "nam", "sau", "bay", "tam"};
		return msc[so];
	}
	private static boolean namNhuan(int nam) {
		if(nam % 400 ==0 || (nam % 4 ==0 && nam % 100 !=0)) {
			return true;
		}
		return false;
	}
	private static int soNgayTrongThang(int t, int n) {
		int[] msn  = {31, namNhuan(n) ? 29:28, 31,30,31,30,31,31,30,31,30,31};
		return msn[t-1];
	}
	public static void main(String[] args) {
		System.out.println("So 3 doc la "+ doc1so(3)  );
		System.out.println("So 5 doc la "+ doc1so(5)  );
		System.out.println("So ngay trong thang 2 nam 2012 la: "+ soNgayTrongThang(2, 2022));
	}
}
