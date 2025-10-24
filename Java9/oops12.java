class Airplane
{
    private int Flightnumber;
    private String destination;
    private float departtime;
    private float currenttime;
public Airplane(int Flightnumber, String destination, float departtime, float currenttime)
{
    this.Flightnumber = Flightnumber;
    this.destination = destination;    
    this.departtime = departtime;
    this.currenttime = currenttime;

}
public void setName(int Flightnumber)
{
    this.Flightnumber = Flightnumber;
}
public void setJobTitle(String destination)
{
    this.destination = destination;
}
public void setSalary(float departtime)
{
    this.departtime = departtime;
}
public void setCurrentTime(float currenttime)
{
    this.currenttime = currenttime;
}
public int getFlightNumber()
{
    return Flightnumber;
}
public String getdestination()
{
    return destination;
}
public double getDeparttime()
{
    return departtime;
}
public double getCurrenttime()
{
    return currenttime;
}
public void display()
{
    System.out.println("Flightnumber Nunmber:" + Flightnumber +"  Destination:" + destination);
}
public void status()
{
    if ( departtime == currenttime)
    {
        System.out.println("Flight is on time");
    }
    else if ( departtime > currenttime )
    {
        System.out.println("Flight is late");
    }
    else
    {
        System.out.println("Flight is early");
    }
}
}
class Testmain
{
    public static void main(String[] args)
    {
        Airplane t1 = new Airplane(577,"florida",4.40f,4.40f);
        Airplane t2 = new Airplane(490,"Paris",7.00f,6.00f);
        t1.display();
        t1.status();
        System.out.println("--------------------------------------");
        t2.display();
        t2.status();
    }
}