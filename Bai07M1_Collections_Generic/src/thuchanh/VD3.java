package thuchanh;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class VD3 {

	public static void main(String[] args) {
		List<Integer> ds1 = new ArrayList<Integer>();
		ds1.add(1);
		ds1.add(5);
		ds1.add(8);
		ds1.add(4);
		ds1.add(3);
		System.out.println("Danh sách List<Integer>");
		for(Integer i:ds1) {
			System.out.print(i+" ");
		}
		
		Set<String> ds2 = new HashSet<String>();
		ds2.add("mai");
		ds2.add("lan");
		ds2.add("hue");
		ds2.add("dao");
		ds2.add("cuc");
		System.out.println("\nDanh sách Set<String>");
		for(String s:ds2) {
			System.out.print(s + " ");
		}
		
		Map<Integer, String> ds3 = new TreeMap<Integer, String>();
		ds3.put(1, "mot");
		ds3.put(2, "hai");
		ds3.put(3, "ba");
		ds3.put(4, "bon");
		ds3.put(5, "nam");
		System.out.println("\nDanh sách Map<Int, String>");
		for(Integer k:ds3.keySet()) {
			System.out.print(k + "->" + ds3.get(k));
		}
		
	}
	
}
