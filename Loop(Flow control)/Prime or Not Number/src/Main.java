// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i;
        if(n == 2){
            System.out.println("Number is prime");
        }
        else{
         boolean isPrime = true;
         for(i = 2; i <= n-1; i++){
             if(n % i == 0){
                 isPrime = false;
             }
         }
         if(isPrime == true){
             System.out.println("number is prime");
         }
         else{
             System.out.println("number is not prime");
         }
        }

    }
}