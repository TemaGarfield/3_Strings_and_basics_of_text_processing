package chars;

public class Task3 {

    public static int counter(String str) {
        char[] strChar = str.toCharArray();
        int counter = 0;
        for (int i = 0; i < strChar.length; i++) {
            if (strChar[i] >= '1' && strChar[i] <= '9') {
                counter++;
            }
        }

        return counter;
    }

    public static void main(String[] args) {
        String number = "1 1 ooo";

        int amount = counter(number);

        System.out.println(amount);
    }
}
