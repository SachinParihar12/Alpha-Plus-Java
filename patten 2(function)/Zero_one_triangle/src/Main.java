// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void zero_one_triangle(int n){
        int i,j;
        for(i=1; i<=n; i++){
            for(j=1; j<=i; j++){
                if((i+j)%2 == 0){
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        zero_one_triangle(7);
    }
}