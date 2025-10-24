import java.util.Scanner;
class loop
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter two numbers");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        for(int i = num1; i <= num2; i++)
    {
        for(int x = 1;x <= 10; x++)
        {
            System.out.println(+ i * x);
        }
    }
    }
}