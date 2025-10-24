import java.util.Scanner;
class Q
{
    public static void main(String args[])
    {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter length");
     double l=sc.nextInt();
     System.out.println("enter breadth");
     double b=sc.nextInt();
     System.out.println("enter x");
     double x=sc.nextInt();
     double a=l*b*x;
     System.out.println("area="+a);
    }
}