// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int number;
        int choice;
        int evenSum;
        int oddSum;

        do{
            System.out.println("Enter the number");

            number = sc.nextInt();

            if(number % 2 == 0){
                evenSum += number;
            }
            else{
                oddSum += number;
            }
            System.out.println("continue");

            choice = sc.nextInt();
        }
        while(choice == 1);
        System.out.println("sum of even number :" + evenSum);
        System.out.println("sum of odd number :" + oddSum);

    }
}