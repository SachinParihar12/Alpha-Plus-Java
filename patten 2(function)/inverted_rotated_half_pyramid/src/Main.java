// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void inverted_rotated_half_pyramid(int n) {
        int i, j;
        for(i = 1; i <= n; i++) ;
        {
            for (j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (j = 1; j <= i; j++) {
                System.out.println("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        inverted_rotated_half_pyramid(7);
    }
}