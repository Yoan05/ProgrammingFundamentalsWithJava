import java.util.Scanner;

public class ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = nextIntArray(scanner, " ");
        String command = scanner.nextLine();
        while (!command.equals("end")) {
            if (command.equals("decrease")){
                for (int i = 0; i < numbers.length; i++) {
                    numbers[i] -=1;
                }
            }
            int emptyInt = 0;
            if (command.contains("swap")) {
                String[] commandArr = command.split(" ");
                int index1 = Integer.parseInt(commandArr[1]);
                int index2 = Integer.parseInt(commandArr[2]);
                emptyInt = numbers[index1];
                numbers[index1] = numbers[index2];
                numbers[index2] = emptyInt;
            }
            if (command.contains("multiply")){
                String[] commandArr = command.split(" ");
                int index1 = Integer.parseInt(commandArr[1]);
                int index2 = Integer.parseInt(commandArr[2]);
                int sum = numbers[index1] * numbers[index2];
                numbers[index1] = sum;
            }

            command = scanner.nextLine();
        }
        printArray(numbers);
    }

    private static int[] nextIntArray(Scanner scanner, String separator) {
        String[] intsAsStrings = scanner.nextLine().split(separator);
        int[] array = new int[intsAsStrings.length];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(intsAsStrings[i]);
        }
        return array;
    }
    private static void printArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i < numbers.length - 1){
                System.out.print(", ");
            }

        }
        System.out.println();
    }

}
