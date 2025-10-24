class Sequence
{
    private String data;
    public Sequence(String data)
    {
        this.data = data;
    }
    public boolean isPalindrome()
    {
       int i = 0 ;
       int j = data.length() - 1;
       while ( i  < j )
       {
         if(data.charAt(i) != data.charAt(j))
         {
           return false;
         }
         i++;
         j--;  
       }
       return true;
    }
}
class Testmain
{
    public static void main(String[] args) 
    {
        Sequence obj1 = new Sequence("hello");    
    }
}