import java.util.Scanner;
class CS{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of classes held=");
        int classesHeld=sc.nextInt();
        System.out.print("Enter number of classes attended=");
        int classesAttended=sc.nextInt();
        double percentage=(classesAttended*100.0)/classesHeld;
         System.out.print("Do you have a medical cause? (Y/N)=");
        char medicalCause=sc.next().charAt(0);
        System.out.println("Attendance percentage="+ percentage +"%");
        if (percentage >= 75 || medicalCause == 'Y' || medicalCause == 'y')
        {
            System.out.println("Student is allowed to sit in the exam.");
        }
        else {
            System.out.println("Student is NOT allowed to sit in the exam.");
        }
    }
}