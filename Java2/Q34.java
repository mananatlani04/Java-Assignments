import java.util.Scanner;
class Q
{
    public static void main(String args[])
    {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter breadth");
     double b=sc.nextInt();
     System.out.println("enter breadth");
     double b1=sc.nextInt();
     System.out.println("enter height");
     double h=sc.nextInt();
     System.out.println("enter width");
     double w=sc.nextInt();
     double a=1/2.0f*(b+b1)*h;
     double aow=w*h;
     double TA=a+aow;
     System.out.println("area="+TA);
    }
}