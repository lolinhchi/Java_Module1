package thuchanh;

interface PhepTinh{
	public double tinh(int a, int b);
}
//Cach 1: cach chinh thong
class Cong implements PhepTinh{

	@Override
	public double tinh(int a, int b) {
		return (double)a+b;
	}
	
}
public class LongCapVoDanh {

	public static void main(String[] args) {
		
		int a= 5, b=4;
		double tong, hieu, tich, thuong;
		Cong cong = new Cong();
		tong = cong.tinh(a, b);
		System.out.println("tong: " + tong);
		
		//Cach 2: Long cap vo danh
		PhepTinh tru = new PhepTinh() {
			
			@Override
			public double tinh(int a, int b) {
				return a-b;
			}
		};
		hieu = tru.tinh(a, b);
		System.out.println("Hieu: "+hieu);
		
		PhepTinh nhan  =new PhepTinh() {
			
			@Override
			public double tinh(int a, int b) {
				// TODO Auto-generated method stub
				return a*b;
			}
		};
		tich = nhan.tinh(a, b);
		System.out.println("Tich: "+tich);
		
		PhepTinh chia = new PhepTinh() {
			
			@Override
			public double tinh(int a, int b) {
				// TODO Auto-generated method stub
				return a/b;
			}
		};
		thuong = chia.tinh(a, b);
		System.out.println("Thuong: "+thuong);
	}
}
