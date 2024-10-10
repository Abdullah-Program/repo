package com.honey;

public class linearsearchmin {
    public static void main(String[] args) {
        int [] arr = {12,3,45,65,4,-6};
        System.out.println(Min(arr));
    }

    static int Min(int[] arr) {
        int ans = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < ans) {
                ans = arr[i];
            }
        }
        return ans;
    }
}
