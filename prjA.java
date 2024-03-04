import java.util.Scanner;

public class prjA {

    // cau a
    public static boolean isPrimeNumber(int n) {
        if ( n < 2) {
            return false;
        }
            for ( int i = 2; i <= (int)Math.sqrt(n); i++) {
                if ( n % i == 0) {
                    return false;
                }
            }   
       
        return true;
    }

    // cau b
    public static boolean isPerfectNumber( int n) {
        int sum = 1;
        for ( int i = 2; i < n; i++) {
            if ( n % i == 0 ) {
                sum += i;
            }
        }
        if ( sum == n) {
            return true;
        }
        else {
            return false;
        }
    }

    //cau c
    public static void printPrimeNumber( int n) {
        for ( int i = 2; i < n; i++) {
            if (isPrimeNumber(i)) {
                System.out.print("  " + i);
            }
        }
    }

    //cau d
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        int fib = 1;
        int prevFib = 1;
        for ( int i =2; i < n; i++){
            int temp = fib;
            fib += prevFib;
            prevFib = temp;
        }
        return fib;
    }

    // ham tinh giai thua
    public static double factorial(int n) {
        double result = 1;
        for ( int i = 2; i<=n;++i) {
            result *= i;
        }
        return result;
    }

    //cau f
    public static double caculateSin(double x, int n) {
        double result = 0;
        x = x * Math.PI/180;
        for ( int i = 0; i <= n; i++) {
                double term = Math.pow(-1, i) * (Math.pow(x, 2*i + 1)/factorial(i * 2 + 1));
                result += term;
        }
        return result;
    }

    //cau g
    public static double calculateEuler(double x, int n) {
        double result = 1;
        for ( int i = 1; i <= n; i++) {
            double term = Math.pow(x, i) / factorial(i);
            result += term;
        }
        return result;
    }

    // cau h
    public static double calculateCos( double x , int n) {
        double result = 1;
        x = x * Math.PI/180;
        for ( int i = 1; i<=n;++i) {
            double term = Math.pow(-1, i) * (Math.pow(x, i*2)/ factorial(2 * i));
            result += term;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x = input.nextDouble();
        int n = input.nextInt();
        input.close();

        // cau a
            System.out.println(n + " is prime num?");
            if (isPrimeNumber(n)) {
                System.out.println("true");
            }
            else {
                System.out.println("false");
            }

        // cau b    
            System.out.println(n + " is perfect num?");
            if (isPerfectNumber(n)) {
                System.out.println("true");
            }
            else {
                System.out.println("false");
            }

        //cau c
            System.out.print(n + "th first prime number: ");
            printPrimeNumber(n);

        // cau d
            System.out.println("\n"+ n+"th fibonancci: " + fibonacci(n));
            

        // cau f
            System.out.println("sin( " + x +" )" + " = " + caculateSin(x, n));

        // cau g
            System.out.println(" e ^ " + x + " = " + calculateEuler(x, n));

        // cau h
            System.out.println("cos( " + x  + " )" + calculateCos(x, n));

    }
}