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
    System.out.println("enter the no.3");
    double no3=sc.nextDouble();
    if(no1>no2 && no1>no3)
    System.out.println("no.1 is greatest");
    else if(no2>no1 && no2>no3)
    System.out.println("no.2 is greatest");
    else if(no3>no1 && no3>no2)
    System.out.println("no.3 is greatest");
    else
    System.out.println("all no.s are same");
    }
}