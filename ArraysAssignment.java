import java.util.*;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction; 
public class ArraysAssignment{
    
    public static boolean distinct_Element(int number[]) {
        for(int i =0; i< number.length; i++){
            int temp = number[0];
            for(int j = i+1; j< number.length; j++){
                if(number[i] == number[j]){
                    return true;
                }
            }
        }return false;
        
    }


public static int Q2(int number[], int key) {
    int start = 0;
    int end = number.length -1;
    while(start <= number.length){
            int mid = (start + end) / 2;
            if(number[mid] == key){
                return mid;
            }
            if(number[mid] < key){
                start = mid + 1;
            }
            if(number[mid] > key){
                end = mid - 1;
            }
        }
        return -1;
    
}

public static int  Q3buyAndSell(int number[]) {
    int buyPrice = Integer.MAX_VALUE;
    int totalProfit = 0;
    for(int i = 0; i< number.length; i++){
        if(buyPrice< number[i]){
            int  profit = number[i]-buyPrice;
            totalProfit = Math.max(totalProfit, profit);
          }
        else{buyPrice = number[i];}  
    }
    return totalProfit;
}


    public static void main(String[] args) {
       
    //     // Q1
    //     int arrays[] = {1,2,3,4};
    //    System.out.println(distinct_Element(arrays));
    // // Done through bruteforce, ETL



    // // Q2
    // int array[] = {4,5,6,7,0,1,2};
    // int key = 0;
    // System.out.println(Q2(array, 0));
    //not done




    //Q3
    // int array[]= {7, 6, 4, 3, 1};
    // System.out.println(Q3buyAndSell(array));


    //Q4
    int array[]= {1,0,2,1,0,1,3,2,1,2,1};





    }}