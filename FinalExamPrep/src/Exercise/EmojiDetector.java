package Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmojiDetector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Pattern patternNumbers = Pattern.compile("(?<digit>[\\d])");
        Matcher matcherNumbers = patternNumbers.matcher(input);

        Pattern patternEmojis = Pattern.compile("([:*]{2,})(?<emoji>[A-Z][a-z]{2,})\\1");
        Matcher matcherEmojis = patternEmojis.matcher(input);

        int threshold = 1;
        while (matcherNumbers.find()){
            int digit = Integer.parseInt(matcherNumbers.group("digit"));
            threshold *= digit;
        }
        System.out.println("Cool threshold: " + threshold);

        int counter = 0;
        Map<String, Integer> emojiScores = new LinkedHashMap<>();
        while(matcherEmojis.find()){
            counter++;
            String emoji = matcherEmojis.group(1) + matcherEmojis.group("emoji") + matcherEmojis.group(1);
            int score = 0;
            for (int i = 0; i < emoji.length(); i++) {
                int c = emoji.charAt(i);
                score+= c;
            }
            if (score >= threshold){
            emojiScores.put(emoji, score);
            }
        }
        System.out.printf("%d emojis found in the text. The cool ones are:%n", counter);
        for (String key : emojiScores.keySet()){
            System.out.println(key);
        }
    }
}
