import java.util.Scanner;
class loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of N: ");
        int N = sc.nextInt();
        System.out.println("Number | Square | Cube | Square Root");
        for (int i = 1; i <= N; i++) {
            int square = i * i;
            int cube = i * i * i;
            double root = 0;
            for (double j = 0; j <= i; j += 0.0001) {
                if (j * j >= i) {
                    root = j;
                    break;
                }
            }
            System.out.println(i + "       " + square + "       " + cube + "       " + String.format("%.2f", root));
        }
    }
}