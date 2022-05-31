package Exercise;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        double budget = 0.0;
        double priceProducts = 0.0;

        while (!text.equals("Start")) {
            double money = Double.parseDouble(text);

            if (money == 0.1 || money == 0.2 || money == 0.5 || money == 1 || money == 2) {
                budget += money;
            } else {
                System.out.printf("Cannot accept %.2f", money);
                System.out.println();
            }
            text = scanner.nextLine();
        }
        String text2 = scanner.nextLine();

        while (!text2.equals("End")) {
            String product = text2;
            switch (product) {
                case "Nuts":
                    priceProducts = 2.0;
                    if (budget < priceProducts) {
                        System.out.printf("Sorry, not enough money%n");
                    } else {
                        System.out.printf("Purchased %s%n", product);
                        budget -= priceProducts;
                    }
                    break;
                case "Water":
                    priceProducts = 0.7;
                    if (budget < priceProducts) {
                        System.out.printf("Sorry, not enough money%n");
                    } else {
                        System.out.printf("Purchased %s%n", product);
                        budget -= priceProducts;
                    }
                    break;
                case "Crisps":
                    priceProducts = 1.5;
                    if (budget < priceProducts) {
                        System.out.printf("Sorry, not enough money%n");
                    } else {
                        System.out.printf("Purchased %s%n", product);
                        budget -= priceProducts;
                    }
                    break;
                case "Soda":
                    priceProducts = 0.8;
                    if (budget < priceProducts) {
                        System.out.printf("Sorry, not enough money%n");
                    } else {
                        System.out.printf("Purchased %s%n", product);
                        budget -= priceProducts;
                    }
                    break;
                case "Coke":
                    priceProducts = 1.0;
                    if (budget < priceProducts) {
                        System.out.printf("Sorry, not enough money%n");
                    } else {
                        System.out.printf("Purchased %s%n", product);
                        budget -= priceProducts;
                    }
                    break;
                default:
                    System.out.printf("Invalid product%n");
                    break;
            }
            text2 = scanner.nextLine();
        }
                    System.out.printf("Change: %.2f", budget);
    }
}