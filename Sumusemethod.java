 class Sumusemethod {
int addNumber (int a , int b)
{
int s = a+b;
return s;
}    
public static void main(String[] args) {
    Sumusemethod si = new Sumusemethod();
    int result = si.addNumber(10,20);
    System.out.println("Sum " + result);
}
}
