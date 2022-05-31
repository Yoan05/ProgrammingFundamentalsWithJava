package Exercise;

import java.util.Scanner;

public class FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());

        double result = factorial(n1) * 1.0 / factorial(n2);
        System.out.printf("%.2f", result);
    }

    private static long factorial(int n1) {
        long sum = 1;
        for (long i = n1; i >= 1; i--) {
            sum *= i;
        }
        return sum;
    }
}
