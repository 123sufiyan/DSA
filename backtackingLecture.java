public class backtackingLecture {
    
    public static void printArray(int arr[]) {
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void changeArray(int arr[], int index, int val) {

        //base case
        if(index == arr.length){
            printArray(arr);
            return;
        }
        //recursion
        arr[index] = val;
        changeArray(arr, index + 1, val + 1);
        arr[index] = arr[index] -2; 
    }

    public static void findSubsets(String str, String answer, int index) {
        //base case
        if(index == str.length()){
            System.out.println(answer);
            return;
        }
        //recursion(kaam)
        // choice is yes
        findSubsets(str, answer + str.charAt(index), index+1);
        //if choice is no
        findSubsets(str, answer, index + 1);
        
    }




    public static void findPermutations(String str , String ans) {
        //base case
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }
        
        //recursion(kaam)
        for(int i = 0; i <str.length(); i++ ){
            char curr = str.charAt(i);
            //deleating the ith char from thr main string
            // "abcde" if deleate c then, "ab" + "de" = "abde" 
            String newStr = str.substring(0, i) + str.substring(i+1 , str.length()); // even if you write only i+1; it will work, no need to write the last element
            findPermutations(newStr, ans+curr);
        }
    }


//---------------------------------------------------------------------------------------------------


    //N QUEENS
    static int count = 0;  
    public static void nQueens(char board[][], int row) { //row == i
    //base case//
    if(row == board.length){
        printBoard(board);
        count++;
        return;
    }
    // // for column//()
    // for(int j = 0; j<board.length; j++ ){
    //     board[row][j] = 'Q';
    //     nQueens(board, row+1); //function call(recursion)
    //     board[row][j] = 'X';    //backtracking
    // }
    

    //main solution

     for(int j = 0; j<board.length; j++ ){
       if(isSafe(board, row, j)){
        board[row][j] = 'Q';
        nQueens(board, row+1); //function call(recursion)
        board[row][j] = 'X';    //backtracking
       }

    }
 
}
//print only 1 solution// tell if solution exists problem
public static boolean nQueens1(char board[][], int row) { //row == i
    //base case//
    if(row == board.length){
        count++;
        return true;
    }
    for(int j = 0; j<board.length; j++ ){
       if(isSafe(board, row, j)){
        board[row][j] = 'Q';
        if(nQueens1(board,row+1)){
            return true;
        }
        board[row][j] = 'X';
       }

    }
    return false;
}



public static boolean isSafe(char board[][],int row, int col) {
    //vertical up
    for(int i = row-1; i>= 0; i--){
        if(board[i][col] == 'Q'){
            return false;
        }
    }

    // digonal upper left
    for(int i = row-1, j = col-1; i>=0 && j>= 0; i--,j--){
        if(board[i][j]=='Q'){
            return false;
        }
    }

    //digonal upper right
    for(int i = row-1, j = col+1; i>=0 && j<board.length; i--, j++){
        if(board[i][j]=='Q'){
            return false;
        }
    }
    return true;
}   
public static void printBoard(char board[][]) {
        for(int i = 0; i<board.length; i++){
            for(int j = 0; j<board.length; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    //----------------------------------------------------------


    public static int gridWays(int i, int j, int n, int m) {
        //base case
        if(i ==n-1 && j == m-1){ //last cell
            return 1;
        }else if(i ==n || j ==n){
            return 0;}
        //recursion
        int way1 = gridWays(i+1, j, n, m);
        int way2 = gridWays(i, j+1, n, m);
        return way1+way2;
        
    }




    //----------------------------------------------//
    public static boolean sudokuSolver(int sudoku[][], int row, int col) {
         //base case
        if(row == 9){
            return true;}

        //recursion
        int nextRow = row; int nextCol = col+1;
        if(col + 1 == 9){
            nextRow = row+1;
            nextCol = 0;
        }
        
        if(sudoku[row][col] != 0){
            return sudokuSolver(sudoku, nextRow, nextCol);
        }

        for(int digit = 1;digit <=9; digit++){
            if(isSafe(sudoku, row, col,  digit)){
                sudoku[row][col] = digit;
                if(sudokuSolver(sudoku, nextRow, nextCol)){ // solution exists
                    return true;
                }
                sudoku[row][col] = 0;
            }
        }
        return false;
    }




    public static boolean isSafe( int sudoku[][], int row, int col, int digit) {
        //column condition
        for(int i = 0; i<= 8; i++){
            if(sudoku[i][col] == digit){
                return false;
            }
        }

        // row condition
        for(int j = 0; j<= 8; j++){
            if(sudoku[row][j] == digit){
                return false;
            }
        }

        // grid (3X3 choti waali)

        int startingRow = (row/3) * 3;
        int startingCol = (col/3) * 3;

        for(int i = startingRow; i < startingRow+3; i++){
            for(int j =startingCol; j < startingCol+3; j++){
                if(sudoku[i][j] == digit){
                    return false;
                }
            }
        }
        return true;
    }


    public static void printSudoku(int arr[][]) {
        for(int i = 0; i<9; i++){
            for(int j = 0; j<9; j++){
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // //change array
        // int arr[] = new int[5];
        // changeArray(arr, 0, 1);
        // printArray(arr);
    


        // //Find Substes in an array
        // String str = "abc";
        // findSubsets(str, "", 0);
        
        
        
        // //Find permutations
        // String str = "abc";
        // findPermutations(str, "");





        // // //N QUEENS
        // int n =5;
        // char board[][] = new char[n][n];
        // //initialize
        // for(int i = 0; i<n; i++){
        //     for(int j = 0; j<n;j++){
        //         board[i][j] = 'X';
        //     }
        // }
        // nQueens(board, 0);  
        // System.out.println("total soln is "+ count);
        
       //PRINT ONE SOLUTION, IF SOLUTION EXISTS
        //    if(nQueens1(board, 0)){
        //     System.out.println("solution is possible");
        //     printBoard(board);
        //    }
        //    else{System.out.println("soln is not possible");}




            // // Grid Ways
            // int n = 3, m = 3;
            // System.out.println(gridWays(0, 0, n, m));




            //SUDUKU SOLUTION
            int sudoku[][] = {{0, 0, 8, 0, 0, 0, 0, 0, 0},
                              {4, 9, 0, 1, 5, 7, 0, 0, 2},
                              {0, 0, 3, 0, 0, 4, 1, 9, 0},
                              {1, 8, 5, 0, 6, 0, 0, 2, 0},
                              {0, 0, 0, 0, 2, 0, 0, 6, 0},
                              {9, 6, 0, 4, 0, 5, 3, 0, 0},
                              {0, 3, 0, 0, 7, 2, 0, 0, 4},
                              {0, 4, 9, 0, 3, 0, 0, 5, 7},
                              {8, 2, 7, 0, 0, 9, 0, 1, 3}  };


            if(sudokuSolver(sudoku, 0, 0)){
                System.out.println("soln exists");
                printSudoku(sudoku);
            }else{System.out.println("soln dosent exist");}


    }}
