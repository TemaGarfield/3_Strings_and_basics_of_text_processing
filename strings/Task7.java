package strings;

import java.util.Scanner;

public class Task7 {

    public static String deleateRepeating(StringBuilder text) {
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch == ' ') {
                text.deleteCharAt(i);
                i--;
            }

            for (int j = i + 1; j < text.length(); j++) {
                if (ch == text.charAt(j)) {
                    text.deleteCharAt(j);
                    j--;
                }
            }
        }

        return text.toString();
    }




    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter string: ");
        String str = in.nextLine();

        StringBuilder sb = new StringBuilder();
        sb.append(str);

        System.out.println(deleateRepeating(sb));

    }
}
