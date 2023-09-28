// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java. util.*;
public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.println("Enter a number");
      int number = sc.nextInt();

      if(number > 0){
          System.out.println("positive number");
      }
      else{
          System.out.println("negative number");
      }
    }
}