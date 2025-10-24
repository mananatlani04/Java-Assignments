import java.util.Scanner;
class loop
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int n = sc.nextInt();
        int i = 2;
        while (i < n && n % i != 0) 
        i++;
        System.out.println(i == n ? "Prime" : "Not prime");
        sc.close();
    }
}