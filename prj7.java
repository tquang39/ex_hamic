import java.util.Scanner;

public class prj7 {

    public static double calculateLn1PlusX( double x) {
        double result = 0;
        final double EPSILON = Math.pow(10, -6);
        double term = x;
        for ( int i = 1; Math.abs(term) > EPSILON; i++) {
            result += term;
            term *= -x*i/(i+1);
        }
        return result;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x = input.nextDouble();
        input.close();

        System.out.println("ln(1 + x) ≈ " + calculateLn1PlusX(x));
    }
}
