import java.util.*;
public class recursionAssignmnet {
   public static void towerOfHanoi(int n, char source, char helper, char destination) {
    //base case
    if(n == 1){
        System.out.println("Move disk "+n+" from "+source+" to "+destination);
        return;
    }
    //step 1 (see notes)
    towerOfHanoi(n-1, source, destination, helper);
    
    //step 2(put biggest disk to destination)
    System.out.println("Move disk "+n+" from "+source+" to "+destination);
    
    //step 3(put the n-1 disks to destination)
    towerOfHanoi(n-1, helper, source, destination );
}
    public static void main(String[] args) {
        int n = 3;
        towerOfHanoi(n, 'A', 'B', 'C');
    }}
