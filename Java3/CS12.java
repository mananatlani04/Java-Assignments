import java.util.Scanner;
class CS
{
    public static void main(String args[]) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a 4-digit number (1000 to 9999)=");
        int num=sc.nextInt();
        if (num < 1000 || num > 9999) 
        {
            System.out.println("Invalid input! Must be a 4-digit number.");
        } 
        else 
        {
            int d1 = num / 1000;          
            int d2 = (num / 100)% 10;    
            int d3 = (num / 10) % 10;   
            int d4 = num % 10;        

            int rev = d4 * 1000 + d3 * 100 + d2 * 10 + d1;
            System.out.println("Reversed number: " + rev);
        }
    }
}