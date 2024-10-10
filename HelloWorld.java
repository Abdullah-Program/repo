
import java.util.Scanner;
public class HelloWorld {
    public static void main (String[] args)
    {
        Scanner reader = new Scanner(System.in);
        System.out.print("ENTER A NUMBER ");

        int number = reader.nextInt();

        System.out.println("you entered " + number);
        reader.close();
    }
}
