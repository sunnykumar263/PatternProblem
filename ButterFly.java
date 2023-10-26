public class ButterFly {
    public static void main(String[] args) {
        int r = 4;
        for(int i = 1 ; i <= r ; i++) {
            for(int j = 1 ; j <= i ; j++) {
                System.out.print("*");
            }
            for(int space = 1 ; space <= 2*(r-i) ; space++) {
                System.out.print(" ");
            }
            for(int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();

        }
        for(int i = r-1 ; i >= 1 ; i--) {
            for(int k = 1; k <= i ; k++) {
                System.out.print("*");
            }
            for(int space = 1 ; space <= 2*(r-i) ; space++) {
                System.out.print(" ");
            }
            for(int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

