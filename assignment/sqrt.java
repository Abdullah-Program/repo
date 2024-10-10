public class sqrt {
    public static void main(String[] args) {
        int x = 25;
        System.out.println(mysqrt(x));
        }
    public static int mysqrt(int x)
    {
        if (x == 0 || x ==1)
        {
            return x;
        }

        int start= 1;
        int end = x;
        int mid = -1;

        while (start<= end) {
            mid = start +(end - start)/2;
            
            if (mid * mid == x) {
                return mid;
            }
            
            if (mid * mid > x )  {
                end = mid -1;
            }       
            else{
                start = mid + 1;
            }
        }
        return end;
    } 
}
