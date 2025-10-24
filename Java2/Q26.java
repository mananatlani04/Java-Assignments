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
     double aop=l*b;
     System.out.println("enter length");
     double l1=sc.nextInt();
     System.out.println("enter breadth");
     double b1=sc.nextInt();
     double aob=l1*b1;
     double x=aop/aob;
     System.out.println("volume="+x);
    }
}
