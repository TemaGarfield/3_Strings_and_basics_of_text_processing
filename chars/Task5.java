package chars;

public class Task5 {

    public static int firstSymb(String str) {
        int firstSymbNumb = 0;

        char[] strChar = str.toCharArray();
        while (strChar[firstSymbNumb] == ' ') {
            firstSymbNumb++;
        }

        return firstSymbNumb;
    }

    public static String editString(String str) {

        char[] strChar = str.toCharArray();
        int i = firstSymb(str);
        str = "";
        for (   ; i < strChar.length - 1; i++) {
            if (strChar[i] == ' ' && strChar[i + 1] != ' ') {
                str += strChar[i];
            } else if (strChar[i] != ' ') {
                str += strChar[i];
            }
        }

        return str;
    }
    public static void main(String[] args) {
        String str = "   123   13     2    ";

        System.out.println(editString(str));
    }

}
