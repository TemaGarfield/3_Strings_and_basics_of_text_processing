package strings;

public class Task8 {

    public static String findMaxWord(String text) {
        int counter = 0;
        int maxWordLength = 0;
        int j = -1;
        String maxWord = new String();

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ' || i == text.length() - 1) {
                if (maxWordLength < counter) {
                    maxWordLength = counter;
                    maxWord = text.substring(j + 1, i);
                }

                counter = 0;
                j = i;
            } else {
                counter++;
            }
        }

        return maxWord;
    }

    public static void main(String[] args) {
        String str = "aasssss6 aaaa a aassss5 aaa";

        System.out.println(findMaxWord(str));
    }
}
