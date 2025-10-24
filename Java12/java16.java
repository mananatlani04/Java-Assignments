/*6. Student Management System
You are fetching student data from a database. If the record is not found:
Will you return null or throw a RecordNotFoundException?
Which approach is better and why?*/

import java.util.ArrayList;

class RecordNotFoundException extends Exception
{
    public RecordNotFoundException(String msg)
    {
        super(msg);
    }
} 
class Student
{
    private String Name;
    private int Rollno;
    private int Contactno;
    public Student(String Name,int Rollno,int Contactno)
    {
        this.Name = Name;
        this.Rollno = Rollno;
        this.Contactno = Contactno;
    }
    public String getName()
    {
        return Name;
    }
    public int getRollno()
    {
        return Rollno;
    }
    public int getContactno()
    {
        return Contactno;
    }
    public String getdisplay()
    {
        return "Name:" + Name + "\tRoll No.:" + Rollno + "\tContact No.:" + Contactno;
    }
}
class Management
{
    ArrayList<Student> Arr = new ArrayList<Student>();
    public void add(Student S)
    {
        Arr.add(S);
    }
    public void remove(Student S)
    {
        Arr.remove(S);
    }
    public void display()
    {
        for( Student S : Arr )
        {
        System.out.println(S.getdisplay());
        }
    }
    public void fetch(int Rollno){
        Student s1 = null;
        String s2 = null;
        for( Student S : Arr )
        {
           if( S.getRollno() == Rollno )
            {
                s1 = S;
                s2 = s1.getdisplay();
                break;
            }
        }
            try
            {
                if( s1 != null )
                {
                    System.out.println("Record Found");
                    System.out.println(s2);
                    
                }
                else
                {
                    throw new RecordNotFoundException("Record is Not Available");
                }
            }
        
        catch(RecordNotFoundException e)
        {
            e.printStackTrace();
        }
    }
}
class Testmain
{
    public static void main(String[] args) 
    {
        Student obj1 = new Student("Rahul",123,893788387);
        Student obj2 = new Student("Cheeku",124,893788388);
        Student obj3 = new Student("Meeku",125,893788389);
        Student obj4 = new Student("Teeku",111,893788380);
        Management C = new Management();
        C.add(obj1);
        C.add(obj2);
        C.add(obj3);
        C.add(obj4);
        C.display();
        System.out.println("----------------------------------------------------------");
        C.fetch(123);
        System.out.println("-------------------------------------------------------------");
        C.fetch(111);
        System.out.println("-------------------------------------------------------------");
        C.fetch(125);
    
    }
}