import java.util.Scanner;
class loop
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter binary number");
        int binary =sc.nextInt();
        int decimal = 0, base = 1;
        while(binary > 0) 
        {
            int lastDigit = binary % 10;
            decimal = decimal + lastDigit * base;
            base = base * 2;
            binary = binary / 10;
        }
        System.out.println("Decimal = " + decimal);
    }
}
