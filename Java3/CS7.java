import java.util.Scanner;
class CS {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of classes held=");
        int classesHeld = sc.nextInt();
        System.out.print("Enter number of classes attended=");
        int classesAttended =sc.nextInt();
        double percentage=(classesAttended*100.0)/classesHeld;
        System.out.println("Attendance percentage="+percentage+"%");
        if (percentage >= 75){
        System.out.println("Student is allowed to sit in the exam.");
        }
        else{
        System.out.println("Student is Not allowed to sit in the exam.");
        }
    }
}