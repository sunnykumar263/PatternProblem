import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of rows");
        int r = sc.nextInt();
        int num = 1;

        for(int i = 1 ; i <= r ; i++) {
            num = i;

            for(int space = 1 ; space <= i-1 ; space++) {
                System.out.print(" ");
            }
            for(int j = i ; j <= r ; j++) {  
                 System.out.print(j + " ");
                // if(j%2 == 0) {    (j<=2r-2i+1)
                //     System.out.print(" ");
                // }
                // else{
                //     System.out.print(num);
                //     num++;
                // }
            }
            System.out.println();

        }
        for(int i = r-1 ; i >= 1 ; i--) {
            num = i;
            for(int space = 1 ; space <= i-1 ; space++) {
                System.out.print(" ");
            }
            for(int k = i; k <= r ; k++) {
                 System.out.print(k +" ");
                // if(k%2 == 0) {
                //     System.out.print(" ");
                // }
                // else{
                //     System.out.print(num);
                //     num++;
                // }
            }
            System.out.println();
        }
        sc.close();
    }
}
