package thuchanh;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DocGhiDataSanPham {
	public static void main(String[] args) throws IOException {
		String[] tenSp = {"Ban phim", "Man hinh", "Chuot"};
		int[] soLuong = {2, 3 ,4};
		double[] donGia = {400000, 1200000, 500000};
		
		System.out.println("Ghi data...");
		
		DataOutputStream dos = new DataOutputStream(new FileOutputStream("sanpham.dat", true));
		for(int i = 0;  i<3; i++) {
			dos.writeUTF(tenSp[i]);
			dos.writeInt(soLuong[i]);
			dos.writeDouble(donGia[i]);
		}
		dos.close();
		System.out.println("ghi xong");
		
		System.out.println("Doc data...");
		DataInputStream dis = new DataInputStream(new FileInputStream("sanpham.dat"));
		while(true) {
			try {
				String ten = dis.readUTF();
				int so = dis.readInt();
				double gia = dis.readDouble();
				System.out.println(String.format("%s - %d - %.2f", ten, so, gia));
			} catch (Exception e) {
				break;
			}
		}
		dis.close();
		System.out.println("Doc xong");
	}
}
