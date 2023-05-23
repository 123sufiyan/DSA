import java.util.*;
public class bitManipulationLec{
   
   public static void oddEven(int n) {
    int bitMask = 1;
    if((n & bitMask)== 0){
        // even case
        System.out.println("Even number");
    }
    else{System.out.println("odd number");}
   }
   



   public static int getIthBit(int n, int i) {
   int bitmask = 1<<i;
   if((n & bitmask) == 0){
    return 0;
   }
   else{
    return 1;
   }
}



//  public static int setBit(int n , int i) {
//     int bitMask = 1 <<i;
//      return n | bitMask;

//  }

 public static int clearBit(int n, int i) {
    int bitMask = ~(1<<i);
    return n & bitMask;
    
 }

 public static int clearLAstBits(int n , int i) {
   int bitMask = (~0)<<i;
   return n & bitMask;
   
 }

 public static boolean powerOfTwo(int n) {
   // if((n & (n-1)) ==0){
   //    return true;
   // }
   // else{
   //    return false;
   // }

// alt method
   return (n & (n-1)) ==0;
    }



    public static int countSetBits(int n) {    //google and amazon question
         int count = 0;
         while(n>0){
            if((n & 1) !=0){
               count++;
            }
            n = n >> 1;
         }
         return count;
    }


    public static int  fastExponential(int a, int n) {
      int ans  = 1;
      while(n>0){
         if((n & 1) != 0){
            ans = ans * a;
            n = n>>1;
         }
      }
      return ans;
    }
    public static void main(String[] args) {


        // //odd or even
        // int n = 5 , m = 4;
        // oddEven(m);


        // // get ith bit
        // int n = 15, i = 2;
        // System.out.println(getIthBit(n, i));

      //   // set ith bit
      //   int n = 15, i = 2;
      //   System.out.println(clearLAstBits(n, i));


      // // power of 2 
      
      
      
      // //Count setbits(Amazon, Google)
      // System.out.println(countSetBits(10));


      // fast exponential
      System.out.println(fastExponential(5, 3 ));









    }}