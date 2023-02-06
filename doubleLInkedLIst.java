import java.util.LinkedList;
public class doubleLInkedLIst {
   
   public class Node{
    int data;
    Node next;
    Node prev;
   
    public Node(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }
    }

   public static Node head;
   public static Node tail;
   public static int size;
   
   //adding in the LL
   public void addFirst(int data){
   Node n1 = new Node(data);
   size++;
    if(head == null){
        head = tail = n1;
        return;
    }
        n1.next = head;
        head.prev = n1;
        head = n1;

   }
   
   //print ll
   public void print(){
    Node temp = head;
    if(head == null){
        System.out.println("empty");
        return;
    }
    System.out.println("-------------------------");
    while (temp != null){
        System.out.print(temp.data + "<->");
        temp = temp.next;
    }
    System.out.println("null");
    System.out.println("-------------------------");
   }


   //remove last
   public int removeFirst(){
    if(head == null){
        System.out.println("empty");
        return Integer.MIN_VALUE;
    }

    if(size == 1){
        size--; 
        int val = head.data;
        head = tail = null;
        return val;
       
    }
    int val= head.data;
    size--;
    head = head.next;
    head.prev = null;
    return val;
  
   }

   public  void reverse_DLL() {
    Node curr = head;
    Node prev = null;
    Node next;

    while(curr != null){
        next = curr.next;
        curr.next = prev;
        curr.prev = next;

        prev = curr;
        curr = next;
    }
    head = prev;
   }
    public static void main(String[] args) {
        
        doubleLInkedLIst dll = new doubleLInkedLIst();

        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        dll.print();
        // System.out.println(dll.size);
        dll.reverse_DLL();
        dll.print();
    }
}
