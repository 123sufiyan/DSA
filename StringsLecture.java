import java.util.*;
public class StringsLecture {

public static boolean pelindroneStrings(String str) {
    for(int i = 0; i<str.length()/2; i++){
        int n = str.length();
        if(str.charAt(i) != str.charAt(n-1-i)){  ///be careful n-1-i and remember why
            return false;
        }
    }
    return true;
}    
    
    
public static float shortestPath(String str) {
    int x = 0,y = 0;  
    for(int i = 0; i< str.length(); i++){
        char direction = str.charAt(i);      ///store value of current direction

        //North
        if(direction == 'N'){
            y++;
        }
        
        //South
        else if(direction == 'S'){
            y--;
        }
        //west
        else if(direction == 'W'){
            x--;
        }
        else{x++;}
   
       

    }
    int X2 = x*x;
    int Y2 = y*y;
    return (float)Math.sqrt(X2+Y2);
}


public static String subString(String str , int start , int end) {
   String substring = "";
    for(int i = start; i<end-1; i++){
        substring += str.charAt(i);
    }
    return substring;
}




public static String wordsToUpperCase(String str) {
    StringBuilder sb = new StringBuilder("");
    char ch = Character.toUpperCase(str.charAt(0));
    sb.append(ch);
    for(int i = 1; i<str.length(); i++){
        if(str.charAt(i) == ' ' && i < str.length()-1){   //str.length-1 cause there should be any word after space and space should not be the last word.
            sb.append(str.charAt(i));
            ++i;
            sb.append(Character.toUpperCase(str.charAt(i)));
        }else{
            sb.append(str.charAt(i));
        }
        }
    return sb.toString();
}



public static String compressedString(String str) {
    
    String newStr = "";
    for(int i = 0; i< str.length(); i++){
        Integer count = 1;
        while(i<str.length()-1 && str.charAt(i)== str.charAt(i+1)){
            count++;
            i++;}
            newStr += str.charAt(i);
            if(count>1){
                newStr +=count.toString();
            }
    }return newStr;
}

public static String compressed2(String str) {
 
    StringBuilder sb = new StringBuilder("");
    for(int i = 0; i<str.length(); i++){
        Integer count =1;
        while(i < str.length()-1 && str.charAt(i) == str.charAt(i+1)){
            count++; 
            i++;
        }
        sb.append(str.charAt(i));
        if(count >1){
            sb.append(count);
        }
    }
    return sb.toString();
}




    
    public static void main(String[] args) {
    //input and output
    // Scanner sc = new Scanner(System.in);
    // String name = sc.nextLine(); //sc.next take only 1 word, sc.nextLine takes full line.
    // System.out.println(name );



// // //pelindrone strings
//     String str = "sufiyan";
//     System.out.println(pelindroneStrings(str));

// // Shortest path
// String path = "WNEENESENNN";
// System.out.println(shortestPath(path));

//Substring

// String str = "HElloWorld";
// System.out.println(subString(str, 0, 6));


// //largest string
// String fruits[] = {"apple", "mango", "banana"};
// String largest = fruits[0];
// for(int i = 0; i< fruits.length; i++){
//     if(largest.compareTo(fruits[i]) < 0 ) { // <0 for str 2 big
//         largest = fruits[i];

//     }
   
// }
// System.out.println(largest);


// //StringBuilder

// StringBuilder sb = new StringBuilder("");
// for(char ch='a'; ch <='z'; ch++){
//     sb.append(ch);
// }
// System.out.println(sb + " ");




// // // //uppercase
// String str = "hello, my name is sufiyan";
// System.out.println(wordsToUpperCase(str));





//Compressed string

String str = "aaabbcccdd";
System.out.println(compressed2(str));

}}


  
