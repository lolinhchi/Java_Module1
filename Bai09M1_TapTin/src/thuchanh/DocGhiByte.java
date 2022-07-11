package thuchanh;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DocGhiByte {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("D:\\LoLinhChi_WorkSpace\\HinhAnh\\bmi.png");
		FileOutputStream fos = new FileOutputStream("sds.png");
		System.out.println("đang ghi tập tin...");
		int b;
		int soByte=0;
		while((b=fis.read()) != -1) {
			fos.write(b);
			soByte++;
		}
		fis.close();
		fos.close();
		System.out.println("Ghi xong");
		System.out.println("File có "+soByte+ " byte");
	}
}
