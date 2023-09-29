// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int i = 1;

        for(i = 1; i<=5; i++){
            if(i == 3){
                continue;
            }
            System.out.println(i);
        }
    }
}