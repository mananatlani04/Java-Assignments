import java.util.Scanner;
class loop
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("Natural numbers in reverse order:");
        for (int i = n; i >= 1; i--) 
        {
            System.out.println(i);
        }
        sc.close();
    }
}