import java.util.Scanner;
class NestedSwitch {
    public static void main(String[] args) {
        System.out.println("ENTER THE EMP ID");
        Scanner si = new Scanner(System.in);
        int EMPID = si.nextInt();
        String department = si.next();
        switch (EMPID) {
            case 1:
                System.out.println("ABDULLAH HAIDER");
                break;
             case 2:
             System.out.println("rahul apni ma chuda");
             break; 
             
             case 3:
             switch (department) {
                case "IT":
                    System.out.println("IT DEPARTMENT");
                    break;
                
                 case "Management":
                 System.out.println("this is management");
                 break;    
                default:
                    break;
             }
            default:
                break;
        }
        si.close();
    }
}
