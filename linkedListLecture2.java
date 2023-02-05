import java.util.LinkedList;

public class linkedListLecture2 {
    public static class Node{

        int data;
        Node next = null;
    
        Node(int data){   //new node constructor
            this.data = data;
            this.next = null;
        }
       }
       
       public static Node head;
       public static Node tail;



     public static boolean isCycle() {
        
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        
        
        return false;
     }



     public static void removeCycle() {  //code doesnot cover a corner case where the LL is connected to head 1->2->3->4->1
        //detect cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                cycle = true;
                break;
            }
        }

        if(cycle = false){
            return;
        }
        //find meeting point
        Node previous = null;
        slow = head;

        while(slow!= fast){
            slow = slow.next;
            previous = fast;
            fast = fast.next;
        }
        //remove cycle -> last.next = null
        previous.next = null;

     }
    
    //------------------------------------------------------------------------------------------


    //MERGE SORT


    // ///HELPER FUNCTIONS
    // private static Node merge(Node head){
    //     Node slow = head;
    //     Node fast = head.next;

    //     while()
    // }

    // public static Node mergeSort(Node head) {  //incomplete
    //     //base case
    //     if(head == null && head.next == null){
    //         return head;
    //     }
    //     //find mid
    //     Node mid = getMid();
        
    //     //do merge sort on left and right
    //     Node rightHead = mid.next;
    //     mid.next = null;

    //     Node newLeft = mergeSort(head);
    //     Node newRight = mergeSort(rightHead);
       
       
    //     //merge
    //     return merge(newLeft, newRight); 
    // }
    //-----------------------------------------------------------------------------------------

    public static void zigZag_LinkedList() {
        //find mid
        Node slow = head;
        Node fast = head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;

    
        //reverse 2nd half
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;

        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            curr = next;
        }

        Node left = head;
        Node right = prev;
      
        Node nextR = right.next;  // the error is solved using chat gpt idk how it works
        Node nextL;
        //Node nextR  this alone is throwing errors idk why
        
       //alt merge zig-zag
       while(left !=null && right != null){
       
        nextL = left.next;
        left.next = right;
        right.next = nextL; 
    
        left = nextL;
        right = nextR;
    }
    }
    
    
    
    
    
    
    
    
     public static void main(String[] args) {

// // if loop exists problem
//         head = new Node(1);
//         Node temp = new Node(2);
//         head.next = temp;
//         head.next.next = new Node(3);
//         head.next.next.next = temp;
//         //1->2->3->2
//         System.out.println(isCycle());
//         removeCycle();
//         System.out.println(isCycle());




        //creating LL using java collection framework(inbuilt function)
        LinkedList<Integer> ll = new LinkedList<>();
        // ll.add(1);  //ll.add is same as ll.addLast
        // ll.add(2);
        // // ll.addFirst(2);
        // System.out.println(ll);  
        // ll.remove();    // same as ll.removeFirst
        // System.out.println(ll);




        //zig-zag
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);
        System.out.println(ll);
        zigZag_LinkedList();
        System.out.println(ll);



    }}
