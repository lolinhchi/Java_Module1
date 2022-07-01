package thuchanh;

import java.util.Arrays;
import java.util.Random;

public class Vd1 {
	public static int[] mangDuong(int[] a) {
		int[] md = new int[0];
		for(int i=0; i<a.length; i++) {
			if(a[i] >=0) {
				md = Arrays.copyOf(md, md.length +1);
				md[md.length-1] = a[i];
			}
		}
		return md;
	}

	public static void main(String[] args) {
		int[] b = new int[20];
		Random rd = new Random();
		for (int i=0; i<b.length; i++) {
//			b[i] = rd.nextInt(21);//ngau nhien tu 0 - 21
			b[i]= rd.nextInt(41) - 20;
			
		}
		System.out.println("Mang b:");
		for(int i : b) {
			System.out.print(i +" ");
		}
		int[] mangDuong = mangDuong(b);
		System.out.println("mang so duong");
		System.out.println(Arrays.toString(mangDuong));
	}
}
