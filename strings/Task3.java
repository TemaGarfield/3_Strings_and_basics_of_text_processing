package strings;

public class Task3 {

    public static boolean isPalindrome(StringBuilder str) {
        if (str.toString().equals(str.reverse().toString())) {
            return true;
        }

        return false;

    }
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("aba");

        if (isPalindrome(str)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }



    }
}
