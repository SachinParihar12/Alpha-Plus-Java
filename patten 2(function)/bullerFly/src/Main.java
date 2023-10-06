// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void butterFly(int n) {
        // Ist half
        int i, j;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }

            for (j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (i = 1; i >= n; i--) {
                for (j = 1; j <= i; j++) {
                    System.out.print("*");
                }

                for (j = 1; j <= 2 * (n - i); j++) {
                    System.out.print(" ");
                }
                for (j = 1; j <= i; j++) {
                    System.out.print("*");
                }
            }

            }
        }
        public static void main(String args[]){
        butterFly(5);
        }
    }
