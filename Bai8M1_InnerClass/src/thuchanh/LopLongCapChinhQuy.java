package thuchanh;

class LopNgoai{
	private int a = 2;
	class LopTrong{	//lop long cap chinh quy
		private int b = 3;
		public void xuatTrong() {
			int c = 4 ;
			System.out.println(String.format("a = %d, b = %d, c = %d",a,b, c));
		}
	}
	public void xuatNgoai() {
		LopTrong lt = new LopTrong();	//tao doi tuong lop long cap ben trong lop ngoai
		lt.xuatTrong();
	}
}
public class LopLongCapChinhQuy {

	public static void main(String[] args) {
		LopNgoai ln = new LopNgoai();
		ln.xuatNgoai();
		
		
		LopNgoai.LopTrong lt = ln.new LopTrong();	// tao doi tuong lop long cap ben ngoai lop ngoai
		lt.xuatTrong();
	}
}
