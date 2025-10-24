import java.util.Scanner;
class loop 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long n = scanner.nextLong();
        int evenCount = 0;
        int oddCount = 0;
        n = Math.abs(n);
        while (n > 0) 
        {
            long digit = n % 10;
            if (digit % 2 == 0) 
            {
                evenCount++;
            } 
            else 
            {
                oddCount++;
            }
            n /= 10;
        }
        System.out.println("Even digits: " + evenCount);
        System.out.println("Odd digits: " + oddCount);
    }
}