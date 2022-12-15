
import java.lang.ref.Cleaner;
import java.util.*;
public class binaryConversion {

public static void binToDec(int n){
  int pow = 0;
  int dec = 0;
  while(n > 0){
    int ld  = n % 10;
  
    dec = dec + (ld * (int)Math.pow(2,pow));
    n = n / 10;
    pow++;

  }
  System.out.println(dec);
}

public static void decToBinary(int n) {
  int pow = 0;
  int bin = 0;
  while(n>0){
    int rem = n % 2;
    bin = bin + (rem * (int)Math.pow(10,pow));
    pow++;
    n = n/2;
 }
  System.out.println(bin);
}
  public static void main(String[] args) {
    decToBinary(7);

  }
}


