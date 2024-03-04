import java.util.Scanner;

public class prj2 {

    public static boolean checkPrimeNumber( int number) {
        if ( number <= 1){
            return false;
        }
        for ( int i = 2; i < number; ++i) {
            if ( number % i == 0) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int l;
        int r;
        do {
            System.out.print("Nhap l = ");
             l = input.nextInt();
            System.out.print("Nhap r = ");
             r = input.nextInt();
        } while( l > r);
        
        
        int count = 0;
        for ( int i = l; i <= r; ++i) {
            if (checkPrimeNumber(i)) {
                count+=1;
            }
        }

        System.out.println("So luong so nguyen to trong doan [" + l + ";"+ r  + "] la: " + count);
        input.close();
    }
}
