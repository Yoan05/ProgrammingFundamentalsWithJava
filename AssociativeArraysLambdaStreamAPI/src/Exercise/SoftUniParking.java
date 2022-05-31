package Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        Map<String, String> mapWithPlates = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String[] command = scanner.nextLine().split("\\s+");
            String name = command[1];
            switch (command[0]) {
                case "register":
                    String plate = command[2];
                    if(mapWithPlates.containsKey(name)){
                        System.out.printf("ERROR: already registered with plate number %s%n", plate);
                    }else{
                        mapWithPlates.put(name, plate);
                        System.out.printf("%s registered %s successfully%n", name, plate);
                    }
                    break;
                case "unregister":
                    if (mapWithPlates.containsKey(name)){
                        mapWithPlates.remove(name);
                        System.out.printf("%s unregistered successfully%n",name);
                    }else {
                        System.out.printf("ERROR: user %s not found%n", name);
                    }
                    break;
            }
        }
        mapWithPlates.forEach((k,v) -> System.out.printf("%s => %s%n", k, v));
    }
}
