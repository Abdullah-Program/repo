package com.honey;
import java.util.Arrays ;
/**
 * changeValue
 */
public class changeValue {

    public static void main(String[] args) {
        int [] arr = {1,2,3,45,6};
        change(arr);
        System.out.println(Arrays.toString(arr));
    
    }

    static void change(int[] num) {
        num[0]=99;
    } 
}