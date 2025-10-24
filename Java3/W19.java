import java.util.Scanner;
class W{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side 1: ");
        double a = sc.nextDouble();
        System.out.print("Enter side 2: ");
        double b = sc.nextDouble();
        System.out.print("Enter side 3: ");
        double c = sc.nextDouble();
        if (a + b <= c || a + c <= b || b + c <= a) 
        {
            System.out.println("Not a valid triangle.");
        } 
        else if (a == b && b == c) 
        {
            System.out.println("Triangle is Equilateral.");
        } 
        else if (a == b || b == c || a == c) 
        {
            System.out.println("Triangle is Isosceles.");
        } 
        else 
        {
            System.out.println("Triangle is Scalene.");
        }
    }
}