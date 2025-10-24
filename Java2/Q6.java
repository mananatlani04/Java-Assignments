import java.util.Scanner;
class Q
{
    public static void main(String args[])
    {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter a");
     double a=sc.nextInt();
     System.out.println("enter b");
     double b=sc.nextInt();
     System.out.println("enter p");
     double p=sc.nextInt();
     double c=p-a-b;
     System.out.println("c="+c);
     double aot=1/2.0f*b*c;
     System.out.println("area of triangle="+aot);
    }
}