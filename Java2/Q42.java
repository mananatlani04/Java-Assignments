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
     double h=sc.nextDouble();
     double pi=Math.PI;
     double v=pi*r*r*h;
     System.out.println("volume="+v);
    }
}
