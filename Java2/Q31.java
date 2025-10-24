import java.util.Scanner;
class Q
{
    public static void main(String args[])
    {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter side");
     double p=sc.nextInt();
     double s=p/4;
     double a=s*s;
     System.out.println("area="+a);
    }
}