// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num ;
        int fact = 1;
        int i;

        System.out.println("Enter the number");

        num = sc.nextInt();

        for(i = 1; i <=num; i++){
            fact *= i;
        }
        System.out.println(fact);


    }
}