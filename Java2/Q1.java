import java.util.Scanner;
class Q
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter l");
        int l=sc.nextInt();
        System.out.println("enter p");
        int p=sc.nextInt();
        int b=(p/2-l);
        System.out.println("b:"+b);
        int a=l*b;
        System.out.println("a:"+a);
    }
}