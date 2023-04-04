
import java.security.PublicKey;

public class divideAndConquerAsstignment {

public static String[] mergeSort(String arr[], int si, int ei) {

if(si==ei){
    String[] a = {arr[si]};
    return a;
}

int mid = si + (ei - si) / 2;
String[] left = mergeSort(arr, si, mid);
String[] right = mergeSort(arr, mid + 1, ei);
String[] solution = merge(left, right);
return solution;

}

public static String[] merge(String[] left, String[] right) {
    int i = 0;  //iterator for left
    int j = 0; //iterator for right
    int l = left.length;
    int r = right.length;
    String[] temp = new String[left.length + right.length]; 
    int index = 0;  // to iterate temp

    while(i < l && j < r){
        if(isSorted(left[i], right[j])){
            temp[index] = left[i];
            i++; index++;
        }else{
            temp[index] = right[j];
            j++; index++;
        }
    }
    while(i < l){
        temp[index] = left[i];
            i++; index++;
    }

    while(j < l){
        temp[index] = right[j];
        j++; index++;
    }

    return temp;
}

public static Boolean isSorted(String left, String right) {
    if(left.compareTo(right) < 0){
        return true;
    }
    return false;
}

// ----------------------------------------------------------------------------------
//bruteforce method
// o^2 time complexity
// 2 pointer method
// public static int majorityElement(int arr[]) {  

//     int min = arr.length/2;

//     for(int  i = 0; i < arr.length; i++){
//         int count  = 0;
//         for(int j = 0; j < arr.length; j++){
//             if(arr[j] == arr[i]){
//                 count += 1;
//             }
//         }
//         if(count > min){
//             return arr[i];
//         }
//     }
//     return -1;
// }

public static int count(int[] arr, int num, int si, int ei) {
    int count  = 0; 
    for(int i = si; i<arr.length; i++){
        if(arr[i] == num){
            count++;
        }
    }
    return count;
}
public static int  mainfun(int[] arr, int si, int ei) {
    // base case
    if(si== ei){  //if onlly 1 element, then that is the major element
        return arr[si];
    }

    // then we will search by dividing the work
    int mid = si+(ei-si)/2;

    int left = mainfun(arr, si, mid);
    int right = mainfun(arr, mid + 1, ei);

    // if left and right return same ans, that is final answer
    if(left  == right){
        return left;
    }

    // ifnot then use count fun to count the max no of occourences
    int leftCount = count(arr, left, si, ei);
    int rightCount = count(arr, right, si, ei);

    return leftCount > rightCount  ? left : right;

}
public static int majorityElement(int[] arr) {
    return mainfun(arr, 0, arr.length-1);
}
// -------------------------------------------------------------


//  INVERSION COUNT
    public static void main(String[] args) {
//    mergesort
   
        //    String  arr[] = { "sun", "earth", "mars", "mercury" };
    //    String a[] = mergeSort(arr, 0, arr.length-1);
    //    for(int i = 0; i < a.length; i++){
    //     System.out.println(a[i]);
    //    }
       




    // majority element
    int nums[] = {2,1,1,1,2,2};
    System.out.println(majorityElement(nums));

    }



    // inversion count
}
