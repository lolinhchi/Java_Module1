package thuchanh;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Hashtable;

public class VD2 {
	public static void main(String[] args) {
		System.out.println("Danh sách List");
		ArrayList ds1 = new ArrayList<>();
		ds1.add("abc");
		ds1.add(new Date());
		ds1.add(true);
		ds1.add(1.5);
		ds1.add("abc");
		for(Object ob : ds1) {
			System.out.println(ob.toString());
		}
		System.out.println("Danh sách Set");
		HashSet ds2 = new HashSet<>();
		ds2.add("abc");
		ds2.add(new Date());
		ds2.add(true);
		ds2.add(1.5);
		ds2.add("abc");
		for(Object ob : ds2) {
			System.out.println(ob.toString());
		}
		System.out.println("Danh sách Map");
		Hashtable td = new Hashtable<>();
		td.put(1, "mot");
		td.put(2, "hai");
		td.put(3, "ba");
		td.put(4, "bon");
		td.put(5, "nam");
		for(Object k:td.keySet()) {
			System.out.println(k + "->" + td.get(k));
		}
	}
}
