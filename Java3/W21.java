import java.util.Scanner;
class W
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter angle 1 (in degrees): ");
        int a = sc.nextInt();
        System.out.print("Enter angle 2 (in degrees): ");
        int b = sc.nextInt();
        System.out.print("Enter angle 3 (in degrees): ");
        int c = sc.nextInt();
        if (a + b + c == 180 && a > 0 && b > 0 && c > 0) 
        {
            System.out.println("Triangle is valid.");
        } 
        else 
        {
            System.out.println("Triangle is NOT valid.");
        }
    }
}
