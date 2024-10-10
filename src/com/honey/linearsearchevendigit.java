package com.honey;

public class linearsearchevendigit {
    public static void main(String[] args) {
        int [] nums = {12,345,2,6,7896};
        System.out.println(findNumber(nums));
    }
    static int findNumber(int []nums)
    {
        int count =0;
        for (int num : nums) {
            if (even(num))
             count++;
        }
        return count;
    }
    static boolean even(int num) {
        int numberofdigit = digits(num);
        if ( numberofdigit % 2 == 0 ){
            return true;
        }
        return false ;
    }
    // static int digits(int num)
    // {
    //     return (int) (math.log10(num)) +1;
    // }
        static int digits(int num)
    {
        if (num <0)
        {
            num = num* -1;
        }
        if (num ==0)
        {
            return 1;
        }
        int count = 0;
        while (num>0) {
            count++;
            num = num/10;
        }
        return count;
    }
    
}
