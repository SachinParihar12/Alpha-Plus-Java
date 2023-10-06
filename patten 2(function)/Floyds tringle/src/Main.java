// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void floyds_tringle(int n){
        int i,j;
        int counter = 1;
        for(i=1; i<=n; i++){
            for(j=1; j<=i; j++){
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        floyds_tringle(5);
    }
}
