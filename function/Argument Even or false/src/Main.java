// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.*;
public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int num ;

      System.out.println("Enter the integer number");
      num = sc.nextInt();

      if(isEven(num)){
          System.out.println("number is even number");

      }
      else{
          System.out.println("number is odd");
      }

    }

    public static boolean isEven(int num){
        if(num % 2 == 0){
            return true;
        }
        else{
            return false;
        }
    }
}