package binarysearch.honey;

public class splitarraylargestsum {
    public static void main(String[] args) {
        int[] nums = {7,2,5,10,8};
        int m = 2;
        splitarraylargestsum si = new splitarraylargestsum();
        System.out.println(si.splitArray(nums, m));
    }
    public int splitArray(int[] nums, int m )
    {
     int start = 0;
     int end = 0;
     for (int i = 0; i < nums.length; i++) {
        start = Math.max(start, nums[i]);
        end += nums[i];
     }
     while (start < end) {
        int mid = start + (end-start)/2;
        int sum =0;
        int piece = 1;
        for (int num : nums) {
            if (sum + num > mid) {
                sum = num;
                piece++;
            }else{
                sum += num;
            }
        }
        if ( piece > m) {
            start = mid +1;
        } else {
            end=mid;
        }
     }
     return end;
    }
}
