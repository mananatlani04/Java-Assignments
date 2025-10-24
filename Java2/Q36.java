import java.util.Scanner;
class Q
{
    public static void main(String args[])
    {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter diameter");
     double d=sc.nextDouble();
     double r=d/2;
     System.out.println("enter height");
     double h=sc.nextInt();
     double pi=Math.PI;
     double a=2*pi*r*h+2*pi*r*r;
     System.out.println("area="+a);
    }
}