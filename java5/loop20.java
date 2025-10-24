import java.util.Scanner;
class loop
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int n = sc.nextInt();
        for(int i = 0; i <= n; i++)
        {
            int a = i * 7;
            System.out.print(a + " ");
        }
        sc.close();
    }
}