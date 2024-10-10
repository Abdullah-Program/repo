import java.util.Scanner;
public class switchday {
    public static void main(String[] args) {
        System.out.println("Enter day");
        Scanner si = new Scanner(System.in);
        String day = si.next();
        switch (day) {
            case "monday":
                System.out.println("this is monday");
                break;
            case "tuesday":
            System.out.println("this is tuesday");
            break;        
            default:
                break;
        }
       si.close(); 
    }
}
