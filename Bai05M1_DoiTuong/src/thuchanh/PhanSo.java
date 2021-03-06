package thuchanh;

public class PhanSo {

	private int ts; 
	private int ms;
	public PhanSo() {
		ts = 0;
		ms = 1;
	}
	public PhanSo(String ts, String ms) throws NumberFormatException, Exception {
		this.ts = Integer.parseInt(ts);
		setMs(Integer.parseInt(ms));
	}
	public PhanSo(int ts, int ms) {
		this.ts  = ts;
		this.ms  =ms;
	}
	public int getTs() {
		return ts;
	}
	public void setTs(int ts) {
		this.ts = ts;
	}
	public int getMs() {
		return ms;
	}
	public void setMs(int ms) throws Exception {
		if(ms != 0) {
			this.ms = ms;
		}else {
			throw new Exception("Mẫu số bằng 0!");
		}
	}
	//xu ly
	public PhanSo cong(PhanSo p) {
		PhanSo k = new PhanSo();
		k.ts = this.ts * p.ms + p.ts*this.ms;
		k.ms = this.ms * p.ms;
		return k;
	}
	public PhanSo tru(PhanSo p) {
		PhanSo k = new PhanSo();
		k.ts = this.ts * p.ms - p.ts*this.ms;
		k.ms = this.ms * p.ms;
		return k;
	}
	public PhanSo nhan(PhanSo p) {
		PhanSo k = new PhanSo();
		k.ts = this.ts * p.ts;
		k.ms = this.ms * p.ms;
		return k;
	}
	public PhanSo chia(PhanSo p) {
		PhanSo k = new PhanSo();
		k.ts = this.ts * p.ms;
		k.ms = this.ms * p.ts;
		return k;
	}
	public String xuat() {
		return this.ts + "/" + this.ms;
	}
}
