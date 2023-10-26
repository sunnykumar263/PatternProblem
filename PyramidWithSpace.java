import java.util.Scanner;
public class PyramidWithSpace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of rows");
        int r = sc.nextInt();
        int num = 1;

        for(int i = 1 ; i <= r ; i++) {
            num = 1;

            for(int space = 1 ; space <= r-i ; space++) {
                System.out.print(" ");
            }
            for(int j = 1 ; j <= (2*i -1) ; j++) {
                // System.out.print("* ");
                if(j%2 == 0) {
                    System.out.print(" ");
                }
                else{
                    System.out.print(num);
                    num++;
                }
            }
            System.out.println();

        }
        for(int i = r-1 ; i >= 1 ; i--) {
            num = 1;
            for(int space = 1 ; space <= r-i ; space++) {
                System.out.print(" ");
            }
            for(int k = 1; k <= (2*i -1) ; k++) {
                // System.out.print("* ");
                if(k%2 == 0) {
                    System.out.print(" ");
                }
                else{
                    System.out.print(num);
                    num++;
                }
            }
            System.out.println();
        }
        sc.close();
    }
}

