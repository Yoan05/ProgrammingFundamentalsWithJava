import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = nextIntArray(scanner, " ");
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        double averageNumber = (sum * 1.0) / numbers.length;


        List<Integer> topNumbers = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > averageNumber) {
                topNumbers.add(numbers[i]);
            }
        }
        if (topNumbers.size() == 0) {
            System.out.println("No");
        } else {
            Collections.sort(topNumbers, Collections.reverseOrder());

            if (topNumbers.size() < 2) {
                for (int i = 0; i < 1; i++) {
                    System.out.print(topNumbers.get(i) + " ");
                }
            } else if (topNumbers.size() < 3) {
                    for (int i = 0; i < 2; i++) {
                        System.out.print(topNumbers.get(i) + " ");
                    }
                } else if (topNumbers.size() < 4) {
                    for (int i = 0; i < 3; i++) {
                        System.out.print(topNumbers.get(i) + " ");
                    }
                } else {
                    for (int i = 0; i < 5; i++) {
                        System.out.print(topNumbers.get(i) + " ");
                    }
                }
            }
        }


        private static int[] nextIntArray (Scanner scanner,String separator){
            String[] intsAsStrings = scanner.nextLine().split(separator);
            int[] array = new int[intsAsStrings.length];
            for (int i = 0; i < array.length; i++) {
                array[i] = Integer.parseInt(intsAsStrings[i]);
            }
            return array;
        }
    }

