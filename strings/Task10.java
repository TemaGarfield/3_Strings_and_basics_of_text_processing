package strings;

public class Task10 {

    public static int countSentence (String text) {
        int counter = 0;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == '.' || text.charAt(i) == '!' || text.charAt(i) == '?') {
                counter++;
            }
        }

        return counter;
    }

    public static void main(String[] args) {
        String str = "abc! ccc. dddd?";

        System.out.println(countSentence(str));
    }
}
