/*20)Create class Tile to store the edge length of a square tile ,
 and create another class Floor to store length and width of a rectangular floor.
Add method totalTiles(Tile t) in Floor class with Tile as argument 
to calculate the whole number of tiles needed to cover the floor completely.*/

import java.util.Scanner;

class Tile
{
    private double edgelength;
    public Tile( double edgelength )
    {
        this.edgelength = edgelength;
    }
    public double getEdgelength()
    {
        return edgelength;
    }
    public double getAreaoftile()
    {
        return getEdgelength() * getEdgelength();
    }
}
class Floor
{
    private double length;
    private double width;
    public Floor( double length, double width )
    {
        this.length = length;
        this.width = width;
    }
    public double getLength()
    {
        return length;
    }
    public double getWidth()
    {
        return width;
    }
    public int getTotalTiles(Tile tile)
    {
        double FloorArea = getLength() * getWidth();
        if(FloorArea < tile.getAreaoftile())
        {
        System.out.println("invalid input");
        System.out.println("Tile Size is bigger than the Floor Area");
        }
        int tiles = (int)(FloorArea/tile.getAreaoftile());
        return tiles;
    }
}
class Testmain
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter edge length");
        double edge = sc.nextDouble();
        Tile obj = new Tile(edge);
        Floor obj1 = new Floor(10,50);
        int Tilesneeded = obj1.getTotalTiles(obj);
        System.out.println("Total No. of Tiles Needed:" + Tilesneeded);
        
    }
}