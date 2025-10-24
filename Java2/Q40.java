import java.util.Scanner;
class Q
{
    public static void main(String args[])
    {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter radius");
     double r=sc.nextInt();
     System.out.println("enter height");
     double h=sc.nextInt();
     double pi=Math.PI;
     double v=pi*r*r*h;
     System.out.println("volume="+v);
    }
}
