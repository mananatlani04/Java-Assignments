import java.util.Scanner;
class Q
{
    public static void main(String args[])
    {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter side");
     double s=sc.nextInt();
     double a=s*s;
     double aof=800*900;
     double x=aof/a;
     System.out.println("area="+x);
    }
}