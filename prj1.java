import java.util.Scanner;


public class prj1 {

    public static int palindromeNum( int n) {
        int count;
        int term = 0;
        while ( n != 0 ) {
            count = n % 10;
            term = term * 10 + count;
            n /= 10;
        }
        return term;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.close();
        System.out.println("So dao nguoc la cua " + n + " la: " + palindromeNum(n));
    }
}
