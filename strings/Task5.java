package strings;

public class Task5 {

    public static int count (String str, char symb) {
        int counter = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == symb) {
                counter++;
            }
        }

        return counter;
    }

    public static void main(String[] args) {

        String str = "aaaa";

        System.out.println(count(str, 'a'));
    }
}
