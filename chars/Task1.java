package chars;

public class Task1 {

    public static String edit(String str) {
        char[] strChar = str.toCharArray();
        str = "";
        for (int i = 0; i < strChar.length; i++) {
            if (Character.isUpperCase(strChar[i])) {
                str += "_" + Character.toLowerCase(strChar[i]);
            } else {
                str += strChar[i];
            }
        }

        return str;
    }

    public static void main(String[] args) {

        String[] names = {"firstName", "secondName", "thirdName", "indexOutOfBounds"};

        for (String name:names) {
            name = edit(name);
            System.out.println(name);
        }

    }
}
