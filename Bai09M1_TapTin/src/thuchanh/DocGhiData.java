package thuchanh;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DocGhiData {
	public static void main(String[] args) throws IOException {
		int[] a = { 1, 13, 2, 4, 567, 43 };
		System.out.println("ghi data...");
		DataOutputStream dos = new DataOutputStream(new FileOutputStream("mang.dat"));
		for (int so : a) {
			dos.writeInt(so);
		}
		dos.close();

		System.out.println("Đọc xong");

		System.out.println("Đọc tt...");
		DataInputStream dis = new DataInputStream(new FileInputStream("mang.dat"));

		while (true) {
			
			try {
				int so = dis.readInt();
				System.out.print(so + " ");
			} catch (Exception e) {
				break;
			}
			
		}
		dis.close();
	}
}
