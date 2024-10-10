package com.honey;

// import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
// import java.util.Arrays;
public class arr2d {
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int [][] arr = new int[3][3];
    System.out.println(arr.length);
    // input
    for (int r = 0; r <arr.length ; r++){
        for (int c = 0; c < arr[r].length; c++) {
            arr[r][c] =in.nextInt(); 
        }
    }
    // output
    // for (int r = 0; r <arr.length ; r++){
    //     for (int c = 0; c < arr[r].length; c++) {
    //         // System.out.println(arr[r][c] + " ");
    //         System.out.print(arr[r][c] + " "); 
    //     }
    //     System.out.println();
    // }
    // for (int r = 0; r <arr.length ; r++){
    //     System.out.println(Arrays.toString(arr[r]));
    // }
    for (int[] a : arr) {
        System.out.println(Arrays.toString(a));
    }
    in.close();
}
}
