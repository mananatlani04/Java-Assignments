import java.util.Scanner;
class loop
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();
        int a = 1, b = 2, c = 2;
        for (int i = 1; i <= n; i++) 
        {
            if (i == 1) 
            {
                System.out.print(a + " ");
            } 
            else if (i == 2) 
            {
                System.out.print(b + " ");
            } 
            else if (i == 3) 
            {
                System.out.print(c + " ");
            } 
            else 
            {
                int next = b * c;
                System.out.print(next + " ");
                b = c;
                c = next;
            }
            sc.close();
        }
    }
}
