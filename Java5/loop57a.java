import java.util.Scanner;
class loop
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter starting number: ");
        int start = sc.nextInt();
        System.out.print("Enter ending number: ");
        int end = sc.nextInt();
        int n = start;
        for(int i = start; i <= end; i++)
        {
            if (i < 2 )
            {
            System.out.println("not prime no."); 
            }
            else if (i % 2 != 0 && i % 3 != 0 && i % 4 != 0 && i % 5 != 0)
            {
            System.out.println("prime no.");
            }
        }
    }
}