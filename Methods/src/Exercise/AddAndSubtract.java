package Exercise;

import java.util.Scanner;

public class AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        int n3 = Integer.parseInt(scanner.nextLine());



        int result = sum(n1, n2);

        subtract(sum(n1,n2), n3);
    }

    private static int sum(int n1, int n2){
        int sum1 = n1 + n2;
        return sum1;
    }

    private static void subtract(int n1, int n2){
        int result = n1 - n2;
        System.out.println(result);
    }
}
