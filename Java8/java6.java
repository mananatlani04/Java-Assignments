class MovieRatingSystem
{
    private String name;
    private String genre;
    private int rating;
    public void setData(String name,String genre,int rating)
    {
        this.name = name;
        this.genre = genre;
        this.rating = rating;
    }
    public String getName()
    {
        return name;
    }
    public String getGenre()
    {
        return genre;
    }
    public int getRating()
    {
        return rating;
    }
    public void display()
    {
        System.out.println("Movie Name:"+ name);
        System.out.println("Genre:"+ genre);
        System.out.println("Rating:"+ rating);
    }
    public boolean isHit()
    {
    if(rating > 8)
        return true;
    return false;
    }
}
class Testmain
{
    public static void main(String args[])
    {
        MovieRatingSystem obj = new MovieRatingSystem();
        obj.setData("Houseful 4","Comedy",9);
        obj.display();
       if(obj.isHit())
       System.out.println("movie is hit");
       else
       System.out.println("movie is not hit");
    }
}
