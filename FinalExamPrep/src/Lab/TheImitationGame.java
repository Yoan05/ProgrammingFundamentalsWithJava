package Lab;

import java.util.Scanner;

public class TheImitationGame {
    public static void main(String[] args) {
        //System.out.println(move("abcd", 2));
        //System.out.println(move("abcd", 0));
        //System.out.println(move("abcd", 3));


        Scanner scanner = new Scanner(System.in);

        String message = scanner.nextLine();

        String command = scanner.nextLine();
        while(!command.equals("Decode")){
            String[] commandParts = command.split("\\|");
            String commandName = commandParts[0];
            switch (commandName){
                case "ChangeAll":
                    message = changeAll(message, commandParts[1], commandParts[2]);
                    break;
                case "Move":
                    message = move(message, Integer.parseInt(commandParts[1]));
                    break;
                case "Insert":
                    message = insert(message, Integer.parseInt(commandParts[1]), commandParts[2]);
                    break;
                default:
                    throw new IllegalStateException("Unknown command " + commandName);
            }


            command = scanner.nextLine();
        }

        System.out.println("The decrypted message is: " + message);
    }

    private static String changeAll(String message, String substr, String replacement) {
            return message.replace(substr, replacement);
    }

    private static String insert(String message, int index, String substring) {
           String firstPart = message.substring(0, index);
           String secondPart = message.substring(index);

        return firstPart + substring + secondPart;
    }

    private static String move(String message, int length) {
            String firstPart = message.substring(0, length);
            String secondPart = message.substring(length);
        return secondPart + firstPart;
    }
}
