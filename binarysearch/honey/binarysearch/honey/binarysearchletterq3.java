package binarysearch.honey;

public class binarysearchletterq3 {
    public static void main(String[] args) {
        int [] arr = {'a','b','c','f'};
        int target = 'b'; 
        System.out.println(letterceilling(arr, target));
    }
        static int letterceilling(int [] arr, int target)
    {
       int start = 0;
       int[] letter = arr;
    int end = letter.length-1;
       while (start <= end) {
        // find the middle elment 
        int mid = start + (end - start )/2;
        if (target<letter[mid]) {
            end = mid -1;
        }
        else{
            start = mid+1;
       }
       
       }
       return letter [start % letter.length];
    }
}
