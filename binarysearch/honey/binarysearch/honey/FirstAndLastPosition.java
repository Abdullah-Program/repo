package binarysearch.honey;

public class FirstAndLastPosition {
    public static void main(String[] args) {
     int [] nums = {1,2,2,4,2,2};
     int target = 2;
       FirstAndLastPosition solution = new FirstAndLastPosition();
        int[] result = solution.searchRange(nums, target);
        
        // Print result
        System.out.println("First and Last Position of " + target + ": [" + result[0] + ", " + result[1] + "]");
    }

    public int[] searchRange(int[] nums, int target) {

        int[] ans = {-1, -1};
        // check for first occurrence if target first
        ans[0] = search(nums, target, true);
        if (ans[0] != -1) {
            ans[1] = search(nums, target, false);
        }
        return ans;
    }

    // this function just returns the index value of target
    int search(int[] nums, int target, boolean findStartIndex) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
        while(start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                // potential ans found
                ans = mid;
                if (findStartIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
// package binarysearch.honey;

// public class binaryfirstandlastposition {
//     public static void main(String[] args) {
        
//     }
//      public int[] searchRange(int [] arr, int target)
//     {
//       int[] ans = {-1,-1};
//       int start = search(arr, target, true);
//       int end = search(arr, target, false);
//       ans[0] = start;
//       ans[1] = end; 
//       return ans;
//        // check for first occurance if target found
//     }
       
//     //    return ans;
//     int search (int [] arr , int target, boolean finstartindex)
//     {
//        int ans = -1;
//         int start = 0; 
//         int end = arr.length-1;
//         while (start <= end) {
//          // find the middle elment 
//          int mid = start + (end - start )/2;
//          if (target<arr[mid]) {
//              end = mid -1;
//          }
//          else if (target> arr[mid]) {
//              start = mid+1;
//         }
//         else 
//         {
//             ans = mid;
//             if (finstartindex) {
//                 end = mid-1;
//             }
//             else {
//                 start = mid +1;
//             }
//         }
//         }
//         return ans;
//     }
//     }
