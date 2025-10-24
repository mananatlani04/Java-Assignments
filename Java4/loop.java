import java.util.Scanner;
class loop
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int n = sc.nextInt();
        int i = 1;
        int a = 0;
        while(i <= n)
        {
            System.out.println(i);
            a = a += i;
            System.out.println("result=" + a);
            i++;
        }
        sc.close();
    }    
}
