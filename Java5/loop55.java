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
        System.out.println("Even numbers between " + start + " and " + end + ":");
        for(int i = start; i <= end; i++)
        {
            if(i % 2 == 1) 
            {
                System.out.print(i + " ");
            }
        }
    }
}