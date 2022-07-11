package thuchanh;

public class LongCapTinh {

	static class Cong{
		private int a;
		private int b;
		public int getA() {
			return a;
		}
		public void setA(int a) {
			this.a = a;
		}
		public int getB() {
			return b;
		}
		public void setB(int b) {
			this.b = b;
		}
		public Cong(int a, int b) {
			super();
			this.a = a;
			this.b = b;
		}
		public Cong() {
			super();
		}
		public double tinh() {
			return a+b;
		}
	}
	public static void main(String[] args) {
		/*
		 * LongCapTinh lct = new LongCapTinh();
		 * LongCapTinh.Cong cong = lct.new Cong(1,2);
		 */
		Cong cong = new Cong(2, 3);
		double tong = cong.tinh();
		System.out.println("tong: "+tong);
	}
}

