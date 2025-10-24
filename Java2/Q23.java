import java.util.Scanner;
class Q
{
    public static void main(String args[])
    {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter side");
     double s=sc.nextInt();
     double voc1=s*s*s;
     System.out.println("enter length");
     double l=sc.nextInt();
     System.out.println("enter breadth");
     double b=sc.nextInt();
     System.out.println("enter height");
     double h=sc.nextInt();
     double voc2=l*b*h;
     double x=voc2/voc1;
     System.out.println("volume="+x);
    }
}
