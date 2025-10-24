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
        int f=1;
        System.out.println("factorial of numbers between " + start + " and " + end + ":");
            for(int x = start; x <= end; x++)
            {
                f*=x;
                System.out.println(f+"");
            }
        }
    }