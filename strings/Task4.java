package strings;

public class Task4 {

    public static String makeWord(String str) {
        String word = new String();

        word = word.concat(word.valueOf(str.charAt(str.indexOf('т'))));
        word = word.concat(word.valueOf(str.charAt(str.indexOf('о'))));
        word = word.concat(word.valueOf(str.charAt(str.indexOf('р'))));
        word = word.concat(word.valueOf(str.charAt(str.indexOf('т'))));

        return word;
    }

    public static void main(String[] args) {

        String informatics = "информатика";

        System.out.println(makeWord(informatics));
    }
}
