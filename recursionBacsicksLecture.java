public class recursionBacsicksLecture {
    public static void printDecreasing(int n) {
        //normal method
        // for(int i = n; i<=1; i--){
        //     System.out.println(i);
        // }
            
        //recusion method
        if(n ==1){
                System.out.print(n);
                return;
            }
        System.out.print(n +" ");
        printDecreasing(n-1);
        
    }

    public static void printIncreasing(int n) {
        if(n == 1){
            System.out.print(n+" ");
            return;
        }
        printIncreasing(n-1);
        System.out.print(n+ " ");
        }

    public static int factorial(int n) {
            if(n == 0){
                return 1;
            }
            int fnm1 = factorial(n-1);
            int fn = n * factorial(n-1);
            return fn;}


    public static int calSum(int n) {
                if(n == 1){
                    return 1;
                }
                int sum1 = calSum(n-1);
                int sum = n + calSum(n-1);
                return sum;
                }




    public static int fibonacci(int n) {
                    if(n == 0 ){
                        return 0;
                    }
                    if(n == 1){
                        return 1;
                    }

                    int fib1 = fibonacci(n-1);
                    int fib2 = fibonacci(n-2);
                    int fibn = fib1 + fib2;

                    return fibn;
                    
                }



    public static boolean sortedArray(int arr[], int i) {
                   if(i == arr.length-1){ //base case
                    return true;
                   }
                    if(arr[i]> arr[i+1]){
                        return false;
                    }
                    sortedArray(arr, i+1);
                    return sortedArray(arr, i+1);

                }

     public static int  firstOccurence(int arr[], int key, int i) {
                    if(i == arr.length){  //base case
                        return -1;
                    }
                    if(arr[i] == key){
                        return i;
                    }

                    firstOccurence(arr, key, i+1);
                    return firstOccurence(arr, key, i+1);
                    
                }
        public static int lastOccurence(int arr[], int key, int i) { //incomplete(didnt understood properly)
            if(i == arr.length){
                return -1;
            }
            int isFound = lastOccurence(arr, key, i+1);
         
            if(isFound == -1 && arr[i] ==key){
                return i;
            }
            return isFound;
            
        }        

    

    public static int power(int x, int n) {
  
   //THIS IS MY METHOD, WORKING FINE,change val to double for work
    //     if(n == 1){
    //         return  n;
    //     }
    //    double pow1 = Math.pow(x, n-1);
    //     power(x,n-1);
    //    double pow2 = x*(Math.pow(x, n-1));

    //     return pow2;

    if(n == 0){
        return  1;
    }
   int pow1 = power(x,n-1);
    
   int pow2 = x*(pow1);

    return pow2;
    }


    public static int optimizedPower(int a, int n) {//everything is correct, idk why it is not working
        if(n == 0){
            return 1;
        }
        int halfPower = optimizedPower(a, n/2);
        //for even
        int halfPowerSq =  halfPower * halfPower;
        //for odd
        if(a % 2 != 0){
            halfPowerSq = a * halfPowerSq;
        }

        return halfPowerSq;
        
    }

    public static int tilingProblem(int n) { //2 X n where n is length
        //BASE CASE
        if(n ==1 || n ==0){
            return 1;
        }
        //KAAM
        //vertical
        int fnm1 = tilingProblem(n-1);
        //horizontal
        int fnm2 = tilingProblem(n-2);
        int totalWays = fnm1 + fnm2;
        return totalWays;
      // 1 line me bhi ho sakta h
        // return tilingProblem(n-1) + tilingProblem(n-2);
    }



   //DO IT, DIDNT UNDERSTAND
    public static void removeDublicate(String str, int idx, StringBuilder newStr, Boolean map[] ) {
        if(idx ==str.length()){
            System.out.println(newStr);
            return;
        }

        //kaam
        char currChar = str.charAt(idx);
        if(map[currChar - 'a'] == true){
            //dublicate
            removeDublicate(str, idx, newStr, map);
        }
        else{
            map[currChar - 'a'] = true;
            removeDublicate(str, idx, newStr, map);}
        }
    

        public static int friendsPairing(int n) {
            //base case
            if(n ==1 || n ==2){
                return n;
            }
            //choice
            //single
            int fnm1 = friendsPairing(n-1);
            //pair
            int fnm2 = friendsPairing(n-2);
            int pairWays = (n-1) * fnm2;

            int totalWays  = fnm1 + pairWays;
            return totalWays;
        }


    public static void printBinaryStrings(int n, int lastPlace, String str) {
        //base case
        if(n == 0){
            System.out.println(str);
            return;
        }
        //kaam
        printBinaryStrings(n-1, 0, str+"0");
        if(lastPlace ==0){
            printBinaryStrings(n-1, 1, str+"1");
        }
    }    
    public static void main(String[] args) {

    //  int n = 5 ; 
    //  System.out.println("put the fun u wanna check");

    //  int array[] = {1,2,3,4,6,7,8,9};
    // //  System.out.println(sortedArray(array, 0));
    // System.out.println(lastOccurence(array, 2, 3));



// //TILING PROBLEM(IMPORTANT)
// System.out.println(tilingProblem(4));

// //move dublicate
// String str = "apnacollege";
// System.out.println(removeDublicate(str, 0, new StringBuilder(""), new boolean[26]));



// //friendsPairing
// System.out.println(friendsPairing(3));



printBinaryStrings(3, 0, "");




    }}
