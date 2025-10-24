import java.util.Scanner;
class W 
{
    public static void main(String[] args) 
    {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter first integer (a): ");
    int a = sc.nextInt();
    System.out.print("Enter second integer (b): ");
    int b = sc.nextInt();
    System.out.println("\nBefore swap: a = " + a + ", b = " + b);
    a = a ^ b;
    b = a ^ b;
    a = a ^ b;
    System.out.println("After  swap: a = " + a + ", b = " + b);
    }
}
