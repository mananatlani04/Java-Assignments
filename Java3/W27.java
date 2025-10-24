import java.util.Scanner;
class W
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Basic Salary: ");
        int bs = input.nextInt();
        float hra, da;
        if (bs <= 10000) {
            hra = bs * 0.20f;  // 20% HRA
            da  = bs * 0.80f;  // 80% DA
        } else if (bs <= 20000) {
            hra = bs * 0.25f;  // 25% HRA
            da  = bs * 0.90f;  // 90% DA
        } else {
            hra = bs * 0.30f;  // 30% HRA
            da  = bs * 0.95f;  // 95% DA
        }
        float gross = bs + hra + da;
        System.out.printf("gross="+gross);
    }
}
