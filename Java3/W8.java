import java.util.Scanner;
class W
{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the no");
    int no=sc.nextInt();
    if(no%2==0)
    System.out.println("even no");
    else
    System.out.println("odd no");
    }
}