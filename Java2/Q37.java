import java.util.Scanner;
class Q
{
    public static void main(String args[])
    {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter area");
     double a=sc.nextInt();
     System.out.println("enter height");
     double h=sc.nextInt();
     double pi=Math.PI;
     double r=(-h+Math.sqrt(h*h+2*a/pi))/2;
     double d=r*2;
     System.out.println("radius="+r);
     System.out.println("diameter="+d);
    }
}