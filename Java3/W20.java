import java.util.Scanner;
class W 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a single character: ");
        char ch = sc.next().charAt(0);
        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) 
        {
            System.out.println(ch + " is an alphabet.");
        } 
        else 
        {
            System.out.println(ch + " is NOT an alphabet.");
        }
    }
}