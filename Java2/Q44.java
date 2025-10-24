import java.util.Scanner;
class Q
{
    public static void main(String args[])
    {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter a");
     double a=sc.nextDouble();
     System.out.println("enter d");
     double d=sc.nextDouble();
     System.out.println("enter n");
     double n=sc.nextDouble();
     double t=a+(n+1)*d;
     System.out.println("t="+t);
    }
}
