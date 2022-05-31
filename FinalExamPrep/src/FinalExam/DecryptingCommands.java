package FinalExam;

import java.util.Scanner;

public class DecryptingCommands {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(scanner.nextLine());
        String line = scanner.nextLine();
        while (!line.equals("Finish")) {
            String[] data = line.split("\\s+");
            String command = data[0];
            switch (command) {
                case "Replace":
                    String substring = data[1];
                    String replacement = data[2];
                    String newWord = sb.toString().replaceAll(substring, replacement);
                    sb.setLength(0);
                    sb.append(newWord);
                    System.out.println(sb);
                    break;
                case "Cut":
                    int start = Integer.parseInt(data[1]);
                    int end = Integer.parseInt(data[2]);
                    if (end < sb.length() && end >=0 && start>=0) {
                        sb.delete(start, end + 1);
                        System.out.println(sb);
                    } else {
                        System.out.println("Invalid indices!");
                    }
                    break;
                case "Make":
                    String type = data[1];
                    if (type.equals("Upper")) {
                        newWord = sb.toString().toUpperCase();
                        sb.setLength(0);
                        sb.append(newWord);
                        System.out.println(sb);
                    } else if (type.equals("Lower")) {
                        newWord = sb.toString().toLowerCase();
                        sb.setLength(0);
                        sb.append(newWord);
                        System.out.println(sb);
                    }
                    break;
                case "Check":
                    substring = data[1];
                    if (sb.toString().contains(substring)) {
                        System.out.printf("Message contains %s%n", substring);
                    } else {
                        System.out.printf("Message doesn't contain %s%n", substring);
                    }
                    break;
                case "Sum":
                    start = Integer.parseInt(data[1]);
                    end = Integer.parseInt(data[2]);
                    if (end < sb.length() && end >=0 && start>=0){
                        int sum = 0;
                        for (int i = start; i < end + 1; i++) {
                            sum += sb.toString().charAt(i);
                        }
                        System.out.println(sum);
                    } else {
                        System.out.println("Invalid indices!");
                    }
                    break;
            }
            line = scanner.nextLine();
        }
    }
}
