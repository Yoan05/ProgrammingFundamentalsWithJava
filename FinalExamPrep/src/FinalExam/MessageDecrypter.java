package FinalExam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MessageDecrypter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Pattern pattern = Pattern.compile("^([\\$\\%])(?<tag>[A-Z][a-z]{2,})\\1: (?<start>\\[)(?<number1>[\\d]+)(?<end>\\]\\|)\\3(?<number2>\\d+)\\5\\3(?<number3>\\d+)\\5$");

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()){
                String tag = matcher.group("tag");
                int number1 = Integer.parseInt(matcher.group("number1"));
                int number2 = Integer.parseInt(matcher.group("number2"));
                int number3 = Integer.parseInt(matcher.group("number3"));
                char symbol1 = (char)number1;
                char symbol2 = (char)number2;
                char symbol3 = (char)number3;
                System.out.println(tag + ": " + symbol1 + symbol2 + symbol3);
            } else {
                System.out.println("Valid message not found!");
            }
        }
    }
}
