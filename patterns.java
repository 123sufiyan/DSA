import java.lang.ref.Cleaner;

import javax.swing.plaf.basic.BasicTreeUI.TreeIncrementAction;

public class patterns {

public static void hollow_patterns(int mrow, int mcol)
    {
      for(int i =1; i <= mrow; i++ ){
         for(int j = 1; j <= mcol; j++){
            if(i == 1 || i == mrow || j ==1 || j==mcol ){
               System.out.print("*");
            }else{
               System.out.print(" ");
            }
             
         }
         System.out.println();
      }
    }
    public static void invertedPyramid(int n) {
      for(int i = 1; i<=n; i++){
         //space
         for(int j = 1; j <= n-i; j++){
            System.out.print(" ");
         }
         for(int j = 1; j<=i; j++){
            System.out.print("*");
         }
         System.out.println();
         }
       
      }
      
    public static void invertedHalf(int n){
      for(int i =1; i<=n; i++){
         for(int j = 1; j <= n-i+1; j++ ){
            System.out.print(j+" ");
         }
         for(int j = 1; j<n-i; j++){
            System.out.print(" ");
         }
         System.out.println();
      }
    }
    public static void floyds_triangle(int n) {
      int counter = 1;
      for(int i = 1; i<=n; i++){
         for(int j = 1; j<=i; j++){
            System.out.print(counter);
            counter++;
         }
         System.out.println();
      }
      
    }
    public static void zeroOne(int n) {
      for(int i = 1; i<=n; i++){
         for(int j = 1; j<=i; j++){
            if((i+j) % 2 ==0){
               System.out.print("1");
            }
            else{System.out.print("0");}
         }
         System.out.println();
      }
    }
    
    public static void butterfly(int n) {
      for(int i = 1; i<=n; i++){
        //stars
         for(int j = 1; j<=i; j++){
            System.out.print("*"+ "");

         }
         //space
         for(int j = 1; j<= 2*(n-i); j++){
            System.out.print(" ");
         }
         // stars
         for(int j = 1; j<=i; j++){
            System.out.print("*"+ "");
         }
         System.out.println();
      }
      //now inverse of this
      for(int i = n; i>=1; i--){
         for(int j = 1; j<=i; j++){
            System.out.print("*");

         }
         //space
         for(int j = 1; j<= 2*(n-i); j++){
            System.out.print(" ");
         }
         // stars
         for(int j = 1; j<=i; j++){
            System.out.print("*");
         }
         System.out.println();
      }
      
    }
    private static void rhombus(int n) {
      for(int i = 1; i<=n; i++){
          for(int j = 1; j<=n-i; j++){ //for space
            System.out.print(" ");
         }
         for(int j = 1; j<=n; j++){
            System.out.print("*");
         }
         System.out.println();
      }
   
    }
   public static void hollowRhombus(int mrow, int mcol, int n) {
      for(int i =1; i<=n; i++){
         for(int j = 1; j<=n-i; j++){ //for space
            System.out.print(" ");}
            for(int j = 1; j <= n; j++){
               if(i == 1 || i == n || j ==1 || j==n ){
                  System.out.print("*");
               }else{
                  System.out.print(" ");
               }
         }
         System.out.println();
      }
   }
   public static void dimond(int n) {
      int count = 0;
      for(int i = 1; i<=n;i++){
       for(int j = 1; j<= n-i; j++){  // for space
         System.out.print(" ");
       }
       for(int j = 1; j<=(2*i)-1; j++){
         System.out.print("*");
       }
      System.out.println();
      }

      for(int i =n; i>=1;i--){
         for(int j = 1; j<= n-i; j++){  // for space
           System.out.print(" ");
         }
         for(int j = 1; j<=(2*i)-1; j++){
           System.out.print("*");
         }
        System.out.println();
        }
      }
      
   
      public static void main(String[] args) {
      dimond(4);
   }
}      

    