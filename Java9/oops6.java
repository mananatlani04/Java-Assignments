class Person
{
    private String name;
    private String jobtitle;
    private int salary;
public Person(String name, String jobtitle, int salary)
{
    this.name = name;
    this.jobtitle = jobtitle;    
    this.salary = salary;

}
public void setName(String name)
{
    this.name = name;
}
public void setJobTitle(String jobtitle)
{
    this.jobtitle = jobtitle;
}
public void setSalary(int salary)
{
    this.salary = salary;
}
public String getname()
{
    return name;
}
public String getjobTitle()
{
    return jobtitle;
}
public int getsalary()
{
    return salary;
}
public void display()
{
    System.out.println("name:" + name +"  jobtitle:" + jobtitle + " " + "salary/year:" + salary * 12);
}
}
class Testmain
{
    public static void main(String[] args) 
    {
        Person t1 = new Person("Tommy","Manager",30000);
        Person t2 = new Person("Geremy","Assistant Manager",40000);
        t1.display();
        System.out.println("-------------------------------------");
        t1.setSalary(50000);
        t1.display();
        t2.display();
    }
}