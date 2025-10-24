class Reverse
{
    public static void main(String[] args) 
    {
        int j = 0;
        char [] Arr = { 'J','a','v','a',' ','i','s',' ','p','l','a','t','f','o','r','m',' ','i','n','d','e','p','e','n','d','e','n','t',' '};
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