import java.util.Scanner;
class Q
{
    public static void main(String args[])
    {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter b");
     double b=sc.nextInt();
     System.out.println("enter h");
     double h=sc.nextInt();
     System.out.println("enter a");
     double a=sc.nextInt();
     double cons=(0.5*b*h);
     double x=a/cons;
     double x=Math.sqrt(x);
     double base=b*x;
     double height=h*x;
     System.out.println("base:"+base);
     System.out.println("height="+height);
     }
    }








