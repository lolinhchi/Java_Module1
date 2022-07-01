package thuchanh;

public class HT<T> {

	private T bk;

	public HT(T bk) {
		this.bk = bk;
	}
	public double chuVi() {
		double r = Double.parseDouble(bk.toString());
		return r*2*Math.PI;
	}
	public double dienTich() {
		double r = Double.parseDouble(bk.toString());
		return r*r*Math.PI;
	}
	public String xuat() {
		return String.format("Chu vi: %.2f, Diện tích: %.2f", chuVi(), dienTich());
	}
	public static void main(String[] args) {
		HT<Integer> ht1 = new HT<Integer>(5);
		System.out.println(ht1.xuat());
		HT<Float> ht2 = new HT<Float>(2.5f);
		System.out.println(ht2.xuat());
		HT<Double> ht3 = new HT<Double>(5.5);
		System.out.println(ht3.xuat());
		//
		HT ht = new HT<>(5);
		System.out.println(ht.xuat());
		
	}
	
}