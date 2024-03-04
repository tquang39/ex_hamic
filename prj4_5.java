import java.util.Scanner;

public class prj4_5 {

    public static int checkBeautyNumber( int n) {
        int count;
        int term = 0;
        while ( n != 0) {
            count = n % 10;
            term += count;
            n /= 10;
        }
        return term;
    }

    public static int printBeautyNumber( int n ) {
        int count = 0;
        for ( int i = 1; i <= n; i++) {
            if ( i % checkBeautyNumber(i) == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.close();

        if ( n % checkBeautyNumber(n) == 0 ) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }

        System.out.print("Cac so dep tu 1 den " + n + " la: " +printBeautyNumber(n));
        
    }
}
