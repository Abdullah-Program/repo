package com.honey;
public class linearsearchinrange {
    public static void main(String[] args) {
        int[] arr = {18,2,47,65,12};
        int target = 65;
        System.out.println(linearSearch(arr, target, 1,4 ));
    }
    static int linearSearch (int[] arr, int target,int start,int end)
    {
     if (arr.length == 0) {
        return-1;
     }
     for (int index = start; index < end; index++) {
        int element = arr[index];
        if (element == target)
        {
            return index;
        }
     }
    return -1;
    }
}
