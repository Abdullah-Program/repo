import java.util.Scanner;
 class Sum {
 public static void main (String[] args)
 {
    int a, b, s;
    Scanner si = new Scanner(System.in);
    a = si.nextInt();
    b = si.nextInt();
    s = a+b;
    System.out.println("Sum "+s);
    si.close();
   }    
}
