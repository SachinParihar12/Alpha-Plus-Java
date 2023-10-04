// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the integer num");
        int digits = sc.nextInt();
        System.out.println(sumDigits(digits));

    }

    public static int sumDigits(int n){

        int sumOfDigits = 0;

        while(n > 0){

            int lastDigits = n % 10;
            sumOfDigits += lastDigits;
            n /= 10;
        }
        return sumOfDigits;
    }
}