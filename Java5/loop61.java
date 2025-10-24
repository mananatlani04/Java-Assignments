import java.util.Scanner;
class loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter starting year: ");
        int start = sc.nextInt();
        System.out.print("Enter ending year: ");
        int end = sc.nextInt();
        System.out.println("Leap years between " + start + " and " + end + ":");
        for (int year = start; year <= end; year++) {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year);
            }
        }
    }
}