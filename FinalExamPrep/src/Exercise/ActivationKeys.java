package Exercise;

import java.util.Locale;
import java.util.Scanner;

public class ActivationKeys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder sb = new StringBuilder(scanner.nextLine());
        String line = scanner.nextLine();
        while (!line.equals("Generate")) {
            String[] data = line.split(">>>");
            String command = data[0];
            switch (command) {
                case "Contains":
                    String substring = data[1];
                    if (sb.toString().contains(substring)) {
                        System.out.printf("%s contains %s%n", sb, substring);
                    } else {
                        System.out.println("Substring not found!");
                    }
                    break;
                case "Flip":
                    String subcommand = data[1];
                    int start = Integer.parseInt(data[2]);
                    int end = Integer.parseInt(data[3]);
                    substring = sb.toString().substring(start, end);
                    if (subcommand.equals("Upper")){
                        substring = substring.toUpperCase();
                        sb.delete(start, end);
                        sb.insert(start, substring);
                        System.out.println(sb);
                    } else if (subcommand.equals("Lower")){
                        substring = substring.toLowerCase();
                        sb.delete(start, end);
                        sb.insert(start, substring);
                        System.out.println(sb);
                    }
                    break;
                case "Slice":
                    start = Integer.parseInt(data[1]);
                    end = Integer.parseInt(data[2]);
                    if (start <= sb.length() && end <= sb.length() && start >= 0 && end >= 0) {
                        sb.delete(start, end);
                        System.out.println(sb);
                    }
                    break;

            }
            line = scanner.nextLine();
        }
        System.out.println("Your activation key is: " + sb);
    }
}
