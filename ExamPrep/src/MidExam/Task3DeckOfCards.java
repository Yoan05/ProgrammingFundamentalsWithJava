package MidExam;

import java.util.Arrays;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Task3DeckOfCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] arr = scanner.nextLine().split(", ");
        List<String> cards = new ArrayList<>();
        cards.addAll(Arrays.asList(arr));
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] commandArray = scanner.nextLine().split(", ");
            String command = commandArray[0];
            switch (command) {


                case "Add":
                    int counter = 0;
                    for (int k = 0; k < cards.size(); k++) {
                        if (commandArray[1].equals(cards.get(k))) {
                            counter++;
                        }
                    }
                    if (counter == 0) {
                        cards.add(commandArray[1]);
                        System.out.println("Card successfully added");
                    } else {
                        System.out.println("Card is already in the deck");
                    }
                    break;


                case "Remove":
                    int counter1 = 0;
                    for (int j = 0; j < cards.size(); j++) {
                        if (commandArray[1].equals(cards.get(j))) {
                            counter1++;
                        }
                    }
                    if (counter1 == 0) {
                        System.out.println("Card not found");
                    } else {
                        cards.remove(commandArray[1]);
                        System.out.println("Card successfully removed");
                    }
                    break;


                case "Remove At":
                    if (Integer.parseInt(commandArray[1]) < 0 ||
                            Integer.parseInt(commandArray[1]) >= cards.size()) {
                        System.out.println("Index out of range");
                    } else {
                        cards.remove(Integer.parseInt(commandArray[1]));
                        System.out.println("Card successfully removed");
                    }
                    break;


                case "Insert":
                    int index = Integer.parseInt(commandArray[1]);
                    if (index < 0 || index >= cards.size()) {
                        System.out.println("Index out of range");
                    } else {
                        int counter3 = 0;
                        for (int k = 0; k < cards.size(); k++) {
                            if (commandArray[2].equals(cards.get(k))) {
                                counter3++;
                            }
                        }
                        if (counter3 == 0) {
                            cards.add(index, commandArray[2]);
                            System.out.println("Card successfully added");
                        } else {
                            System.out.println("Card is already added");
                        }

                    }
                    break;
            }
        }
        System.out.println(String.join(", ", cards));

    }
}
