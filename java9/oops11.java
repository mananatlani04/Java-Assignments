import java.util.ArrayList;
import java.util.Scanner;
class Library
{
    private String Bookname;
    private String Author;
    private int Price;
    public Library(String Bookname,String Author, int Price){
        this.Bookname = Bookname;
        this.Author = Author;
        this.Price = Price;
    }
    public Library(){}
    public String getFullLibraryDetails()
    {
        return Bookname+" : "+Author+" : "+Price;
    }
}
class collection
{
    ArrayList<Library> Al = new ArrayList<Library>();

    public void addLibrary(Library name)
    {
        Al.add(name);
    }
    public void removelibrary(Library name)
    {
        Al.remove(name);
    }
    public void displayAccDetails()
    {
        for(Library name : Al)
        {
            System.out.println(name.getFullLibraryDetails());
        }
    }
}
class Testmain 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Library obj1 = new Library("Wings Of Fire","Dr.A.P.J Abdul Kalam",500);
        Library obj2 = new Library("Rain","abc",100);
        Library obj3 = new Library("Peak","def",700);

        collection lib = new collection(); // lib
        lib.addLibrary(obj1);
        lib.addLibrary(obj2);
        lib.addLibrary(obj3);
        
        lib.displayAccDetails();
        System.out.println("-------------------------------------");
        lib.removelibrary(obj1);
        lib.displayAccDetails();
    }
}