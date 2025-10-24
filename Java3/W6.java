import java.util.Scanner;
class W
{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the no.1");
    double no1=sc.nextDouble();
    System.out.println("enter the no.2");
    double no2=sc.nextDouble();
    if(no1>no2)
    System.out.println("no.1 is greater");
    else if(no2>no1)
    System.out.println("no.2 is greater");
    else
    System.out.println("both no.s are same");
    }
}