import java.util.Scanner;
class W
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int n=sc.nextInt();
        switch(n%2)
        {
            case 0:
            System.out.println("even no.");break;
            default:
            System.out.println("odd no.");break;
        }
    }
}