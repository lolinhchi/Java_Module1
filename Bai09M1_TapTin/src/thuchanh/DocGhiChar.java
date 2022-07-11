package thuchanh;

import java.io.FileReader;
import java.io.FileWriter;

public class DocGhiChar {

	public static void main(String[] args) {
		String s = "Trung tâm tin học Đại học Khoa học Tự Nhiên";
		System.out.println("Ghi tập tin Unicode");
		try (FileWriter fw = new FileWriter("test.txt")){
			fw.write(s);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("đã ghi xong");
		
		System.out.println("Đọc tập tin Unicode");
		int b;
		try(FileReader fr = new FileReader("test.txt")) {
			while((b = fr.read()) != -1){
				System.out.print((char)b);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("\nĐọc xong tt");
	}
}
