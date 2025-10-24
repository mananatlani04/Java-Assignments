class StudentResultChecker
{
    private String name;
    private float mathsmarks;
    private float sciencemarks;
    public void setData(String name, float mathsmarks, float sciencemarks)
    {
        this.name = name;
        this.mathsmarks = mathsmarks;
        this.sciencemarks = sciencemarks;
    }
    public String getName()
    {
        return name;
    }
    public float getMathsmarks()
    {
        return mathsmarks;
    }
    public float getSciencemarks()
    {
        return sciencemarks;
    }
    public void display()
    {
        System.out.println("Student Name:"+ name);
        System.out.println( "Maths Marks:"+ mathsmarks);
        System.out.println( "Science Marks:"+ sciencemarks);
    }
    public void Average()
    {
        System.out.println( "Average:"+ (this.mathsmarks + this.sciencemarks)/2);
    }
}
class Testmain
{
    public static void main(String args[])
    {
        StudentResultChecker obj = new StudentResultChecker();
        obj.setData("rahul",75,65);
        obj.display();
        obj.Average();
        obj.setData("golu",85,50);
        obj.display();
        obj.Average();
    }
}
