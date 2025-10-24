import java.util.Scanner;
class loop
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter number");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            int a=2*i;
            System.out.println(a);
        }
        sc.close();
    }
}