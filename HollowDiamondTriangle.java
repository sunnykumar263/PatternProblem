import java.util.Scanner;

public class HollowDiamondTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of rows");
        int r = sc.nextInt();

        for(int i = 1; i <= r; i++) {
            for(int space = 1; space <= r-i; space++) {
                System.out.print(" ");
            }
            for(int j = 1; j <= 2*i - 1; j++) {
                // if(j % 2 == 0) {
                //     System.out.print(" ");
                // }
                 
                    if(j == 1 || j == (2*i - 1)) {
                    System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }
                     
            }
            System.out.println();
        }
        for(int i = 1; i <= r-1; i++) {
            for(int space = 1; space <= i; space++) {
                System.out.print(" ");
            }
            for(int j = 1; j <= 2*(r-1)-2*i+1; j++) {
                if(j == 1 || j == 2*(r-1)-2*i+1 ) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        sc.close();
    }
}
