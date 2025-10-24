import java.util.Scanner;
class Q
{
    public static void main(String args[])
    {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter c");
     double c=sc.nextInt();
     System.out.println("enter l");
     double l=sc.nextInt();
     System.out.println("enter rpm");
     double rpm=sc.nextInt();
     double p=c/rpm;
     double b=(p/2-l);
     double a=l*b;
     System.out.println("area="+a);
    }
}