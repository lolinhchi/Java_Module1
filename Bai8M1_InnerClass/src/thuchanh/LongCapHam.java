package thuchanh;

import thuchanh.LopNgoai.LopTrong;

class LopNgoai2{
	private int a = 2;
	
	public void xuatNgoai() {
		int c = 4;
		class LopTrong{	//lop long cap ham
			private int b = 3;
			public void xuatTrong() {
				int d = 5 ;
				System.out.println(String.format("a = %d, b = %d, c = %d, d = %d",a,b, c, d));
			}
		}
		LopTrong lt = new LopTrong(); //tao doi tuong lop long cap ben trong ham
		lt.xuatTrong();
	}
	
}
public class LongCapHam {

	public static void main(String[] args) {
		LopNgoai2 ln2 = new LopNgoai2();
		ln2.xuatNgoai();
	}
}
