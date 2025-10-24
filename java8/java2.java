class book
{
    private String title;
    private String author;
    private int price;
    public void setData(String title,String author,int price)
    {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public String getTitle()
    {
        return title;
    }
    public String getAuthor()
    {
        return author;
    }
    public int getPrice()
    {
        return price;
    }
    public void display()
    {
        System.out.println("Title:"+ title + "   " + "Author:"+ author + "   " + "Price:"+ price);
    }
}
class Testmain
{
    public static void main(String args[])
    {
        book obj = new book();
        obj.setData("Wings of fire","A.P.J.Abdul Kalam",400);
        obj.display();
    }
}
