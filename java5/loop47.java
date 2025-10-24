import java.util.Scanner;
class loop
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two number:");
        int start= sc.nextInt();
        int end= sc.nextInt();
        for (int i = start; i <= end; i++) 
        {
            for (int j = 1; j <= 10; j++) 
            {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            System.out.println();
        } 
    }
}
