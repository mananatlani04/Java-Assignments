import java.util.Scanner;
class Q
{
    public static void main(String args[])
    {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter length");
     double l=sc.nextInt();
     System.out.println("enter breadth");
     double b=sc.nextInt();
     double aor=l*b;
     System.out.println("enter side");
     double side=sc.nextInt();
     double aos=side*side;
     double x=aos-aor; 
     System.out.println("area="+x);
    }
}
