package MoreExercises;

import java.util.Arrays;
import java.util.Scanner;

public class EncryptSortPrintArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String[] names = new String[n];
        int sum[] = new int[n];
        for (int i = 0; i < n; i++) {
            names[i] = scanner.nextLine();
            for (int j = 0; j < names[i].length(); j++) {
                char symbol = names[i].charAt(j);
                if (symbol == 65 || symbol == 69 ||symbol == 73
                        ||symbol == 79 ||symbol == 85 ||symbol == 97
                        ||symbol == 101 ||symbol == 105 ||symbol == 111 || symbol == 117 ){
                    sum[i] += symbol * names[i].length();
                } else {
                    sum [i] += symbol/names[i].length();
                }
            }

        }
        Arrays.sort(sum);
        for (int i = 0; i < sum.length; i++) {
            System.out.println(sum[i]);
        }
    }
}
