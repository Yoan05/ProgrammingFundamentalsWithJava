import java.util.Scanner;

public class TheLift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int allPeople = Integer.parseInt(scanner.nextLine());
        int[] liftWagons = nextIntArray(scanner, " ");
        int maxCapacity = 4;
        for (int i = 0; i < liftWagons.length; i++) {
            int n = 4 - liftWagons[i];
            liftWagons[i] += n;
            if (allPeople - 4 < 0) {
                liftWagons[i] = allPeople;
                break;
            }
            allPeople -= n;


        }
            if (liftWagons[liftWagons.length - 1] < 4) {
                System.out.println("The lift has empty spots!");
            } else {
                System.out.printf("There isn't enough space! %s people in a queue!%n", allPeople);
            }
        printArray(liftWagons);

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
                System.out.print(" ");
            }

        }
        System.out.println();
    }
}
