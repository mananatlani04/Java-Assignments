import java.util.Scanner;
class loop
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no.");
        int n = sc.nextInt();
        for ( int i = n; i >= 1; i--)
        {
            char ch = 'A';
            for ( int j = 1; j <= i; j++,ch++)
            {
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
