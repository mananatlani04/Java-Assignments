import java.util.Scanner;
class CS{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number=");
        int number = sc.nextInt();
        int absoluteValue;
        if (number < 0) {
        absoluteValue = -number;
        }
        else {
        absoluteValue = number;
        }
        System.out.println("Absolute value=" + absoluteValue);
    }
}