package Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String resourse = scanner.nextLine();
        Map<String, Integer> resourses = new LinkedHashMap<>();
        while(!resourse.equals("stop")){
            int quantity = Integer.parseInt(scanner.nextLine());
            if (!resourses.containsKey(resourse)){
                resourses.put(resourse, quantity);
            } else {
                resourses.put(resourse, resourses.get(resourse) + quantity);
            }

            resourse = scanner.nextLine();
        }
        resourses.forEach((key, value) -> System.out.printf("%s -> %d%n", key, value));
    }

}
