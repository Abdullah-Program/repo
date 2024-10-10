package binarysearch.honey;
public class mountainpeak {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,3,2};
        System.out.println(peakInMountainArray(arr));
    }
    public static int peakInMountainArray(int[]arr)
    {
     int start = 0;
     int end = arr.length-1;
     while (start<end) {
        int mid = start + (end -start)/2;
        if (arr[mid] > arr[mid+1]) {
         // dec
         end =mid;   
        }
        else 
        {
            start = mid +1;
        }
     }
     return start; 
    }
}
