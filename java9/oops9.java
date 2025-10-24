class Person
{
    private String name;
    private int salary;
    private int hireyear;
    private int currentyear;
public Person(String name, int salary ,int hireyear, int currentyear)
{
    this.name = name;   
    this.salary = salary;
    this.hireyear = hireyear;
    this.currentyear = currentyear;
}
public Person(){}
public void setName(String name)
{
    this.name = name;
}
public void setHireYear(int hireyear)
{
    this.hireyear = hireyear;
}
public void setSalary(int salary)
{
    this.salary = salary;
}
public void setCurrentyear(int currentyear)
{
    this.currentyear = currentyear;
}
public String getname()
{
    return name;
}
public int getsalary()
{
    return salary;
}
public int gethireyear()
{
    return hireyear;
}
public int getcurrentyear()
{
    return currentyear;
}
public void display()
{
    System.out.println("Name:" + name +"  Hireyear:" + hireyear + " " + "Salary/year:" + salary);
}
public void Yearofservice()
{
    if (hireyear > currentyear)
    {
        System.out.println("invalid .......");
    }
    else
    {
        int year = currentyear - hireyear;
        System.out.println("Year of service : " + year + " years");
    }
    
}
}

class Testmain
{
    public static void main(String[] args) 
    {
        Person t1 = new Person("Tommy",300000,2004,2025);
        Person t2 = new Person("Jeremy",400000,2001,2025);
        t1.display();
        t1.Yearofservice();
        System.out.println("-------------------------------------");
        t2.display();
        t2.Yearofservice();
    }
}