import java.util.Scanner;
class W
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int number=sc.nextInt();
        switch(number%2)
        {
            case 0:
            System.out.println("even");break;
            default:
            System.out.println("odd");
        }
    }
}
