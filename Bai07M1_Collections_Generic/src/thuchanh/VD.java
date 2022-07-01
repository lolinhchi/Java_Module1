package thuchanh;

import java.util.Arrays;

public class VD {

	public static void main(String[] args) {
		int[] a = {1,5,3,2,4};
		System.out.println(Arrays.toString(a));
		System.out.println("Thêm phần tử 6 vào cuối danh sách");
		a = Arrays.copyOf(a, a.length+1);
		a[a.length-1] = 6;
		System.out.println(Arrays.toString(a));
		System.out.println("Xóa phần tử 3 ở vị trí 2");
		int vt = 2;
		for(int i = vt; i<a.length-1; i++) {
			a[i] = a[i+1];
		}
		a = Arrays.copyOf(a, a.length-1);
		System.out.println(Arrays.toString(a));
		System.out.println("Chèn vào vị trí 2 phần tử 7");
		vt = 2;
		a = Arrays.copyOf(a,a.length+1);
		for(int i = a.length-1; i>vt; i--) {
			a[i] = a[i-1];
		}
		a[vt] = 7;
		System.out.println(Arrays.toString(a));
	}
}
