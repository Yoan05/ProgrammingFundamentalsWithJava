package Exercise;

import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] input = scanner.nextLine().toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char symbol : input) {
            sb.append(String.format("%c", symbol + 3));
            /* 2nd way :
             char c = (char) (symbol + 3);
             sb.append(c); */
        }
        System.out.println(sb);
    }
}
