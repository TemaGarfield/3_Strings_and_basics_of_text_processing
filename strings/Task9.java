package strings;

public class Task9 {

    public static int countUpper(String text) {
        int counterUpper = 0;
        for (int i = 0; i < text.length(); i++) {
            if (Character.isUpperCase(text.charAt(i))) {
                counterUpper++;
            }
        }

        return counterUpper;
    }

    public static int countLower(String text) {
        int counterLower = 0;
        for (int i = 0; i < text.length(); i++) {
            if (Character.isLowerCase(text.charAt(i))) {
                counterLower++;
            }
        }

        return counterLower;
    }

    public static void main(String[] args) {
        String str = "abcdE";

        System.out.println("Big letters: " + countUpper(str) + "\nSmall letters: " + countLower(str));
    }
}
