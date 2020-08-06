package strings;

public class Task6 {

    public static StringBuilder doubleString(StringBuilder str) {

        for (int i = 0; i < str.length(); i++) {
            str.insert(i, str.charAt(i));
            i++;
        }

        return str;
    }
    public static void main(String[] args) {

        StringBuilder str = new StringBuilder("aaabc");

        System.out.println(doubleString(str));
    }
}
