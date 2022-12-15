
import java.util.*;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;
public class ArraysLecture {
   public static void update(int array[]) {
    for(int i = 0; i<array.length; i++){
        array[i] = array[i] + 1;
        System.out.print(array[i]+ " ");
    }
    System.out.println();
}


public static int linearSearch(int array[], int key) {
    for(int i = 1; i<array.length; i++){
        if(array[i] == key){
            return i;
        }
        
    }return -1;
    }





public static int binarySearch(int number[], int key) {
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
    public static int getLargest(int array[]) {
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i<array.length;){
            if(largest  < array[i]){
                largest = array[i];
               
            }
        } return largest;
    }




    public static void reverseArray(int numbers[]){
        int start = 0, end = numbers.length -1;
        while(start< end){
            int temp = numbers[end];
            numbers[end] = numbers[start];
            numbers[start] = temp;
            start++;
            end--;
        } }




    public static void pairsOfArray(int number[]) {
        int totalPairs = 0;
        for(int i = 0; i< number.length; i++){
            for(int j = i + 1; j< number.length; j++){

                System.out.print("(" + number[i] + "," +number[j] + ")");
                totalPairs++;
            }System.out.println();
        }  
        System.out.println(totalPairs);}






        public static void subArrays(int number[]){
           int totalSubarray= 0;
         for(int i = 0; i<number.length; i++){
                for(int j = i; j<number.length; j++){

                    for(int k = i; k<=j; k++){
                        System.out.print(number[k]+ " ");
                        totalSubarray++;

                    }
                    System.out.println();
                }
                
            }
            System.out.println();
            System.out.println( "Total subarray is "+ totalSubarray);
        }



        public static void sumOfSubArrays(int number[]) {
            int totalSubarray= 0;
            int maxNum = Integer.MIN_VALUE;
         for(int i = 0; i<number.length; i++){
                for(int j = i; j<number.length; j++){
                    int currNum = 0;
                    for(int k = i; k<=j; k++){
                        currNum += number[k];
                        if(currNum> maxNum){
                            maxNum = currNum;
                        }

                        totalSubarray++;
                    }
                    System.out.println();
                }

            }
            System.out.println();
            System.out.println( "Total subarray is "+ totalSubarray);
            System.out.println();
            System.out.println("the maximum sum is " + maxNum); 
        }






        public static int  trappedRainwater(int height[])  
        { int n = height.length;
          int leftMax[] = new int[n];
          leftMax[0] = height[0];
          for(int i = 1; i<n; i++){
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
          }
          int rightMax[] = new int[n];
          rightMax[n-1] = height[n-1];
          for(int i = n-2; i>=0; i--){
            rightMax[i] = Math.max(height[i], leftMax[i+1]);
          }
          int trappedWater = 0;
          for(int i = 0 ;i<n; i++){
            int waterLevel =Math.min(leftMax[i], rightMax[i]);
            trappedWater += waterLevel - height[i];
        }
         return trappedWater;
    }





    public static int  buyAndSellStocks(int number[]){
        int buyPrice = Integer.MAX_VALUE;
        int totalProfit = 0;
        for(int i = 0; i< number.length; i++){
            if(buyPrice < number[i]){
                int profit = number[i]- buyPrice;
                totalProfit = Math.max(totalProfit, profit);
            }
            else{buyPrice = number[i];}
        }
        return totalProfit;
    }
    public static void main(String[] args) {
        //simple input and output
        // int math[] = new int[100];
        // // Scanner sc = new Scanner(System.in);
        // // math[0] = sc.nextInt();
        // // math[1] = sc.nextInt();
        // // math[2] = sc.nextInt();
        // // System.out.println(" oth value "+math[0]);
        // // System.out.println(" 1th value "+math[1]);
        // // System.out.println(" 2th value 0 "+math[2]);
        // System.out.println(math.length);


        // function and arguments
        // int marks[] = {97, 98, 99};
        // update(marks);



//         //LINEAR SEARCH
//         int array[] ={2,4,6,8,10,12,14,18,20};
//         int key = 1; 
//         int index = linearSearch(array, key);
//         if(index == -1){
//             System.out.println("key not found");
//         }
//         else{System.out.println("key is " + index);}


//     }
//}



// //  largest value in array
//   int array[] = {2,4,6,8,10,12};
//   System.out.println("largest no is" + getLargest(array));

   




// //BINARY SEARCH

// int array[] = {2,4,6,8,10,12,14};
// int alt = 6;
// System.out.println
// ("the index of the key is: " + binarySearch(array, alt));





// // Reverse of an array

//     int Array[] = {2,4,6,8,10,12,14,16};
//     reverseArray(Array);  // Array is reversed 
    
//     // now we need to print it
//     for(int  i=0; i< Array.length; i++ ){
//         System.out.print(Array[i] + " ");
//     }
//     System.out.println();



// // Pairs of array
// int array[]= {2,4,6,8,10,12};
// pairsOfArray(array);




// // Subarrays

// int array[] = {2,4,6,8,10};
// subArrays(array);



//  //sum of subarray
//  int array[]= {2,4,6,8,10};
//  sumOfSubArrays(array);



 // TRAPPING RAINWATER
//  // does'nt work if highest bar is in the middle
//  int array[] = {4,2,0,3,2,5};
//  System.out.println(trappedRainwater(array));




// // Stock
// int array[] = {7,1,5,3,6,4};
// System.out.println(buyAndSellStocks(array));
}}