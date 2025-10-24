class MovieRatingSystem
{
    private String name;
    private String genre;
    private float rating;
    public void setData(String name,String genre,float rating)
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
    public float getRating()
    {
        return rating;
    }
    public void display()
    {
        System.out.println("Movie Name:"+ name);
        System.out.println("Genre:"+ genre);
        System.out.println("Rating:"+ rating);
    }
    public void isHit()
    {
    if(rating >= 8.0)
    {
        System.out.println("true");
        System.out.println("Movie is hit");
    }
    else
    System.out.println("Movie is not hit");
    }
}
class Testmain
{
    public static void main(String args[])
    {
        MovieRatingSystem obj = new MovieRatingSystem();
        obj.setData("Houseful 4","Comedy",7.0f);
        obj.display();
        obj.isHit();
    }
}
