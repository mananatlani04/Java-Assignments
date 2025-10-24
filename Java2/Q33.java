import java.util.Scanner;
class Q
{
    public static void main(String args[])
    {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter length");
     double l1=sc.nextInt();
     System.out.println("enter breadth");
     double b1=sc.nextInt();
     double a1=l1*b1;
     System.out.println("enter length");
     double l2=sc.nextInt();
     System.out.println("enter breadth");
     double b2=sc.nextInt();
     double p=l2*b2;
     System.out.println("enter length");
     double l3=sc.nextInt();
     System.out.println("enter breadth");
     double b3=sc.nextInt();
     double p1=l3*b3;
     double aop=p+p1;
     double a=b2*b3;
     double x=aop-a;
     double z=a1-x;
     System.out.println("total area required="+z);
    }
}
