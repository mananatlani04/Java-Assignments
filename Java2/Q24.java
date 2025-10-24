import java.util.Scanner;
class Q
{
    public static void main(String args[])
    {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter length");
     double l1=sc.nextInt();
     System.out.println("enter breadth");
     double b1=sc.nextInt();
     System.out.println("enter height");
     double h1=sc.nextDouble();
     double vob1=l1*b1*h1;
     System.out.println("enter length");
     double l2=sc.nextInt();
     System.out.println("enter breadth");
     double b2=sc.nextInt();
     System.out.println("enter height");
     double h2=sc.nextInt();
     double vob2=l2*b2*h2;
     double x=vob2/vob1;
     double z=(x/1000)*900;
     System.out.println("volume="+z);
    }
}