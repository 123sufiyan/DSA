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
        

        // Stack<Integer> s = new Stack<>();
        // s.add(1);
        // s.add(2);
        // s.add(3);
        // pushAtBottom(s, 4);

        // while(!s.isEmpty()){
        //     System.out.println(s.peek());
        //     s.pop();
        // }
 
        //reverse string
        String code = "abc";
        String rsult = reverseString(code);
        System.out.println(rsult);
}}
