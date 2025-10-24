class employee
{
    private int id;
    private String name;
    private int salary;
    public void setData(int id, String name, int salary)
    {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public int getID()
    {
        return id;
    }
    public String getName()
    {
        return name;
    }
    public int getSalary()
    {
        return salary;
    }
    public void display()
    {
        System.out.println("Id:"+ id + "   " + "Name:"+ name + "   " + "Salary:"+ salary);
    }
}
class Testmain
{
    public static void main(String args[])
    {
        employee obj = new employee();
        obj.setData(21,"Rahul",30000);
        obj.display();
    }
}
