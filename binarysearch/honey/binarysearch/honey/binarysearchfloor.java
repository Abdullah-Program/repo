package binarysearch.honey;

public class binarysearchfloor {
    public static void main(String[] args) {
        int [] arr = {2,3,5,9,14,16,18};
        int target = 1;
        System.out.println(floor(arr, target));
    }
    // return index greTEST of small no > = target
    static int floor(int [] arr, int target)
    {
       int start = 0;
       int end = arr.length-1;
       while (start <= end) {
        // find the middle elment 
        int mid = start + (end - start )/2;
        if (target<arr[mid]) {
            end = mid -1;
        }
        else if (target> arr[mid]) {
            start = mid+1;
       }
       else 
       {
        return mid;
       }
       }
       return end;
    }
}