import java.util.Scanner;
class W
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter radius");
        int r=sc.nextInt();
        double pi=Math.PI;
        double a=pi*r*r;
        System.out.println("area of circle="+a);
    }
}