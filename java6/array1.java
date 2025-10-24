import java.util.Scanner;
class array
{
    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int  i = 0; i < n; i++)
        {
            System.out.println("enter elements");
            arr[i] = sc.nextInt();
        }
        System.out.println("elements");
        for (int i = 0;i < n; i++)
        {
            System.out.println(arr[i]);
        }
        System.out.println();
    }
}