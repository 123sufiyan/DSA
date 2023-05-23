import java.util.*;
public class revision {
    public static void pushAtBottom(Stack<Integer> s) {
      Stack<Integer> s2 = new Stack<>();
      while(!s.empty()){
        int top = s.pop();
        s2.add(top);
      }

      while(!s2.isEmpty()){
        System.out.println(s.peek());
        s.pop();
    }
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.add(1);
        s.add(2);
        s.add(3);

        
        // while(!s.isEmpty()){
        //     System.out.println(s.peek());
        //     s.pop();
        // }

        // pushAtBottom(s);
    }
}
