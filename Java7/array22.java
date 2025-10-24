import java.util.Scanner;

class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        int n, x;
        System.out.print("Enter number of elements: ");
        n = sc.nextInt();
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the number to compare: ");
        x = sc.nextInt();
        int lesser = Integer.MIN_VALUE;
        int greater = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] < x && arr[i] > lesser) {
                lesser = arr[i];
            }
            if (arr[i] > x && arr[i] < greater) {
                greater = arr[i];
            }
        }
        System.out.println("Element lesser than " + x + " is: " + lesser);
        System.out.println("Element greater than " + x + " is: " + greater);
    }
}