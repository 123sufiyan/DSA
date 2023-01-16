import java.util.ArrayList;
import java.util.Collections;
public class arraylistsAssignment {
   public static boolean isMonotonic(ArrayList<Integer> list) {
    boolean increasing = true; //monotone increasing
    boolean decreasing = true;  //monotone decreasing

    for(int i = 0; i< list.size()-1; i++){
        if(list.get(i) > list.get(i+1)){
            increasing = false;
        }

        if(list.get(i) < list.get(i+1)){
            decreasing = false;
        }
    }
    return increasing || decreasing;  // jo false hoga vohi return hoga
   }
   
   
   public static void lonelyNumbers(ArrayList<Integer> list) {
    Collections.sort(list);
    ArrayList<Integer> list2 = new ArrayList<>();
    for(int i = 1; i< list.size() - 1; i++){
   // case for same numbers with no adjacent value
   if(list.get(i-1) + 1 < list.get(i) && list.get(i) + 1 < list.get(i+1) ){
      list2.add(list.get(i));
   } 

   //case for only 1 element
   if(list.size() == 1){
    list2.add(0);
   }
   
   if (list.size() > 1){
//case for first element
   if(list.get(0) + 1 < list.get(1) ){
    list2.add(list.get(0));
   }


   // case for last element
   if(list.get(list.size()-2) + 1 < list.get(list.size()-1)){
    list2.add(list.get(list.size()-1));
   } 

    }}
   System.out.println(list2);
   }
    public static void main(String[] args) {
// ArrayList<Integer> list = new ArrayList<>();
//     list.add(1);
//     list.add(3);
//     list.add(2);
//     list.add(3);
//     list.add(4);
//     list.add(5);

//         System.out.println(isMonotonic(list));


ArrayList<Integer> list2 = new ArrayList<>();  //still some errors
    list2.add(10);
    list2.add(6);
    list2.add(5);
    list2.add(8);
    // list2.add(4);
    // list2.add(5);

    lonelyNumbers(list2);
}}

