
import java.lang.ref.Cleaner;
import java.util.*;
public class isPrime {

  public static boolean holla(int n){
    boolean isPrime = true;
    for(int i =2; i<=Math.sqrt(n); i++){
        if(n%i ==0){
            isPrime = false;
            return isPrime;
        }
    }
    return isPrime = true;
  }
  public static void main(String[] args) {
    System.out.println(holla(1234678
));
}
}

