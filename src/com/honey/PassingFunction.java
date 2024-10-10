package com.honey;
import java.util.Arrays;
public class PassingFunction {
    public static void main(String[] args) {
        int[] nums = {3,6,23,212};
        System.out.println(Arrays.toString(nums));
        changename(nums);
        System.out.println(Arrays.toString(nums));
        
    }

    static void changename(int[] arr) {
        arr [0] = 99;
    }
}
