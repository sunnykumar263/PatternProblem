import java.util.Scanner;
public class RightOascalTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the no of rows");
        int r = sc.nextInt();

        for(int i = 1; i <= r; i++) {
            for(int j = 1; j <= i; j++) {
                if((i+j) % 2 == 0) {
                    System.out.print("*");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for(int i = 1; i <= r-1; i++) {
            for(int j = 1; j <= r-i; j++) {
                if((i+j)%2 ==0) {
                    System.out.print("*");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
