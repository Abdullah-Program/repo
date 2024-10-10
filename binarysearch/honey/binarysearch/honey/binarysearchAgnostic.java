package binarysearch.honey;

public class binarysearchAgnostic {
    public static void main(String[] args) {
        int [] arr = {-18,-12,-4,0,2,3,4,15,16,18,22,45,89};
        int target = 22;
        int ans = orderAgnosticbs(arr, target);
        System.out.println(ans);
    }
    static int orderAgnosticbs(int[] arr , int target)
    {
        // find the arr is ascending or descending   
        boolean isASC;
        int start = 0;
        int end = arr.length-1;
        if (arr[start]< arr[end])
        {
            isASC = true;
        }     else {
            isASC = false;
        }
        while (start <= end) {
         // find the middle elment 
         int mid = start + (end - start )/2;
         if (arr[mid] == target) {
            return mid;
         }
        if (isASC) {
            if (target<arr[mid]) {
                end = mid -1;
            }
            else  {
                start = mid+1;
           }
        }
        else 
        {
             if (target>arr[mid]) {
                 start = mid +1;
                }
             else  {
             end = mid -1;
       }
    }
        
        }
        return -1;
    }  
}
