import java.util.Scanner;
class W{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length");
        double l=sc.nextDouble();
        System.out.println("Enter breadth");
        double b=sc.nextDouble();
        double a=l*b;
        System.out.println("area of rectangle="+a);
    }
}