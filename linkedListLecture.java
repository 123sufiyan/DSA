import java.util.LinkedList;

public class linkedListLecture {
   
    //Creating a new linked list
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
   public static int size;
    
   
public static void addFirst(int data) {
    //step1 = create new node
    Node newNode = new Node(data);     //newNode is called as object and data is passed(called) as constructor 
    size++;

    if(head == null){  //empty linked list
        head = tail = newNode;
        return;
    }
    //step 2-newNode next = head
    newNode.next = head;  //linking

    //step 3: head = newNode
    head = newNode; 

}

public static void addLast(int data) {
    //create new node
   
    Node n1 = new Node(data);
    size++;

    if(head == null){
        head = tail = n1;
        return;
    }
    tail.next = n1;
    tail = n1;
}
//------------------------------------------------------------
//initialization if ll is complete till here, below are function of problems




    public void print(){    //everything is correct idk why not working
        
        if(head == null){
            System.out.println("ll is empty");
            return;
        }
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println();
    }
 


    public void add1(int index, int data){
        Node n2 = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        
        while(i < index-1){     /// where temp --> prev node
           temp = temp.next;
           i++;

        }
        n2.next = temp.next;
        temp.next = n2;
    }


    public int removeFirst(){
       //corner cases
       if(size == 0){
        System.out.println("LL is empty");
        return Integer.MIN_VALUE;
       }else if(size == 1){
        int val = head.data;
        head = tail = null;
        size = 0;
        return val;
       }
        
        int value = head.data;
        head = head.next;
        size--;
        return value;
    }



    public int removeLast(){
        // corner cases
        if(size == 0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }else if(size ==1){
           int value = head.data;
            head = tail = null;
            size = 0;
            return value;
            }
        
        
        
        Node previous = head;
        // 2nd last node is size-1
        for(int i = 0; i<size-2; i++){
            previous = previous.next;
        }
        int value = previous.next.data;  //data of last element that is about to get delete
        previous.next = null;
        tail = previous;
        size--;
        return value;
    }



    public int search(int key){
        int index = 0;
        Node temp = head;
        while(temp != null){
            if(temp.data == key){
                return index;
            }
            temp = temp.next;
            index++;
        }
        
        return -1;
    }


// -----------------------  MY CODE
    public static int helper(Node head, int key){
        if(head == null){
            return -1;
        }

        if(head.data == key){
            return 0;
        }
        int index = helper(head.next, key);
        if(index == -1){
            return -1;
        }
        return index+1;
    }
    public static int searchRecursion(int key){ 
       return helper(head, key);
            }
        //--------------------------------------
        // public static int searchRecursion(int key){  // bro chat gpt ne bejjatii kardi, pr code de dyia, I am crying rn
        //     return helper(head, key, 0); 
        // }
    
        // public static int helper(Node head, int key, int index) {
        //     if (head == null) { 
        //         return -1; 
        //     }
        //     if (head.data == key) {
        //         return index;
        //     }
        //     return helper(head.next, key, index + 1); 
        // }





        public static void reverseLInkedlist(){ 
            Node prev = null;
            Node curr = tail = head;
            Node next;

            while(curr!= null){
                // STEP 1
                next = curr.next;
                // STEP 2
                curr.next = prev;
                // STEP 3
                prev = curr;
                // STEP 4
                curr = next;
            }
            head = prev;
        }



        public void delete_Nth_element(int n){
           //calculate size of node
           int size = 0;
           Node temp = head;
           while(temp != null){
            temp = temp.next;
            size++;
           }

           if(n == size){  // to delete head
            head = head.next;
            return;
           }



           //to go till nth term
           int i = 1;
           int iToFind = size-n;
           Node prev = head;
           while(i < iToFind){ //runnning loop till the value of actual prev of nth node comes inside
            prev = prev.next;
            i++;
           }

           prev.next = prev.next.next;
           return;
        }





// -----------------------------------------
        //  check if ll is pelindrome

        //step 1 find mid node
        // step 2 reverse 2nd half of ll
        // step 3  check if 1st half = 2nd half
       
        public static Node findMid(Node head){  // slow fast is turtle hare approach
            Node slow = head;
            Node fast = head;
            while(fast != null && fast.next != null){
                slow = slow.next;  //+1
                fast = fast.next.next;  //+2
            }
            return slow;  //slow is mid node
        }

        public static boolean isPelindrome() {
            if( head == null || head.next == null){
                return true;
            }

            //step 1
            Node midNode = findMid(head);
            
            //step 2 reverse node from mid
            Node prev = null;
            Node curr = midNode;
            Node next;
            while(curr != null){
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;

            }
            Node right = prev; //head for 2nd half
            Node left = head;

            //      THIS APPROACH WONT WORK, IT WILL SHOW TRUE BEFORE CHECKING FULL LINKEDLIST
            // while(right != null ){
            //     if(left.data == right.data){
            //         return true;
            //     }
            //     left = left.next; 
            //     right = right.next;
            // }
            // return false;

            while(right != null ){  //better approach
                if(left.data != right.data){
                    return false;
                }
                left = left.next; 
                right = right.next;
            }
            return true;
        }
    public static void main(String[] args) {
//         linkedListLecture ll = new linkedListLecture();  //check yourself why we need file name and not LinkedLIst
//         ll.addFirst(2);
//         ll.addFirst(1);
//         ll.addLast(3);
//         ll.addLast(4);

//   //    System.out.println(ll.size);
//        ll.removeFirst();
//        ll.print();
//        System.out.println();
//        ll.removeLast();
//        ll.print();
//        System.out.println(ll.size);
    

linkedListLecture ll1 = new linkedListLecture();
        // ll1.addFirst(1);
        // ll1.addFirst(2);
        // ll1.addLast(1);
        // ll1.addLast(2);
        // ll1.print();
       
       
       
        // System.out.println(ll1.search(4));
        
        
        
        
        // System.out.println(searchRecursion(3));
       
       
        // ll1.reverseLInkedlist();
        // ll1.print();
       

        //  ll1.delete_Nth_element(2);
        //  ll1.print();



        //check pelindrome
        linkedListLecture ll2 = new linkedListLecture();
        ll2.addLast(1);
        ll2.addLast(2);
        ll2.addLast(2);
        ll2.addLast(1);
        ll2.print();
        System.out.println(ll2.isPelindrome());
    }}
