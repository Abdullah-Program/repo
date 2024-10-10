package com.honey;
import java.util.Arrays;
import java.util.Scanner;
public class Input {
    public static void main(String[] args) {
        // arrays of primitive
        Scanner in = new Scanner(System.in);
        // int[] arr = new int[5];
        // arr[0] = 12;
        // arr[1] = 132;
        // arr[2] = 124;
        // arr[3] = 126;
        // arr[4] = 2;

        // for (int i = 0; i < arr.length; i++) {
        //     arr[i] = in.nextInt();
        // }
        // System.out.println(Arrays.toString(arr));
        // // for (int i = 0; i < arr.length; i++) {
        // //     System.out.println(arr[i] + " ");
        // // }
        // //arrays of objects
        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));
        in.close();
    }
}
