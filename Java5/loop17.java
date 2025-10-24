import java.util.Scanner;
class loop
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int n = sc.nextInt();
        int x = 1;
        int a = 1;
        for(int i = 1; i <= n; i++)
        {
            System.out.print(x +" ");
            a++;
            x += a - 1;
        }
        sc.close();
    }
}