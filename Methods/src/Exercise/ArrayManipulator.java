package Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayManipulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        String line = scanner.nextLine();
        while (!line.equals("end")) {
            String[] data = line.split(" ");
            String command = data[0];

            switch (command) {
                case "exchange":
                    int index = Integer.parseInt(data[1]);
                    if (isValidIndex(index, arr.length)) {
                        exchange(arr, index);
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "max":
                    if (data[1].equals("even")) {
                        printEvenMax(arr);
                    } else {
                        printOddMax(arr);
                    }
                    break;
                case "min":
                    if (data[1].equals("even")) {

                    } else {

                    }
                    break;
                case "first":
                    int count = Integer.parseInt(data[1]);
                    if (count > arr.length) {
                        System.out.println("Invalid count");
                    } else {

                        if (data[2].equals("even")) {
                            printFirstEven(arr, count);
                        } else {
                            printFirstOdd(arr, count);
                        }
                    }
                    break;
                case "last":
                    count = Integer.parseInt(data[1]);
                    if (count > arr.length) {
                        System.out.println("Invalid count");
                    } else {

                        if (data[2].equals("even")) {
                            printLastEven(arr, count);
                        } else {
                            printLastOdd(arr, count);
                        }
                    }
            }
            line = scanner.nextLine();
        }
        System.out.println(Arrays.toString(arr));
    }

    public static boolean isValidIndex(int index, int length) {
        return index >= 0 && index < length;
    }

    public static void exchange(int[] array, int index) {
        int[] first = new int[index + 1];
        int[] second = new int[array.length - index - 1];
        for (int i = 0; i <= index; i++) {
            first[i] = array[i];
        }
        for (int i = 0; i < second.length; i++) {
            second[i] = array[index + 1];
        }
        for (int i = 0; i < array.length; i++) {
            //start filling from second array
            if (i < second.length) {
                array[i] = second[i];
            } else {
                //continue with second array
                array[i] = first[i - second.length];
            }
        }
    }

    public static void printEvenMax(int[] array) {
        int maxNumber = 0;
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                maxNumber = Math.max(maxNumber, array[i]);
                index = i;
            }
        }
        if (index == -1) {
            System.out.println("No matches");
        } else {

        }
        System.out.println(index);
    }

    public static void printOddMax(int[] array) {
        int maxNumber = 0;
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                maxNumber = Math.max(maxNumber, array[i]);
                index = i;
            }
        }
        if (index == -1) {
            System.out.println("No matches");
        } else {

        }
        System.out.println(index);
    }

    public static void printFirstEven(int[] array, int count) {
        int[] bufferArr = new int[count];
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0 && count > 0) {
                bufferArr[i] = array[i];
                count--;
            } else {
                bufferArr[i] = -1;
            }
        }
        System.out.println(Arrays.toString(bufferArr));
    }

    public static void printFirstOdd(int[] array, int count) {
        int[] arr = new int[count];
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0 && count > 0) {
                arr[i] = array[i];
                count--;
            } else {
                arr[i] = -1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void printLastEven(int[] array, int count) {
        int[] bufferArr = new int[array.length];
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] % 2 == 0 && count > 0){
                bufferArr[i] = array[i];
                count--;
            } else {
                bufferArr[i] = -1;
            }
        }
        System.out.println(Arrays.toString(bufferArr));
    }
    public static void printLastOdd(int[] array, int count) {
        int[] bufferArr = new int[count];
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] % 2 != 0 && count > 0) {
                bufferArr[i] = array[i];
                count--;
            } else {
                bufferArr[i] = -1;
            }
        }
        System.out.println(Arrays.toString(bufferArr));
    }
}
