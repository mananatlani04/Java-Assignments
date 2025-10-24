import java.util.ArrayList;
class Book
{
    private String title;
    private String author;
    private long ISBN;
public Book(String title, String author, long ISBN)
{
    this.title = title;
    this.author = author;
    this.ISBN = ISBN;
}
public Book(){}
public String getBookdetails()
{
    return title + ":" + author + ":" + ISBN;
}
}
class addremove
{
    private ArrayList<Book> B = new ArrayList<Book>();
    public void addBook(Book data)
    {
        B.add(data);
    }
    public void removeBook(Book data)
    {
        B.remove(data);
    }
    public void displayBookDetails()
    {
        for(Book data : B)
        {
            System.out.println(data.getBookdetails());
        }
    }
}
class Testmain
{
    public static void main(String[] args) 
    {
    Book obj1 = new Book("Wings Of Fire","A.P.J. Abdul Kalam",848385787544885L);
    Book obj2 = new Book("Wings Of Fire","A.P.J. Abdul Kalam",848385787544885L);
    Book obj3 = new Book("Wings Of Fire","A.P.J. Abdul Kalam",848385787544885L);

    addremove A = new addremove();
    A.addBook(obj1);
    A.addBook(obj2); 
    A.addBook(obj3);
    
    A.displayBookDetails();

    A.removeBook(obj3);
    System.out.println("------------------------------");
    A.displayBookDetails();

    }
}