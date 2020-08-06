package strings;

public class Task2 {

    public static StringBuilder insertSymb(char symb, char newSymb, StringBuilder str) {

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == symb) {
                i++;
                str.insert(i, newSymb);
            }
        }

        return str;
    }

    public static void main(String[] args) {

        StringBuilder str = new StringBuilder("aaaac");

        System.out.println(insertSymb('a', 'b', str));
    }
}
