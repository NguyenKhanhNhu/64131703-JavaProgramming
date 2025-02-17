import java.util.Scanner;

public class delta {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập a: ");
        double a = scanner.nextDouble();

        System.out.print("Nhập b: ");
        double b = scanner.nextDouble();

        System.out.print("Nhập c: ");
        double c = scanner.nextDouble();
        
        double delta = Math.pow(b, 2) - 4 * a * c;
        double canDelta = Math.sqrt(Math.abs(delta));

        System.out.println("delta: " + delta);
        System.out.println("Căn delta: " + canDelta);

        scanner.close();
	}
}
