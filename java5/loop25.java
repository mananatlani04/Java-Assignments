import java.util.Scanner;
class loop
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++)
        {
            int x = i * 2 - 1;
            int a = x * x * x;
            System.out.print(a + " ");
        }
        sc.close();
    }
}