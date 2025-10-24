import java.util.Scanner;
class loop
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int n = sc.nextInt();
        for(int i = -n; i <= n; i++)
        {
            int a = i * 3;
            System.out.println(a);
        }
        sc.close();
    }
}