package chars;

public class Task2 {

    static char[] word = {'w', 'o', 'r', 'd'};
    static String letter = "letter";


    public static void main(String[] args) {

        String str = "T word word wo kot word word word kotik word";

        char[] strChar = str.toCharArray();

        str = "";

        for (int i = 0; i < strChar.length; i++) {
            boolean flag = false;
            for (int j = 0; j < word.length; j++, i++) {
                if (strChar[i] == word[j]) {
                    flag = true;
                } else {
                    flag = false;
                    i -= j;
                    break;
                }
            }
            if (flag) {
                str += letter;
                i--;
            } else {
                str += strChar[i];
            }
        }

        System.out.println(str);
    }
}
