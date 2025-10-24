import java.util.ArrayList;
class Student
{
    private String name;
    private char grade;
    private ArrayList<String> courses; 
public Student( String name, char grade )
{
    this.name = name;
    this.grade = grade;
    this.courses = new ArrayList<>();
}
public void addCourse( String course )
{
    courses.add(course);
    System.out.println("Course added : " + courses);
}
public void removeCourse( String course )
{
    if(courses.remove(course))
    {
    System.out.println("course removed : " + courses);
    }
    else
    {
    System.out.println("course not found...");
    }
}
public void setName(String name)
{
    this.name = name;
}
public void setGrade(char grade)
{
    this.grade = grade;
}
public String getFullDetails()
{
    return  "Name : " + name + "  Grade : " + grade + "  Course : " + courses;
}
}
class addremove
{
    ArrayList<Student> Arr = new ArrayList<Student>();

    public void addStudent( Student student )
    {
        Arr.add( student );
    }
    public void removeStudent( Student student)
    {
        Arr.remove( student );
        System.out.println("data removed successfully..." + "   " + student.getFullDetails());
    }
    public void displayStudentDetails()
    {
        for ( Student student : Arr )
        {
            System.out.println(student.getFullDetails());
        }
    }
}
class Testmain
{
    public static void main(String[] args) 
    {
        Student obj1 = new Student("cheeku",'A');
        Student obj2 = new Student("reeku",'B');
        Student obj3 = new Student("meeku",'C');

        obj1.addCourse("BCA");
        obj2.addCourse("B.TECH");
        obj3.addCourse("BBA");
        obj3.addCourse("MBA");

        addremove data = new addremove();
        data.addStudent(obj1);
        data.addStudent(obj2);
        data.addStudent(obj3);

        data.displayStudentDetails();
        System.out.println("-------------------------------");
        data.removeStudent(obj3);
        data.displayStudentDetails();

    }
}