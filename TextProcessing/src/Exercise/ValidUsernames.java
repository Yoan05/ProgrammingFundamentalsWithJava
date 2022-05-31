package Exercise;

import java.util.Scanner;

public class ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] text = scanner.nextLine().split(", ");
        for (int i = 0; i < text.length; i++) {
            if (isValid(text[i]) && text[i].length() >=3){
                System.out.println(text[i]);
            }
        }
    }

    private static boolean isValid(String s) {
        String[] charsOfS = s.split("");
        for (int i = 0; i < charsOfS.length; i++) {
            char symbol = charsOfS[i].toLowerCase().charAt(0);
            if (!((symbol >= 97 && symbol <=122) || symbol==45 || (symbol >= 48 && symbol <= 57) || symbol ==95)){
                return false;
            }
        }
        return true;
    }
}
