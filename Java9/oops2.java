class Person
{
    private String name;
    private String breed;
public Person(String name, String breed)
{
    this.name = name;
    this.breed = breed;
}
public void setName(String name)
{
    this.name = name;
}
public void setBreed(String breed)
{
    this.breed = breed;
}
public String getname()
{
    return name;
}
public String getbreed()
{
    return breed;
}
public void display()
{
    System.out.println("name:" + name +"  breed:" + breed);
}
}
class Testmain
{
    public static void main(String[] args) 
    {
        Person t1 = new Person("Tommy","Pitbull");
        Person t2 = new Person("Germy","German Shepherd");
        t1.display();
        t1.setName("Thomas");
        t1.setBreed("Golden Retriever");
        t1.display();
        t2.display();
    }
}