package strings;

public class Task1 {

    public static int findMaxSpace(String str) {

        int counter = 0;
        int maxSpace = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                counter++;
            } else {
                if (maxSpace < counter) {
                    maxSpace = counter;
                }

                counter = 0;
            }
        }

        return maxSpace;
    }

    public static void main(String[] args) {

        String str = " twrwrwer    qewoqwe   fdsfs     eriwrw ";


        System.out.println(findMaxSpace(str));
    }
}
