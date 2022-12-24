import java.util.*;

import javax.sql.rowset.spi.SyncResolver;

public class matrixAssignment {

public static void questionOne(int arr[][] , int key) {
    int dublicate = 0;
    int n = arr.length;
    int m = arr[0].length;

    for(int i = 0; i<n; i++){
        for(int j = 0; j<m; j++){
            if(arr[i][j] == key ){
                dublicate++;
            }
        }

    }
    System.out.println(dublicate);
}

public static void questionTwo(int arr [][]) {
    int n = arr.length;
    int m = arr[0].length;
    int sum = 0;
        for(int j = 0; j < m; j++){

            sum += arr[1][j];
        }
    System.out.println(sum);

    }
    
    public static void main(String[] args) {
        //Q1
        // int[][] array = { {4,7,8},
        //                   {8,8,7} };
        // int key = 8;
        // questionOne(array, key);




        //Q2
        int[][] nums = { {1,4,9},
                         {11,4,3},
                         {2,2,3} };
  questionTwo(nums);





}}