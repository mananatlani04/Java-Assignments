import java.util.Scanner;
class array
{
    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int i;
        boolean x = false;
        boolean z = false;
        System.out.println("enter elements");
        for ( i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        for ( i = 0; i < n; i++)
        {
            if(i == 0 || arr[i] > arr[i - 1])
            {
                z = true;
            }
            if(i == n - 1 || arr[i] > arr[i + 1])
            {
                x = true;
            }
            else
            {
                x = false;
            }
            if(x && z)
            {
            System.out.println("'1'"+ " " + "element found:" + arr[i] +"   index:" + i);
            break;
            }
            if(x = false)
            System.out.println("0" + "element not found");
        }
    }
}