// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.*;
public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       float pencil = sc.nextFloat();
       float pen = sc.nextFloat();
       float eraser = sc.nextFloat();

       float totalCost = pencil+pen+eraser;

       System.out.println("totalCost of pencil pen and eraser:" + totalCost);

       // 18% gst of item

        float bill = totalCost + (0.18f*totalCost);

        System.out.println("totalCost bill of pencil pen and eraser with 18% GST :" + bill);

    }
}