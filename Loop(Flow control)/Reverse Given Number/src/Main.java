// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int lastDigit ;
        int rev = 0;
        while(n > 0){

         lastDigit = n%10;
         rev = rev*10+lastDigit;
          n = n/10;
     }
        System.out.println(rev);
    }
}