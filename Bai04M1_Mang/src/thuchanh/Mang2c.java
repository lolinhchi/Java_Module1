package thuchanh;

import java.util.Arrays;
import java.util.Random;

public class Mang2c {

	public static void main(String[] args) {
		double[][] b = new double[4][5];
		Random rd = new Random();
		for(int i =0; i<b.length; i++) {
			for (int j = 0; j<b[i].length;j++) {
				b[i][j] = rd.nextDouble()*41 - 20;
			}
		}
		for (int i= 0; i<b.length; i++) {
			System.out.println(Arrays.toString(b[i]));
		}
		System.out.println("ss tang dan tren tung dong");
		for(int i=0; i<b.length; i++) {
			Arrays.sort(b[i]);
			System.out.println(Arrays.toString(b[i]));
		}

}
}
