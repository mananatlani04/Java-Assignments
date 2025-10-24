import java.util.Scanner;
class loop
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no.");
        int n = sc.nextInt();
        for(int i = 1;i <= n * 2; i++)
        {
            for(int j = 1; j <= i; j++)
            {
                if(i % 2 == 1)
                {
                System.out.print(j);
                }
            }
            if(i % 2 == 1)
            System.out.println();
        }
    }
}