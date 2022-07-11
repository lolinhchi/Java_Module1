package thuchanh;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DocGhiDoiTuong {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		SanPham sp= new SanPham("May treo tuong", 2, 300000);
		System.out.println("Ghi doi tuong....");
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("sanpham.ojb"));
		oos.writeObject(sp);
		oos.close();
		System.out.println("Ghi xong");
		
		System.out.println("Doc doi tuong...");
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("sanpham.ojb"));
		SanPham sp2 = (SanPham) ois.readObject();
		System.out.println(sp2.xuat());
	}
}
