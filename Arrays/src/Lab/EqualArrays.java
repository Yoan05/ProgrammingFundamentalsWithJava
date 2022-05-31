package Lab;

import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] firstNumbers = new int[]{1, 2, 3};
        int[] secondNumbers = new int[]{1, 2, 3};

        boolean arraysAreEqual;
        int sum = 0;
        int differenceIndex = -1;
        if (firstNumbers.length != secondNumbers.length){
            arraysAreEqual = false;
            differenceIndex = Math.min(firstNumbers.length, secondNumbers.length);
        } else {
            arraysAreEqual = true;
            for (int i = 0; i < firstNumbers.length; i++) {
                if (firstNumbers[i] != secondNumbers[i]){
                    arraysAreEqual = false;
                    differenceIndex = i;
                }
            }
        }
        if (arraysAreEqual){
            System.out.println(sum);
        } else {
            System.out.println(differenceIndex);
        }
        System.out.println(arraysAreEqual);
    }
}
