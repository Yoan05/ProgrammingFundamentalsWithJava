package MidExam;

import java.util.Scanner;

public class Task1BiscuitFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int productionPerDay = Integer.parseInt(scanner.nextLine());
        int workers = Integer.parseInt(scanner.nextLine());
        int otherFactory = Integer.parseInt(scanner.nextLine());

        double normalProduction = productionPerDay * workers * 20 * 1.0;
        double lessProduction = Math.floor(productionPerDay * 0.75) * workers * 10;
        double total = normalProduction + lessProduction;

        System.out.printf("You have produced %.0f biscuits for the past month.%n", total);
        if (total > otherFactory) {

            double diff = total - otherFactory;
            double percentage = (diff / otherFactory) * 100;
            System.out.printf("You produce %.2f percent more biscuits.", percentage);

        } else {

            double diff = otherFactory - total;
            double percentage = (diff / otherFactory) * 100;
            System.out.printf("You produce %.2f percent less biscuits.", percentage);

        }

    }
}
