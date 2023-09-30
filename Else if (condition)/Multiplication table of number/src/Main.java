// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.*;
public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int i;
        System.out.println("Enter the number");
      int n = sc.nextInt();
      for(i = 1; i <= 10; i++){
          int multi = i*n;
          System.out.println(multi);
      }
    }
}