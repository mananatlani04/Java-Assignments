class Duplicate
{
    private String data;
    public Duplicate(String data)
    {
        this.data = data;
    }
    public String findduplicate()
    {
        char arr[] = data.toCharArray();
        for ( int i = 0; i < data.length() - 1; i++)
        {
            for ( int j = i + 1; j < data.length(); j++)
            {
                if ( arr[i] == arr[j] )
                {
                    arr[j] = '\0';
                }
            }
        }
        String s = new String(arr);
        arr = s.toCharArray();
        return s;
    }
    public void display()
    {
        System.out.println("entered string :" + " " + data);
    }
}
class Testmain
{
    public static void main(String[] args) 
    {
        Duplicate obj1 = new Duplicate("aabbccddd");
        obj1.display();
        System.out.println("result : " + obj1.findduplicate());
    }
}