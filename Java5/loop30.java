import java.util.Scanner;
class loop
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int n=sc.nextInt();
        long a=0;
        long sum=0;
        for(long i=1;i<=n;i++) 
        {
           a=a*10+1;
           sum+=a; 
        }
        System.out.print(sum+" ");
    }
}