import java.util.Scanner;

public class DTB {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhập họ và tên: ");
        String hoTen = scanner.nextLine();
        
        System.out.print("Nhập điểm trung bình: ");
        double diemTB = scanner.nextDouble();
        
        System.out.println("Sinh viên: " + hoTen + "\nĐiểm trung bình: " + diemTB);
        
        scanner.close();
    }
}
