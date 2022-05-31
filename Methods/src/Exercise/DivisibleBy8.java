package Exercise;

import java.util.Scanner;

public class DivisibleBy8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i < input; i++) {
            int n = 1;
            if (i >= 10000) {
                n = 5;
            } else if (i >= 1000) {
                n = 4;
            } else if (i >= 100) {
                n = 3;
            } else if (i >= 10) {
                n = 2;
            }

            int[] digits = new int[n];
            for (int j = n - 1; j >= 0; j--) {
                int h = i;
                digits[j] = h % 10;
                h/=10;
            }
            int sum = 0;
            for (int k = 0; k < n; k++) {
                sum += digits[k];
            }
            if (sum%8 ==0) {
                System.out.println(i);
            }
        }
    }
}
