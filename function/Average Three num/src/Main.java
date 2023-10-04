// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("input the first number");
        double x = sc.nextDouble();
        System.out.println("input the second number");
        double y = sc.nextDouble();
        System.out.println("input the third number");
        double z = sc.nextDouble();
        System.out.println(average(x,y,z));
    }

    public static double average(double x,double y,double z){
        return (x + y + z) / 3;
    }
}