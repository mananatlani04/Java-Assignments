import java.util.Scanner;
class loop 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter two numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int x= (a > b) ? a : b;
        while(true) 
        {
        if(x % a == 0 && x % b == 0) 
        {
            break;
        }
        x++;
        }
        System.out.println("LCM = " + x);
    }
}