import java.util.Scanner;
class loop
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no.");
        int n = sc.nextInt();
        char a = 'A';
        for(int i = 1; i <= n * 2; i += 2)
        {
            for(int j = 1; j <= i; j++,a++)
            {
                System.out.print(a);
            }
            System.out.println();
        }
    }
}