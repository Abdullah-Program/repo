import java.util.Arrays;
public class sum1d {
public static void main(String[] args) {
   int[] nums = {1,2,3,4};
   System.out.println(Arrays.toString(runningSum(nums)));
}
public static int[] runningSum(int[] nums) {
     // int num = 0;
     int n = nums.length;
    for (int i = 1; i < n; i++) {
    //  nums[i] = nums[i-1] + nums[i];
     nums[i]=nums[i-1]+nums[i];
    }
    return nums;
}
    
}