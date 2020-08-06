package regularExpressions;

import java.util.regex.*;
import java.util.Arrays;
import java.util.Scanner;

public class Task1 {

    public static void choice(String text) {
        Scanner in = new Scanner(System.in);
        String choiceText = "Привет! Что хочешь сделать? \n1)Отсортировать абзацы по количеству предложений." +
                "\n2)Отсортировать слова в предложении по длине." +
                "\n3)Отсортировать лексемы.";
        System.out.println(choiceText);
        int answer;
        do {
            System.out.print("Введи свой ответ: ");
            answer = in.nextInt();
            if (answer < 1 || answer > 3) {
                System.out.println("Ответ должен быть от 1 до 3");
            } else {
                break;
            }

        } while (true);

        switch (answer) {
            case 1:
                sortByParagraphs(text);
                break;
            case 2:
                sortByWords(text);
                break;
            case 3:
                sortByLexem(text);
                break;
            default:
        }
    }

    public static void sortByLexem(String text) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите символ: ");
        String letter = in.nextLine();
        String[] paragraphs = text.split("\n");
        for (String paragraph : paragraphs) {
            String[] sentences = splitSentences(paragraph);
            for (String sentence : sentences) {
                String[] words = splitWords(sentence);

                for (int k = words.length - 1; k >= 0; k--) {
                    for (int m = 0; m < k; m++) {
                        int countRight = 0;
                        int countLeft = 0;
                        for (int n = 0; n < words[m].length(); n++) {
                            if (String.valueOf(words[m].charAt(n)).compareToIgnoreCase(letter) == 0) {
                                countLeft++;
                            }
                        }
                        for (int n = 0; n < words[m + 1].length(); n++) {
                            if (String.valueOf(words[m + 1].charAt(n)).compareToIgnoreCase(letter) == 0) {
                                countRight++;
                            }
                        }
                        if (countLeft < countRight) {
                            String tmp = words[m];
                            words[m] = words[m + 1];
                            words[m + 1] = tmp;
                        } else if (countLeft == countRight) {
                            String[] forCompare = {words[m], words[m + 1]};
                            Arrays.sort(forCompare);
                            words[m] = forCompare[0];
                            words[m + 1] = forCompare[1];
                        }
                    }
                }
                for (String word : words) {
                    System.out.print(word + " ");
                }
                System.out.print("\b. ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void sortByWords(String text) {
        String[] sentences = splitSentences(text);

        for (String sentence:sentences) {
            String[] words = splitWords(sentence);
            sentence = "";
            int[] lenghtWords = new int[words.length];
            for (int i = 0; i < lenghtWords.length; i++) {
                lenghtWords[i] = words[i].length();
            }

            for (int i = 0; i < lenghtWords.length; i++) {
                for (int j = lenghtWords.length - 1; j > i; j--) {
                    if (lenghtWords[i] > lenghtWords[j]) {
                        int tmpInt = lenghtWords[i];
                        lenghtWords[i] = lenghtWords[j];
                        lenghtWords[j] = tmpInt;

                        String tmpStr = words[i];
                        words[i] = words[j];
                        words[j] = tmpStr;
                    }
                }
                sentence += words[i] + " ";
            }

            System.out.println(sentence);
        }
    }


    public static void sortByParagraphs(String text) {
        String[] paragraphs = text.split("\n");
        int numberParagraphs = paragraphs.length;
        int[] lenghtParagraphs = new int[numberParagraphs];
        for (int i = 0; i < lenghtParagraphs.length; i++) {
            lenghtParagraphs[i] = splitSentences(paragraphs[i]).length;
        }

        for (int i = 0; i < lenghtParagraphs.length; i++) {
            for (int j = lenghtParagraphs.length - 1; j > i; j--) {
                if (lenghtParagraphs[i] > lenghtParagraphs[j]) {
                    String tmpStr = paragraphs[i];
                    paragraphs[i] = paragraphs[j];
                    paragraphs[j] = tmpStr;

                    int tmpInt = lenghtParagraphs[i];
                    lenghtParagraphs[i] = lenghtParagraphs[j];
                    lenghtParagraphs[j] = tmpInt;
                }
            }
            System.out.println(paragraphs[i]);
        }
    }

    public static String[] splitWords(String text) {
        Pattern p = Pattern.compile("\\s*\\s|,|;|:");
        return p.split(text);
    }

    public static String[] splitSentences(String text) {
        Pattern p = Pattern.compile("\\.*[.!?]\\s*");
        return p.split(text);
    }
    public static void main(String[] args) {
        String text = "u re good man. why u crying? Good night! Pls give me that book." + "\n" +
                "Pls give me that book. Thank u! I love you." + "\n" +
                "Text has no sence. I love cat! Please do not panic. Good day!";

        choice(text);

    }
}
