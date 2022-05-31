package FinalExam;

import java.util.*;

public class Dictionary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] allWords = scanner.nextLine().split(" \\| ");
        String[] testWords = scanner.nextLine().split(" \\| ");
        String command = scanner.nextLine();
        Map<String, List<String>> dictionary = new LinkedHashMap<>();
        for (int i = 0; i < allWords.length; i++) {
            String[] word = allWords[i].split(": ");
            List<String> def = new ArrayList<>();
            if (dictionary.containsKey(word[0])) {
                dictionary.get(word[0]).add(word[1]);
            } else {
                def.add(word[1]);
                dictionary.put(word[0], def);
            }
        }
        if (command.equals("Hand Over")){
            dictionary.keySet().forEach(key -> System.out.print(key + " "));
        } else if (command.equals("Test")){
            for (int i = 0; i < testWords.length; i++) {
                if (dictionary.containsKey(testWords[i])){
                    printTestWords(testWords[i], dictionary.get(testWords[i]));
                }
            }
        }
    }
    static void printTestWords (String key, List<String> values){
        System.out.println(key + ":");
        for (int i = 0; i < values.size(); i++) {
            System.out.println("-" + values.get(i));
        }
    }
}
