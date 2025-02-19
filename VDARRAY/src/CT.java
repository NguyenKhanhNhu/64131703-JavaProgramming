import java.util.ArrayList;

public class CT {

	public static void main(String[] args) {
		//Khai bao ds san pham
		ArrayList<SanPham> dsSanPham;
		//Xin moi
		dsSanPham = new ArrayList<SanPham>() ;
		
		//Nhap 3 san pham
		SanPham sp1 = new SanPham(0, "Kem", "Gỉai khát", null);
		SanPham sp2 = new SanPham(1, "Cơm", "Đồ ăn", null);
		SanPham sp3 = new SanPham(2, "Phở", "Đồ ăn", null);

		//Thêm vào ArrayList
		dsSanPham.add(sp1);
		dsSanPham.add(sp2);
		dsSanPham.add(sp3);
		
//		for (SanPham x: dsSanPham)
//			System.out.println(x.toString());
		
		for (int i = 0; i<dsSanPham.size(); i++) {
			SanPham sp = dsSanPham.get(i);
			System.out.println(sp.toString());
		}
	}

}
