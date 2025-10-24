/*13)WAP check if two Strings are anagrams of each other?
(Hint Anagram words: LISTEN - SILENT 
				  TRIANGLE - INTEGRAL)*/
class AnagramCheck {
    public static void main(String[] args) {
        String s1 = "LISTEN";
        String s2 = "SILENT";
        if (s1.length() != s2.length()) {
            System.out.println("Not anagrams");
            return;
        }
        char[] a1 = new char[s1.length()];
        char[] a2 = new char[s2.length()];
        for (int i = 0; i < s1.length(); i++) {
            a1[i] = s1.charAt(i);
            a2[i] = s2.charAt(i);
        }
        for (int i = 0; i < a1.length - 1; i++) {
            for (int j = i + 1; j < a1.length; j++) {
                if (a1[i] > a1[j]) {
                    char temp = a1[i];
                    a1[i] = a1[j];
                    a1[j] = temp;
                }
                if (a2[i] > a2[j]) {
                    char temp = a2[i];
                    a2[i] = a2[j];
                    a2[j] = temp;
                }
            }
        }
        boolean match = true;
        for (int i = 0; i < a1.length; i++) {
            if (a1[i] != a2[i]) {
                match = false;
                break;
            }
        }
        System.out.println(match ? "Anagrams" : "Not anagrams");
    }
}