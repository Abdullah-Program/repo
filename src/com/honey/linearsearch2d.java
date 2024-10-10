package com.honey;
import java.util.Arrays;
public class linearsearch2d {
    public static void main(String[] args) {
        int arr[][] ={
            {23,54 ,4,1},
            {19,4,8,57},
            {18,13}
        };
        // int target = 18;
        // int [] ans = searchmax(arr,target);
        // System.out.println(Arrays.toString(ans));
         System.out.println(searchmax(arr));        
    }
    //  static int[] search(int[][] arr, int target) {
    //  for (int row = 0; row < arr.length; row++) {
    //     for (int col = 0; col < arr[row].length; col++) {
    //         if (arr[row][col] == target) {
    //             return new int[]{row , col};
    //         }
    //     }
    //  }
    //  return new int[] {-1,-1};
    // }
    static int searchmax(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int row = 0; row < arr.length; row++) {
           for (int col = 0; col < arr[row].length; col++) {
               if (arr[row][col]> max ) {
                   max = arr [row][col];
        
               }
           }
        }
        return max;
       }
   }

