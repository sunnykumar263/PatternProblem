import java.util.Scanner;
public class NumericalRectangular {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter the no of rows");
        int r = sc.nextInt();
        System.out.println("Enter the no of columns");
        int c = sc.nextInt();

        for(int i = 1 ; i <= r ; i++) {
            for(int j = i ; j <= c ; j++) {
                System.out.print(j);
            }
            for(int k = i-1 ; k >= 1 ; k--) {
                System.out.print(k);
            }
            System.out.println();
            sc.close();
        }
    }
}
