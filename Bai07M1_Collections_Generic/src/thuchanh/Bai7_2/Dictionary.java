package thuchanh.Bai7_2;

public class Dictionary implements Comparable<Dictionary> {

	private String word;
	private String mean;
	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}
	public String getMean() {
		return mean;
	}
	public void setMean(String mean) {
		this.mean = mean;
	}
	public Dictionary(String word, String mean) {
		super();
		this.word = word;
		this.mean = mean;
	}
	@Override
	public int compareTo(Dictionary o) {
		// TODO Auto-generated method stub
		return this.word.compareTo(o.word);
	}
	
}
