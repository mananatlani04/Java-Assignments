class Person
{
    private String name;
    private int age;
public Person(String name, int age)
{
    this.name = name;
    this.age = age;
}
public void setA(String name)
{
    this.name = name;
}
public void setB(int age)
{
    this.age = age;
}
public String getname()
{
    return name;
}
public int getage()
{
    return age;
}
public void display()
{
    System.out.println("name:" + name +"  age:" + age);
}
}
class Testmain
{
    public static void main(String[] args) 
    {
        Person t1 = new Person("Sonu",20);
        Person t2 = new Person("Rahul",21);
        t1.display();
        t2.display();
    }
}