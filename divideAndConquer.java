import java.util.*;
public class divideAndConquer {
    public static void printArray(int arr[]) {
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void mergeSort(int arr[], int si, int ei) {
       //base case
       if(si>=ei){
        return;
       }
        int mid = si + (ei - si)/2; // same as si+ei/2
        // for left
        mergeSort(arr, si, mid);
        //for right
        mergeSort(arr, mid+1, ei);
        //merging
        merge(arr, si, mid, ei);
        
    }
    //took 2 hours to debug do carefully
    public static void merge(int arr[], int si, int mid, int ei) {
        //merging process
        int temp[] = new int[ei-si+1];
        int i = si; //iterator for left
        int j = mid+1; //iterator for right
        int k = 0; //iterator for temp

        while(i <= mid && j <= ei){
            if(arr[i] < arr[j]){
                temp[k] = arr[i];
                i++; k++;
            }
            else{
                temp[k] = arr[j];
                k++; j++;
            }
            //k++(it is done in both teh if loops, so we can write this outside)
        }
        // both array might no be of ame length, there for leftover arrays


        //for left
        while(i <= mid){
            // temp[k] = arr[i];
            // k++; i++;
            temp[k++] = arr[i++];
        }
        //for right
        while(j <= ei){
            // temp[k] = arr[j];
            // k++; j++;
            temp[k++] = arr[j++];  //samething, just shortcut
        }


        //now copy the temp array into the original array
        for(k = 0, i = si; k < temp.length; k++, i++ ){
            arr[i] = temp[k];
        }}




        //QUICKSORT
        public static void quickSort(int arr[], int si, int ei) {
           //base case
            if(si>=ei){
                return;
            }
            int pivotIndex = partition(arr, si,ei);
            //for left side
            quickSort(arr, si, pivotIndex-1);
            //for right side
            quickSort(arr,pivotIndex+1 , ei);
            
        }
        public static int partition(int arr[],int si,int ei) {
            int pivot = arr[ei];
            int i = si-1; //to make space for the no smaller than pivot
            for(int j = si; j<ei;j++){
                if(arr[j]< pivot){
                    i++;
                    //swap
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            i++;
            int temp = pivot;
                    arr[ei] = arr[i];
                    arr[i] = temp;
                    return i;
        }

        public static int rotatedArray(int arr[], int tar,int si, int ei) { //tar is target
            //base case
            if(si > ei){
                return -1;  //tar not present
            }

            int mid = si + (ei - si)/2;
            // tar found
            if(arr[mid] == tar){
                return mid;
            }

            //on line 1
            if(arr[si] <= arr[mid]){
                //case a left
                if(arr[si] <= tar && tar <= arr[mid]){
                   return rotatedArray(arr, tar, si, mid-1);
                } else{
                    //case b right
                    return rotatedArray(arr, tar, mid + 1, ei);
                }
            }
            //on line 2
            else{
                //case c left
                if(arr[mid] <= tar && tar <= arr[ei]){
                    return rotatedArray(arr, tar, si, mid - 1);
                }else{
                //case d right
                return rotatedArray(arr, tar, mid + 1, ei);
            }

            }
        }


    public static void main(String[] args) {
    ////mergesort 
    // int arr[] = {6, 3, 9, 5, 2, 8, -2};
    //     mergeSort(arr, 0, arr.length-1);
    //     printArray(arr);



    //quicksort
    // int arr[] = {6, 3, 9, 8, 2, 5};
    // quickSort(arr, 0, arr.length-1);
    // printArray(arr);


    //rotated array
    int arr[] = {4, 5, 6, 7, 0, 1, 2};
    int target = 0;
     int targetIndex = rotatedArray(arr, target, 0, arr.length-1);
        System.out.println(targetIndex);
}}
