import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input the year");
        int year = sc.nextInt();

        boolean x = (year % 4) == 0;
        boolean y = (year % 100) != 0;
        boolean z = ((year % 100 ==0) && (year % 400 == 0));

        if(x && (y || z)){
            System.out.println(year  +" is a leap year");

        }
        else{
            System.out.println(year + " is a not leap year");
        }
    }
}