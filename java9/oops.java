class Time
{
    private int day;
    private int hour;
    private int minute;
    private int seconds;
public Time(int day, int hour, int minute, int seconds)
{
    this.day = day;
    this.hour = hour;
    this.minute = minute;
    this.seconds = seconds;
}
public Time()
{
    hour = minute = seconds = day = 0;
}
public Time add(Time t)
{
    Time temp = new Time();
    temp.day = this.day + t.day;
    temp.hour = this.hour + t.hour;
    temp.minute = this.minute + t.minute;
    temp.seconds = this.seconds + t.seconds;
    temp.day = this.day + t.day;
if(temp.hour > 24)
{
    temp.day++;
    temp.hour = temp.hour % 24;
}
if(temp.seconds > 59)
{
    temp.minute++;
    temp.seconds = temp.seconds % 10;
}
if(temp.minute > 59)
{
    temp.hour++;
    temp.minute = temp.minute % 10;
}
    return temp;
}
public int getday()
{
    return day;
}
public int gethour()
{
    return hour;
}
public int getminute()
{
    return minute;
}
public int getseconds()
{
    return seconds;
}
public void display()
{
    System.out.println("day:" + day +"  hour:" + hour + "   minute:" + minute + "   seconds:" + seconds);
}
}
class Testmain
{
    public static void main(String[] args) 
    {
        Time t1 = new Time(1,10,30,20);
        Time t2 = new Time(1,15,20,45);
        t1.display();
        t2.display();
        Time result = t1.add(t2);
        System.out.println("day:" + result.getday() + " " + "   Hour:" + result.gethour() + "  Minute:" + result.getminute() + "   Seconds:" + result.getseconds() + " ");
    }
}