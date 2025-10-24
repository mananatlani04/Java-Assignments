import java.util.Scanner;
class Q
{
    public static void main(String args[])
    {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter side");
     double s=sc.nextInt();
     double aog=s*s;
     System.out.println("enter side");
     double s1=sc.nextInt();
     double aos=s1*s1;
     double x=aog-aos;
     System.out.println("area="+x);
    }
}