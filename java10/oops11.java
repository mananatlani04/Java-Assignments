/*11) Input name of a person and count how many vowels it contains. Use String class methods.*/
class VowelCount
{
    public static void main(String[] args)
    {
        String name = "Manan";
        int count = 0;
        for (int i = 0; i < name.length(); i++)
        {
            char ch = Character.toLowerCase(name.charAt(i));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            {
                count++;
            }
        }
        System.out.println("Vowels in name: " + count);
    }
}