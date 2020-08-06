package chars;

public class Task4 {

    public static boolean isDigit(char symb) {
        if (symb >= '0' && symb <= '9') {
            return true;
        }

        return false;
    }

    public static int count (String str) {
        int counter = 0;
        char[] strChar = str.toCharArray();

        for (int i = 0; i < strChar.length; i++) {
            if (isDigit(strChar[i])) {
                while (isDigit(strChar[i])) {
                    i++;
                }
                counter++;
            }
        }

        return counter;
    }

    public static void main(String[] args) {
        String str = "123 321 v 5 rerwe44 77e7e";

        System.out.println(count(str));
    }
}
