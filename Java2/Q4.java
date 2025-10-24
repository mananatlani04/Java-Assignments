import java.util.Scanner;
class Q
{
    public static void main(String args[])
    {
     Scanner sc=new Scanner(System.in);
        System.out.println("enter l");
        double l=sc.nextInt();
        System.out.println("enter breadth");
        double b=sc.nextInt();
        System.out.println("enter rpsm");
        double rpsm=sc.nextInt();
        double a=(l*b/100);
        System.out.println("area="+a);
        double c=rpsm*a;
        System.out.println("c="+c);                
    }
}