import java.util.Scanner;
class Q
{
    public static void main(String args[])
    {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter base");
     double base=sc.nextInt();
     System.out.println("enter height1");
     double height1=sc.nextInt();
     System.out.println("enter height2");
     double height2=sc.nextInt();
     double a=1/2.0f*base*height1;
     double aot=1/2.0f*base*height2;
     double aoq=a+aot;
     System.out.println("area of quadrilateral="+aoq);
    }
}
