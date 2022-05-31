package Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class KaminoFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String[] dna = new String[n];
        //1!0!1!1!0
        int currentPosition = 0;
        int bestPosition = 0;

        int maxSum = 0;
        int currentSumElements = 0;

        int maxLength = 0;
        int currentLength = 0;

        int dnaNumber = 0;
        int bestDnaNumber = 0;
        String[] result = new String[n];
        String bestLocalDna = "";

        String line = scanner.nextLine();
        while (line.equals("Clone them!")) {
            dnaNumber++;
            //1!0!1!1!0
            String data = line.replaceAll("!", "");
            //10110
            dna = data.split("0");
            //[1,11]

            for (int i = 0; i < dna.length; i++) {
                if (dna[i].length() > currentLength) {
                    currentLength = dna[i].length();
                    bestLocalDna = dna[i];
                }
            }
            currentPosition = data.indexOf(bestLocalDna);

            if (currentLength > maxLength) {
                maxLength = currentLength;
                maxSum = currentSumElements;
                bestPosition = currentPosition;
                bestDnaNumber = dnaNumber;
                result = data.split("");
            } else if (currentLength == maxLength && (bestPosition > currentPosition || currentSumElements > maxSum)) {
                maxLength = currentLength;
                maxSum = currentSumElements;
                bestPosition = currentPosition;
                bestDnaNumber = dnaNumber;
                result = data.split("");
            }

            line = scanner.nextLine();
        }
        

    }
}
