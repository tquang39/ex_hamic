import java.util.Scanner;

public class inde {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số thực x (|x| < π/6): ");
        double x = scanner.nextDouble();
        System.out.println("sin(x) ≈ " + calculateSin(x));
        scanner.close();
    }

    public static double calculateSin(double x) {
        final int N = 10; // Số hạng của chuỗi Taylor
        double sin = 0;
        double term = x;
        int factorial = 1;

        for (int i = 1; i <= N; i++) {
            if (i % 2 != 0) {
                sin += term;
            } else {
                sin -= term;
            }
            term *= x * x;
            factorial *= 2 * i * (2 * i + 1);
            term /= factorial;
        }
        return sin;
    }
}
