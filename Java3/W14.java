import java.util.Scanner;
class W
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter four numbers (can be decimals):");
        System.out.print("Number 1: ");
        double a = sc.nextDouble();
        System.out.print("Number 2: ");
        double b = sc.nextDouble();
        System.out.print("Number 3: ");
        double c = sc.nextDouble();
        System.out.print("Number 4: ");
        double d = sc.nextDouble();
    if(b < a)
    {
        a = b;
    }
    if(c < a) 
    {
        a = c;
    }
    if(d < a)
    {
        a = d;
    }
    System.out.println("The smallest number is: " + a);
    }
}