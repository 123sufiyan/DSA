import java.util.ArrayList;
import java.util.Stack;
public class stacksLecture {  //comment out class to use inbuilt java collection framework for solving questions

//     static class StackB{  //Stackb name caue serious confusion of 2 stack named class
      
//        //STACK USING ARRAYLIST
//         // static ArrayList<Integer> list = new ArrayList<>();
//         // public static boolean isEmpty() {
//         //     return list.size() == 0;
//         // } 

//         // //push
//         // public static void push(int data) {
//         //     list.add(data);
//         // }

//         // //pop
//         // public static int pop(){ //all operation are O(1)
//         //     int top = list.get(list.size() - 1);
//         //     list.remove(list.size() - 1);
//         //     return top; }

//         // //peek
//         // public static int peek() {
//         //     return list.get(list.size() - 1);
//         // }    

        
//         // STACK USING LINKEDLIST

//         public  static class Node{
//             int data;
//             Node next;

//             Node(int data){
//                 this.data = data;
//                 this.next = null;

//             }
//         }

//         static class Stack{
//             static Node head = null;

//             public static boolean isEmpty() {
//                 return head == null;   // if true then return true, else false
//             }
             
        
            
//         public static void push(int data) { //push
//             Node n1 = new Node(data);

//             if(isEmpty()){
//                 head = n1;
//                 return;
//             }
//         n1.next = head;
//         head = n1;
//         }

//         //pop
//         public static int pop() {
//             if(isEmpty()){
//                 return -1;
//             }

//             int top = head.data;
//             head = head.next;
//             return top;
//         }

//         //peek
//         public static int peek() {
//             if(isEmpty()){
//                 return -1;
//             }
//             return head.data;
//         }
//     }
// }
  
        
       
 public static void pushAtBottom(Stack<Integer> s, int data) {
    if(s.isEmpty()){
        s.push(data);
        return;
    }
    int top = s.pop();
    pushAtBottom(s, data);
    s.push(top);
 }

 public static String reverseString(String str) {
    Stack<Character> s = new Stack<>();
    int index = 0;
     while(index < str.length()){
        s.push(str.charAt(index));
        index++;
     }
    StringBuilder result = new StringBuilder();
    while(!s.isEmpty()){
        char curr = s.pop();
        result.append(curr);
    }
    return result.toString();
 }


   public static void reverseStack(Stack<Integer> s) {
         if(s.isEmpty()){
            return;
         }

         int top = s.pop();
         reverseStack(s);
         pushAtBottom(s, top);


   }

      public static void printStack(Stack<Integer> s) {
         while(!s.isEmpty()){
            int print = s.pop();
            System.out.print(print);
         }
         System.out.println();
      }



      public static void stockSpan(int stock[], int span[]) {
            Stack<Integer> s = new Stack<>();
            span[0] = 1; 
            s.push(0);

            for(int i = 1; i< stock.length; i++){
               int currPrice = stock[i];

               while(!s.isEmpty() && currPrice > stock[s.peek()]){
                  s.pop();
               }
               if(s.isEmpty()){
                  span[i] = i+1;  
               }else{
                  int prevHigh = s.peek();
                  span[i] = i - prevHigh;
               }
               s.push(i);
            }
      }
    public static void main(String[] args) {
        

        // //  //making of stack using arraylist
        //  Stack s = new Stack();
        // // Stack<Integer> = new Stack<>();  //we can implement directly using java collection framework without making any classes
        //  s.push(1);
        //  s.push(2);
        //  s.push(3);


        //  while(!s.isEmpty()){  //jabtak stack khaali nai hojata
        //     System.out.println(s.peek());
        //     s.pop();
        //  }
        

        Stack<Integer> s = new Stack<>();
        s.add(1);
        s.add(2);
        s.add(3);
      //   printStack(s);
        //optput is 3  2  1
        // pushAtBottom(s, 4);

        // while(!s.isEmpty()){
        //     System.out.println(s.peek());
        //     s.pop();
        // }
 
      //   //reverse string
      //   String code = "abc";
      //   String rsult = reverseString(code);
      //   System.out.println(rsult);
        
      
      // //reverse stack
      // reverseStack(s);
      // printStack(s);



      // //Stock Span problem
      // int stock[] = {100, 80, 60, 70, 60, 85, 100};
      // int span[] = new int[stock.length];
      // stockSpan(stock, span);

      // for(int i = 0; i<span.length; i++){
      //    System.out.println(span[i] + " ");
      // int max = Integer.MIN_VALUE;
      // // int min = Integer.MAX_VALUE;
      // }


         // Next greater Element
         int arr[] = {6, 8, 0, 1, 3};
         Stack<Integer> s1 = new Stack<>();
         int nxtGreater[] = new int[arr.length];
         for(int i = arr.length-1; i >=0; i-- ){
            //Step1
            while(!s1.isEmpty() &&  arr[s1.peek()] <= arr[i]){
               s1.pop();
            }

            //Step 2
            if(s1.isEmpty()){
               nxtGreater[i] = -1;
            }else{
               nxtGreater[i] = arr[s1.peek()];
            }

            //Step 3
            s1.push(i);
         }

         for(int i = 0; i <  nxtGreater.length; i++){
            System.out.print(nxtGreater[i] + " ");
         } System.out.println();
   }
}
