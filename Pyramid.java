import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of rows");
        int r = sc.nextInt();

        for(int i = 1 ; i <= r ; i++) {
            for(int space = 1 ; space <= r-i ; space++){
                System.out.print(" ");
            }
            for(int j = 1 ; j <= (2*i - 1) ; j++) {
                System.out.print("*");
            }
            System.out.println();
            sc.close();
        }
        for(int i = r-1 ; i >= 1 ; i--) {
            for(int space = 1 ; space <= r-i ; space++){
                System.out.print(" ");
            }
            for(int j = 1 ; j <= (2*i - 1) ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
