package Lab;

import java.util.Scanner;

public class CondenseArrayToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[]{5, 0, 4, 1, 2};
        int numRepetitions = numbers.length - 1;
         while (numbers.length > 1){
            int[] condensed = new int[numbers.length - 1];
            for (int i = 0; i < numbers.length - 1; i++) {
                condensed[i] = numbers[i] + numbers[i + 1];
            }
            numbers = condensed;
        }
        System.out.println(numbers[0]);
    }
}

