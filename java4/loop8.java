import java.util.Scanner;
class loop
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int n=sc.nextInt();
        int a= 1,b = 1;
        System.out.println("Fibonacci Series:");
        for (int i = 1; i < n; i++) 
        {
            System.out.print(a + " ");
            int x = a + b;
            a = b;
            b = x;
        }
        sc.close();
    }
}