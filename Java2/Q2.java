import java.util.Scanner;
class Q
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a");
        int a=sc.nextInt();
        System.out.println("enter b");
        int b=sc.nextInt();
        int l=(a/b);
        System.out.println("l="+l);
        int p=2*l+2*b;
        System.out.println("p="+p);
    }
}