import java.util.Scanner;
class Q
{
    public static void main(String args[])
    {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter x");
     double x=sc.nextInt();
     System.out.println("enter b");
     double b=sc.nextInt();
     double h=Math.sqrt(x*x+b*b);
     double a=1/2.0f*b*h;
     System.out.println("height="+h);
     System.out.println("area="+a);
    }
}