import java.util.Scanner;
class Q
{
    public static void main(String args[])
    {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter h");
     double h=sc.nextInt();
     System.out.println("enter a");
     double a=sc.nextDouble();
     double b=(2*a/h);
     System.out.println("b="+b);
    }
}
