// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       int age = 22;

       if(age >= 18){
           System.out.println("adult");
       }
       if(age >= 13 && age < 18){
           System.out.println("teenager");
       }
       else{
           System.out.println("child");
       }
    }
}