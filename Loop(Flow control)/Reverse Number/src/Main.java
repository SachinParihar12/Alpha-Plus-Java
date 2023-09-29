// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

       int n = 10899;

       while(n > 0){
           int lastDigit = n % 10;
           System.out.println(lastDigit);
           n  = n/10;
       }
        System.out.println();
    }
}