import java.util.Scanner;
class Q
{
    public static void main(String args[])
    {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter side");
     double side=sc.nextInt();
     double a=Math.sqrt(3)/4*side*side;
     System.out.println("a="+a);
    }
}