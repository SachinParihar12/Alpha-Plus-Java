// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a :");
        int a = sc.nextInt();
        System.out.println("Enter b :");
        int b = sc.nextInt();
        System.out.println("Enter operator :");
        char operator = sc.next().charAt(0);

        switch(operator){
            case '+' :
                System.out.println(a+b);
                break;
            case '-' :
                System.out.println(a-b);
                break ;
            case '*':
                System.out.println(a*b);
                break;
            case '/' :
                System.out.println(a/b);
                break ;
            case '%' :
                System.out.println(a%b);
                break ;
            default :
                System.out.println("wrong operator");

        }

    }
}