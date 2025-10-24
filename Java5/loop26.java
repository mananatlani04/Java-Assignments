import java.util.Scanner;
class loop
{
public static void main(String[] args) 
{
    Scanner sc=new Scanner(System.in);
    System.out.println("enter number");
    int n=sc.nextInt();
    for(int i=0;i<=n;i++)
    {
        int x=i*2;
        int a=x*x*x;
        System.out.print(a+ " ");
        }
    }
}