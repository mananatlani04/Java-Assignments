/*12) Input data exactly in the following format, and print sum of all integer values.
	Sample Input: “67, 89, 23, 67, 12, 55, 66”. (Hint use String class split method and Integer class parseInt method)*/
class SumFromString {
    public static void main(String[] args) {
        String data = "67, 89, 23, 67, 12, 55, 66";
        int sum = 0;
        int num = 0;
        for (int i = 0; i < data.length(); i++) {
            char ch = data.charAt(i);
            if (ch >= '0' && ch <= '9') {
                num = num * 10 + (ch - '0');
            } else if (ch == ',' || ch == ' ') {
                if (i > 0 && data.charAt(i - 1) >= '0' && data.charAt(i - 1) <= '9') {
                    sum += num;
                    num = 0;
                }
            }
        }
        sum += num;
        System.out.println("Sum: " + sum);
    }
}