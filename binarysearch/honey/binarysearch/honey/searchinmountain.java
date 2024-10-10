package binarysearch.honey;
public class searchinmountain {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3,1};
        int target = 3;
        searchinmountain si = new searchinmountain();
        int result = si.search(arr, target);
        System.out.println("ELEMENT FOUND AT INDEX " + result);

    }
    int search (int[] arr , int target)
    {
        int peak = peakInMountainArray(arr);
        int firsttry = orderAgnosticbs(arr, target,0, peak);
        if (firsttry != -1){
          return firsttry;
        }
        return orderAgnosticbs(arr, target, peak+1,arr.length-1);
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
    static int orderAgnosticbs(int[] arr , int target,int start,int end)
    {
        // find the arr is ascending or descending   
        boolean isASC;
        
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
