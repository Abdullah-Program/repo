package com.honey;

public class linearsearcharray {
    public static void main(String[] args) {
        int[] nums = {23,45,2,1,8,-5,67};
        int target =-5;
        int ans = linearSearch2(nums, target);
        int ans2 = linearSearch(nums, target);
        System.out.println(ans);
        System.out.println(ans2);
    }
    // for element
    static int linearSearch2 (int[] arr, int target)
    {
     if (arr.length == 0) {
        return-1;
     }
     for (int index = 0; index < arr.length; index++) {
        int element = arr[index];
        if (element == target)
        {
            return element;
        }
     }
    return -1;
    }
    static int linearSearch (int[] arr, int target)
    {
     if (arr.length == 0) {
        return-1;
     }
     for (int index = 0; index < arr.length; index++) {
        int element = arr[index];
        if (element == target)
        {
            return index;
        }
     }
    return -1;
    }
}
