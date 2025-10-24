import java.util.Scanner;
class Q
{
    public static void main(String args[])
    {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter slant height");
     double sh=sc.nextDouble();
     System.out.println("enter height");
     double h=sc.nextDouble();
     System.out.println("enter rate per square");
     double rps=sc.nextDouble();
     double pi=Math.PI;
     double r=Math.sqrt(sh*sh-h*h);
     double a=pi*r*r;
     double c=a*rps;
     System.out.println("cost="+c);
    }
}
