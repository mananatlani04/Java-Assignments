/*9. Online Library System
A student is trying to issue more books than the limit (say, 3).
Should you handle it with a business rule check or by throwing a custom exception MaxBooksIssuedException?
Justify your answer.*/

import java.util.ArrayList;

class MaxBooksIssuedException extends Exception
{
    public MaxBooksIssuedException(String msg)
    {
        super(msg);
    }
}
class Library
{
    private String Name;
    private int books;
    private int Id;
    public Library(int Id,String Name,int books)
    {
        this.Name = Name;
        this.books = books;
        this.Id = Id;
    }
    public void setBooks(int books)
    {
        this.books = books;
    }
    public String getName()
    {
        return Name;
    }
    public int getbooks()
    {
        return books;
    }
    public int getId()
    {
        return Id;
    }
    public String display()
    {
        return "Id:"+ Id +"Name of the borrower:" + Name + "\tNo. of books borrwed:" + books;
    }
}
class Management
{
    ArrayList<Library> arr = new ArrayList<Library>();
    public void add(Library L)
    {
        arr.add(L);
    }
    public void remove(Library L)
    {
        arr.remove(L);
    }
    public void display()
    {
        for(Library L : arr)
        {
            System.out.println(L.display());
        }
    }
    public void issue(int Id1)
    {
        boolean found = false;
        for(Library L : arr)
        {
            if(Id1 == L.getId())
            {
                found = true;
                try
                {
                    if(L.getbooks() > 2)
                    {
                        throw new MaxBooksIssuedException("Limit Reached Cannot Issue More Books Now");
                    }
                    else
                    {
                        System.out.println("Limit Not Reached | You Can Issue");
                        L.setBooks(L.getbooks() + 1); // Update books count
                        System.out.println("Book issued successfully. Total books now: " + L.getbooks() + "\tName:" + L.getName());
                    }
                    break;
                }
                catch(MaxBooksIssuedException e)
                {
                    e.printStackTrace();
                }
            }
        }
       if(!found)
        {
            System.out.println("--------------------------------------------");
            System.out.println("Id Not Found | Please Enter valid Valid Id");
            System.out.println("----------------------------------------------");
        }
    }
}
class Testmain
{
    public static void main(String[] args) 
    {
        Library obj1 = new Library(111, "Rahul", 2);  
        Library obj2 = new Library(112, "Cheeku", 3);  
        Library obj3 = new Library(113, "Meeku", 1);  
        Management M = new Management();
        M.add(obj1);
        M.add(obj2);
        M.add(obj3);
        M.issue(111);
        M.remove(obj2);
        M.issue(112);
        M.issue(113);
    }
}