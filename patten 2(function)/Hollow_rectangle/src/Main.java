// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void hollow_rectang(int totRow, int totCols){
        int i,j;
        for(i=1; i<=totRow; i++){
            for(j=1; j<=totCols; j++){
                if(i == 1 || i == totRow || j == 1 || j == totCols){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        hollow_rectang(5,6);
    }
}