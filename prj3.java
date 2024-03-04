import java.util.Scanner;

public class prj3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        do {
            System.out.print("Moi nhap so n trong doan [0;100]: ");
            n = input.nextInt();
        }while (n < 0 || n > 100);
        input.close();
    }
}
