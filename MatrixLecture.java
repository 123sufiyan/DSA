import java.util.*;

import javax.sql.rowset.spi.SyncResolver;

public class MatrixLecture {
    
    public static boolean searchKey(int matrix[][], int key) {
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j< matrix[0].length; j++){
                if(matrix[i][j]== key){
                    System.out.println("key found");
                    return true;
                }
            }
        }
        System.out.println("key not available");
        return false;
        
    }



public static void spiralMatrix(int arr[][]) {
    int startRow = 0;
    int startCol = 0;
    int endRow = arr.length-1;
    int endCol = arr[0].length-1;

    while(startRow<=endRow && startCol<= endCol){
        //i for rows and j for colums
       
        //top
        for(int j = startCol; j<=endCol; j++){
            System.out.print(arr[startRow][j]+" ");
        }

        //right
        for(int i = startRow+1; i<= endRow; i++){
            System.out.print(arr[i][endCol]+" ");
        }

        //bottom
        for(int j = endCol-1; j>=startCol; j--){
            if(startRow==endRow){
                break;
            }
            System.out.print(arr[endRow][j]+" ");
        }
                                                            //bottom and left do again
        //left
        for(int i = endRow-1; i>=startRow+1; i--){
            if(startCol==endCol){
                break;
            }
            System.out.print(arr[i][startCol]+" ");
        }
        startRow++;
        startCol++;
        endRow--;
        endCol--;
    }
    System.out.println();
}

public static int digonalSum(int num[][]) {
    int sum = 0;
    //bruteforce method

    // for(int i = 0; i<num.length; i++){
    //     for(int j = 0; j<num[0].length; j++){
    //         if(i ==j){
    //             sum += num[i][j];
    //         }
    //         else if(i+j == num.length-1){
    //             sum += num[i][j];
    //         }
    //     }

    for(int i = 0; i< num.length; i++){
        //primary digonal
        sum += num[i][i];

        //secondary digonal + n = odd case
        if(i != num.length-1-i){
            sum += num[i][num.length-i-1];
        }
    }
    return sum;
    }
 
    public static boolean sortedMatrix(int arr[][], int key) {
        int row = 0, col = arr[0].length-1;
        while(row < arr.length && col>=0){
            if(arr[row][col] == key){
                System.out.println("key is at (" + row+ "," + col+")");
                return true;
            }
            else if(key< arr[row][col]){
                col--;
            }
            else{row++;}
        }
        System.out.println("not found");
        return false;
    }
    public static void main(String[] args) {
        // int matrix[][] = new int[3][3];
        // int n = matrix.length;
        // int m = matrix[0].length;
        // System.out.println("enter numbers");
        // Scanner sc = new Scanner(System.in);
        // System.out.println();

        //  for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < m; j++) {

        //         matrix[i][j] = sc.nextInt();
        //     }
        // }

        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < m; j++) {
        //         System.out.print(matrix[i][j] + " ");
        //     }
        //     System.out.println();
        // }
        // searchKey(matrix, 5);

    



    int Matrix[][] = {{1,2,3,4},
                      {5,6,7,8},
                      {9,10,11,12},
                      {13,14,15,16}};
    // //Spiral matrix

    // //  spiralMatrix(Matrix);

    //  System.out.println(digonalSum(Matrix));


    //Search in sorted Matrix
    int matrix1[][] = {{10,20,30,40},
                       {15,25,35,45},
                       {27,29,37,48},
                       {32,33,39,50}};
    int key = 33;
    sortedMatrix(matrix1, key);
}}
