class Person
{
    private String name;
    private int age = 18;
    public Person( String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }
    public void display()
    {
        System.out.println("Name:" + getName() + "\tAge:" + getAge());
    }
}
class Testmain
{
    public static void main(String[] args) 
    {
        Person obj1 = new Person("Manan");
        obj1.display();  
    }
}