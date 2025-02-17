import java.util.Scanner;

public class chuvidt {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Nhập chiều dài: ");
        double chieuDai = scanner.nextDouble();
        
        System.out.print("Nhập chiều rộng: ");
        double chieuRong = scanner.nextDouble();
        
        double chuVi = 2 * (chieuDai + chieuRong);
        double dienTich = chieuDai * chieuRong;

        System.out.println("Chu vi: " + chuVi);
        System.out.println("Diện tích: " + dienTich);
        //System.out.println("Cạnh nhỏ nhất: " + );

        scanner.close();

	}
}
