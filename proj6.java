import java.util.Scanner;

public class proj6 {

    public static boolean checkOddNumber( int n ) {
        if (n%2 == 0) {
            return false;
        }
        return true;
    }

    public static int checkOddSum ( int n ) {
        int count;
        int term = 0;
        while ( n != 0 ) {
            count = n % 10;
            term += count;
            n /= 10;
        }
        return term;
    }

    public static int checkNumeral( int n ) {
        int count;
        int term = 0;
        while ( n != 0) {
            count = n % 10;
            term = count;
            n /= 10;
        }
        return term;
    }

    public static void printOddNumber( int n) {
        for ( int i = 1; i <= n; ++i) {
            if (checkOddNumber(i) && (checkOddSum(i) % 2 != 0) && (checkNumeral(i)%2!=0) ) {
                System.out.print(" " + i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.close();
        printOddNumber(n);
    }
}
