package DataTypesAndVariables;

import java.util.Scanner;

public class BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double maxVolume = 0.0;
        String maxKegModel = "";
        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());;
            int height = Integer.parseInt(scanner.nextLine());
            double volume = Math.pow(radius, 2) * height * Math.PI;
            if (volume > maxVolume){
                maxVolume = volume;
                maxKegModel = name;
            }
        }
        System.out.println(maxKegModel);
    }
}
