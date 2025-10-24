class Testmain
{
    public static void main(String[] args) 
    {
        String a = "java is platform independent ";
        char [] Arr = a.toCharArray();
        int j = 0;
        for ( int i = 1; i < Arr.length; i++ )
        {
            if( Arr[i] == ' ' )
            {
                for ( j = i; j >= 1 ; j--)
                {
                    System.out.print((char)Arr[j - 1]);
                    if( Arr[j - 1] == ' ')
                    {
                        break;
                    }
                }
            }
            if ( Arr[i] == ' ')
            {
                System.out.print(" ");
            }
        }
    }
}   
