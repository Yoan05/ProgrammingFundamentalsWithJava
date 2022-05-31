package Exercise;


import java.util.Scanner;

public class ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String[] firstArray = new String[n];
        String[] secondArray = new String[n];

        for (int i = 1; i <= n; i++) {
            String[] line = scanner.nextLine().split(" ");
            if (i % 2 != 0) {
                firstArray[i - 1] = line[0];
                secondArray[i - 1] = line[1];
            } else {
                firstArray[i - 1] = line[1];
                secondArray[i - 1] = line[0];
            }
        }
        System.out.println(String.join(" ", firstArray)); //.join само за String масиви!!    delimiter -> разделител
        System.out.println(String.join(" ", secondArray));
    }
}

