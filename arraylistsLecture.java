import java.util.ArrayList;
import java.util.Collections;
import java.util.function.BiPredicate;
public class arraylistsLecture {
   
    public static void reverseArraylists(ArrayList<Integer> list) {
        for(int i = list.size()-1; i >= 0; i--){
            System.out.print(list.get(i) +" ");
        }
        System.out.println();
    }


    public static void findMaximum(ArrayList<Integer> list){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i< list.size(); i++){
            if(max < list.get(i)){
                max = list.get(i);            }
        }
        System.out.println("the maximum value is " + max);
    }


public static void swapUsingIndex(ArrayList<Integer> list, int  index1, int index2){
    int temp = list.get(index1);           // a = b
    list.set(index1, list.get(index2));    // b = c
    list.set(index2, temp);                // c = a    
}
   
public static int container_With_Max_Water(ArrayList<Integer> list) {
    //bruteforce approach O(n^2)
    // int maximumWater = 0;
    // for(int i = 0; i < list.size(); i++){
    //     for(int j = i+1; j < list.size(); j++){
    //         int height = Math.min(list.get(i), list.get(j));
    //         int width = j-i;
    //         int currentWater = height * width;
    //         maximumWater = Math.max(maximumWater, currentWater);
    //     }
     
    // }   
    // System.out.println(" max water is "+ maximumWater);
    // return maximumWater;





    //optimal approach using 2 pointers idk why not working someone plz help
    int maximumWater = 0;
    int leftPointer = 0;
    int rightPointer = list.size() - 1;

    //calculate the area of water
    while(leftPointer < rightPointer){
    int height = Math.min(list.get(leftPointer), list.get(rightPointer));
    int width  = rightPointer - leftPointer;
    int currentWater   = height * width;
    maximumWater = Math.max(maximumWater, currentWater);

    //update pointers
   if(list.get(leftPointer) < list.get(rightPointer)){
    leftPointer++;
   }else{
    rightPointer++;
   }
} 
System.out.println("maximum height is " + maximumWater);
   return maximumWater;
}





public static boolean pairsum1(ArrayList<Integer> list, int target) {
    //2 pointer approach
    int start = 0; int end  = list.size()-1;
    while(start < end){
        if(list.get(start) + list.get(end) == target){
            return true;
        }

        //updating pointers
        if(list.get(start) + list.get(end) < target){
            start ++;
        } else{
            end--;
        }
  
    }
    
    //bruteforce method
    // for(int i = 0; i < list.size(); i++){
    //     for(int j = i+1; j< list.size(); j++){
    //         if(list.get(i) + list.get(j) == target){
    //             return true;
    //         }
    //     }
    // }
    
    return false;   //no need to comment out for both the approach
}


    public static boolean pairSum2(ArrayList<Integer> list , int target){

        // //bruteforce approach, same as pairsum1
        // for(int i = 0; i < list.size(); i++){
        //     for(int j = i+1; j < list.size(); j++){
        //         if(list.get(i) + list.get(j) == target){
        //             return true;
        //         }
        //     }
        // }


            //bp and pivot are same
        int breakingPoint = -1;  //initializing pivot/bp with invalid index
        int n = list.size();
        for(int i=0; i < list.size(); i++){ //finding the pivot
            if(list.get(i) > list.get(i+1)){
                breakingPoint = i;
                break;
            }
        }
        int leftPointer = breakingPoint+1; //smallest element
        int rightPointer = breakingPoint;  //largest element
        
        while(leftPointer != rightPointer){ // same as lp<rp
        //case 1
        if(list.get(leftPointer) + list.get(rightPointer) == target){
            return true;
        }
        //case 2
        if(list.get(leftPointer) + list.get(rightPointer) < target){
            leftPointer = (leftPointer+1) % n;
        }
        //case 3, we can directly use else
        else{
            rightPointer = (n+rightPointer-1) % n;
        }
        } 
        return false;
    }
    public static void main(String[] args) {

        //making new arraylist

        // ArrayList <Integer>array1 = new ArrayList<>();
        // //add operation
        // array1.add(0);
        // array1.add(1);
        // array1.add(2);
        // array1.add(3);
        // array1.add(4);
        // array1.add(5);
        // // array1.add(1, 10); //adding 10 to index 1
        // System.out.println(array1);
        
        //get operation
    //    int element = array1.get(2);
    //     System.out.println(element);
        
    // // Remove element
        // array1.remove(3);
        // System.out.println(array1);

        // //set element
        // array1.set(2, 10);
        // System.out.println(array1);

        // //contain operation
        // System.out.println(array1.contains(2));
        // System.out.println(array1.contains(123));
            
        // //Array;ist size
        // System.out.println(array1.size());


        // //Print arraylist

        // for(int i = 0; i<array1.size(); i++){
        //     System.out.print(array1.get(i) + " ");
        // }
        // System.out.println();

       
       
        // reverseArraylists(array1);
        // findMaximum(array1);


//   //swap in Arraylists
//   int index1 = 1, index2 = 3;
// System.out.println(array1);
// System.out.println("upper one is real one");
// swapUsingIndex(array1, index1, index2);

// System.out.println(array1);



//sorting in arraylists

// ArrayList<Integer> list = new ArrayList<>();

// list.add(2);
// list.add(5);
// list.add(9);
// list.add(3);
// list.add(6);
// System.out.println(list);
//sorting using inbuilt function
// Collections.sort(list);
// System.out.println(list);
// //descending order
// Collections.sort(list, Collections.reverseOrder());
// System.out.println(list);

// // //Multi dimentional ArrayList
// ArrayList<ArrayList<Integer>> mainList= new ArrayList<>();
// //first create the arraylists
// ArrayList<Integer> list1 = new ArrayList<>();
// list1.add(1);
// list1.add(2);
// mainList.add(list1);  //adding list 1 into mainlist

// ArrayList<Integer> list2 = new ArrayList<>();
// list2.add(3);
// list2.add(4);
// mainList.add(list2);

// System.out.println(mainList);

// //printing mainlist using for loop

// for(int i = 0; i < mainList.size(); i++){
//     ArrayList<Integer> currentList = mainList.get(i);  //on ith index, it will put whole ArrayLists and not just one element
//     for(int j = 0; j < currentList.size(); j++){
//         System.out.print(currentList.get(j)); // this will take only ith element
// }System.out.println();
// }

// ArrayList<Integer> list1 = new ArrayList<>();
// ArrayList<Integer> list2 = new ArrayList<>();
// ArrayList<Integer> list3 = new ArrayList<>();

// for(int i = 1; i<=5; i++){   // adding the values in 1 single for loop
// list1.add(i * 1);  // 1 2 3 4 5
// list2.add(i * 2);  // 2 4 6 8 10
// list3.add(i * 3);  // 3 6 9 12 15
// }


// mainList.add(list1);
// mainList.add(list2);
// mainList.add(list3);
// System.out.println(mainList);


//writing for loop to print
// for(int i = 0; i< mainList.size(); i++){
//     ArrayList<Integer> currentList = mainList.get(i);
//     for(int j = 0; j < currentList.size(); j++){
//         System.out.print(currentList.get(j)+ " ");
//     }
//     System.out.println();
// }



        // //Container with most water
        // ArrayList<Integer> height = new ArrayList<>();
        // height.add(1);
        // height.add(8);
        // height.add(6);
        // height.add(2);
        // height.add(5);
        // height.add(4);
        // height.add(8);
        // height.add(3);
        // height.add(7);
        // container_With_Max_Water(height);

    //     //pairsum1
    //     ArrayList<Integer> pair= new ArrayList<>();
    //     pair.add(1);
    //     pair.add(2); 
    //     pair.add(3); 
    //     pair.add(4); 
    //     pair.add(5);
    //     pair.add(6);
    //    System.out.println( pairsum1(pair, 5));






       //pairsum2
       ArrayList<Integer> pair2= new ArrayList<>();
       pair2.add(11);
       pair2.add(15); 
       pair2.add(6); 
       pair2.add(8); 
       pair2.add(9);
       pair2.add(10);
       int target = 16;
      System.out.println( pairsum1(pair2, target));

}}

