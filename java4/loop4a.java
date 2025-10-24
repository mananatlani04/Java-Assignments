import java.util.Scanner;
class loop
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int n=sc.nextInt();
        int i=1;
        int sum=0;
        while(i<=n)
        {
            sum+=i;
            System.out.println(sum);
            i++;
        }
        sc.close();
    }
}