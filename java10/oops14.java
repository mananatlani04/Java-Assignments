/*14) WAP check if a String contains only digits?*/
class DigitOnly {
    public static void main(String[] args) {
        String str = "123456";
        boolean onlyDigits = true;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch < '0' || ch > '9') {
                onlyDigits = false;
                break;
            }
        }
        System.out.println("Contains only digits: " + onlyDigits);
    }
}