import java.util.*;
public class SortingLecture {
public static void printArr(int arr[]) {
for(int i = 0; i<arr.length; i++){
    System.out.print(arr[i]+" ");
}
System.out.println();
    
}


public static void bubbleSort(int number[]) {
    int swap = 0;
for(int i = 0; i<number.length-1; i++){
        for(int j = 0; j< number.length-1-i; j++){
            if(number[j]>number[j+1]){
                int temp = number[j];
                number[j] = number[j+1];
                number[j+1] = temp;
                swap++;
            }
            
        }
        if(swap == 0){
           System.out.println("optimal");
            break;
        }
    }
    
}



public static void selectionSort(int number[]){
    for(int i = 0; i<number.length-1; i++){
        int minPosition = i;
        for(int j = i+1; j<number.length; j++){
            if(number[minPosition]> number[j]){
                minPosition=j;
            }
        }
        int temp = number[minPosition];
        number[minPosition]= number[i];
        number[i] = temp;
    }
    }



public static void insertSort(int arr[]) {
    for(int i = 1; i< arr.length; i++){
        int curr = arr[i];
        int prev = i - 1;
        while(prev>=0 && arr[prev]>curr){
            arr[prev+1] = arr[prev];
            prev--;
        }
        arr[prev+1] = curr;
    }
    }



    // do count sort// /----/


    public static void main(String[] args) {
        int array[] = {5,4,1,3,2};
        insertSort(array);
            printArr(array);

     }
}
