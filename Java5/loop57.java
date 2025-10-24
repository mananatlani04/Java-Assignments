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
        int x = 2;
        for(int i = start; i <= end; i++)
        {
        while (x < start && start % x != 0) 
        {
        x++;
        }
        System.out.println(x == start ? "Prime" : "Not prime");
        start++;
        }
    }
}