import java.util.Scanner;
class loop
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no.");
        int n = sc.nextInt();
        System.out.println("pattern : ");
        for (int i = 1; i <= n; i++) 
        {
            for (int sp = n; sp > i; sp--) 
            {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) 
            {
                if (i == n) // Last row: X with space after each except last
                {
                    System.out.print("X");
                    if (j < i) 
                    System.out.print(" ");
                }
                else if (i == 2) // Second row: X with space after first
                {
                    System.out.print("X");
                    
                    if (j < i) System.out.print(" ");
                }
                else if (i == 1 || j == 1 || i == j)
                {
                    System.out.print("X");
                } 
                else 
                {
                    System.out.print("__");
                }
            }
            System.out.println();
        }
    }
}