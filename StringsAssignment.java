import java.util.Arrays;
import java.util.concurrent.CountDownLatch;

public class StringsAssignment {
 public static int question1(String str){
    Integer count = 0;
    for(int i = 0; i< str.length(); i++){
        
        if(str.charAt(i) =='a' || str.charAt(i) =='e' || str.charAt(i) =='i' || str.charAt(i) =='o' || str.charAt(i) =='u'){
            count++;
        }
    }
 System.out.println("the number of times vowels uses are " + count);
 return count;
 }  
   
   
   
   

 public static void questionTwo(String str1, String str2) {
    //first convert strings to lowercase

    str1 = str1.toLowerCase();
    str2 = str2.toLowerCase();
    char[] str1Array = str1.toCharArray(); // converted strings into arrays for sorting
    char[] str2Array = str2.toCharArray();

    // cheaking if the strings are equal length or not

    if(str1.length() == str2.length()){
        // sort array
        Arrays.sort(str1Array);
        Arrays.sort(str2Array);

        //check if the sorted arrays are ame or not

        boolean result = Arrays.equals(str1Array, str2Array);
        if(result){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }



 }
   
    public static void main(String[] args) {
        
        
        // // Q1 done 
        // String str = "abcde" ;
        // question1(str);



        //Q4 imp h

        String str1 = "earth";
        String str2 = "heart";
        questionTwo(str1, str2);




}}
