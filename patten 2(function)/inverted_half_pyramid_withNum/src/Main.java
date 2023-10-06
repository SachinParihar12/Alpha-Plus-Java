// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
   public static void inverted_half_pyramid_withNum(int n){
       int i,j;
       for(i=1; i<=n; i++){
           for(j=1; j<=n-i+1; j++){
               System.out.print(j+ " ");
           }
           System.out.println();
       }
   }
   public static void main(String args[]){
       inverted_half_pyramid_withNum(5);
   }
}