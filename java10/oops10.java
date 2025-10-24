/*10) WAP to count the word whose first letter is vowel.*/
import java.util.Scanner;
class Vowel
{
    private String data;

    public Vowel(String data)
    {
        this.data = data;
    }
    public int count()
    {
        char Arr[] = data.toCharArray();
        int count = 0;
        for( int i = 0; i < Arr.length; i++)
        {
            if(Arr[i] == 'a' || Arr[i] == 'e' || Arr[i] == 'i' || Arr[i] == 'o' || Arr[i] == 'u')
            {
                count++;
                if(Arr[i] == ' ')
                break;
            }
        }
    }
}