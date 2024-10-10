import java.util.Scanner;
class switchfruits {
    public static void main(String[] args) {
        System.out.println("Enter fruits ");
        Scanner si = new Scanner(System.in);
        String fruit = si.next();
        switch (fruit) {
            case "mango":
                System.out.println("mango ");
                break;
            case "apple":
            System.out.println("apple ");
            break;
            default:
                break;
        }
        si.close();
    }
}
