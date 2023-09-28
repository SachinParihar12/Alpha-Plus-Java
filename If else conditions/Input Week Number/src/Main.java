// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.*;
public class Main {
    public static void main(String[] args) {

      Scanner sc = new.Scanner(System.in);
      int week = sc.nextInt();


      switch(week){
          case1 :
              System.out.println("sunday");
              break;
          case2 :
              System.out.println("monday");
              break;
          case3 :
             System.out.println("tuesday");
             break;
          case4 :
             System.out.println("wednesday");
             break;
          case5 :
             System.out.println("thursday");
             break;
          case6 :
             System.out.println("friday");
             break;
          case7 :
             System.out.println("saturday");
             break;
          default :
              System.out.println("invailde number in week");

      }

    }
}