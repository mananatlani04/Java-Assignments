import java.util.Scanner;
class array
{
    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int n = sc.nextInt();
        int sum = 0;
        int a = 0;
        int arr[] = new int[n];
        for (int i = 0; i < n;i++)
        {
            System.out.println("enter elements");
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n;i++)
        {
            a = arr[i];
            sum+=a;
        }
         System.out.println(sum);
    }
}