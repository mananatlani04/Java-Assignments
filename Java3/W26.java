import java.util.Scanner;
class W
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks for Physics, Chemistry, Biology, Mathematics, Computer:");
        int phy = sc.nextInt();
        int chem = sc.nextInt();
        int bio = sc.nextInt();
        int math = sc.nextInt();
        int comp = sc.nextInt();
        int total = phy + chem + bio + math + comp;
        double percentage = total / 5.0;
        char grade;
        if (percentage >= 90)         grade = 'A';
        else if (percentage >= 80)    grade = 'B';
        else if (percentage >= 70)    grade = 'C';
        else if (percentage >= 60)    grade = 'D';
        else if (percentage >= 40)    grade = 'E';
        else                          grade = 'F';
        System.out.println("Total Marks="+total+"/500");
        System.out.printf("percentage="+percentage);
        System.out.println("Grade="+grade);
    }
}
