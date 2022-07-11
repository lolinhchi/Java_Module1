package thuchanh;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class DocGhiASCII {

	public static void main(String[] args) throws FileNotFoundException {
		int[] a = {1, 13, 2, 4, 567, 43};
		
		System.out.println("Ghi tập tin...");
		PrintWriter pw = new PrintWriter(new FileOutputStream("mang.txt"));
		for(int so :a) {
			pw.printf("%d ", so );
		}
		pw.close();
		System.out.println("Ghi tập tin xong");
		
		System.out.println("Đọc tập tin...");
		Scanner sc = new Scanner(new FileInputStream("mang.txt"));
		int so;
		while(sc.hasNextInt()) {
			so = sc.nextInt();
			System.out.print(so + " ");
		}
		sc.close();
		System.out.println("\n Đọc tin xong");
	}
}
