package regularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {
    public static String xmlParser(String xml) {
        StringBuilder sb = new StringBuilder();


        Pattern pOpen = Pattern.compile("<\\w.+?>");
        Pattern pClose = Pattern.compile("</\\w.+>");
        Pattern pBody = Pattern.compile(">.+?<");
        Pattern pEmpty = Pattern.compile("<\\w.+?/>");

        String[] lines = xml.split("\n\\s*");


        for (String line:lines) {
            Matcher mOpen = pOpen.matcher(line);
            Matcher mClose =pClose.matcher(line);
            Matcher mBody = pBody.matcher(line);
            Matcher mEmpty = pEmpty.matcher(line);

            if (mEmpty.find()) {
                sb.append(mEmpty.group());
                sb.append(" - tag without body.\n");
            } else if (mOpen.find()) {
                sb.append(mOpen.group());
                sb.append(" - open tag.\n");
            }
            if (mBody.find()) {
                sb.append(mBody.group().substring(1));
                sb.append("\b - body.\n");
            }
            if (mClose.find()) {
                sb.append(mClose.group());
                sb.append(" - close tag.\n");
            }
        }

        return sb.toString();

    }

    public static void main(String[] args) {
        String xml = "<notes>\n" +
                "    <note id = \"1\">\n" +
                "        <to>Вася</to>\n" +
                "        <from>Света</from>\n" +
                "        <heading>Напоминание</heading>\n" +
                "        <body>Позвони мне завтра!</body>\n" +
                "    </note>\n" +
                "    <note id = \"2\">\n" +
                "        <to>Петя</to>\n" +
                "        <from>Маша</from>\n" +
                "        <heading>Важное напоминание</heading>\n" +
                "        <body/>\n" +
                "    </note>\n" +
                " </notes> \n";
        String xmlAnalysis = xmlParser(xml);
        System.out.println(xmlAnalysis);
    }
}
