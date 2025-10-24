import java.util.Scanner;
class Q
{
    public static void main(String args[])
    {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter volume" );
     double v=sc.nextInt();
     System.out.println("enter radius");
     double r=sc.nextDouble();
     double pi=Math.PI;
     double h=v/(pi*r*r);
     double a=2*pi*r*(r+h);
     System.out.println("area="+a);
    }
}