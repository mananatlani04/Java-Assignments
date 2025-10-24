import java.util.Scanner;

class CS{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character=");
        char c=sc.next().charAt(0);
        if (c >= 'A' && c <= 'Z') {
        System.out.println(c+" is uppercase.");
        }
        else if(c>='a'&& c<='z') {
        System.out.println(c+ " is lowercase.");
        }
        else {
        System.out.println(c + " is neither uppercase nor lowercase letter.");
        }
    }
}
