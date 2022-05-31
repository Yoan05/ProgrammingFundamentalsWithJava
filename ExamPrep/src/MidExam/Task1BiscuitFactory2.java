package MidExam;

import java.util.Scanner;

public class Task1BiscuitFactory2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int productionPerWorker = Integer.parseInt(scanner.nextLine());
        int workers = Integer.parseInt(scanner.nextLine());
        int otherFactory = Integer.parseInt(scanner.nextLine());
        double productionPerDay = productionPerWorker * workers * 1.0;
        double total = 0.0;
        for (int i = 1; i <= 30; i++) {
            if (i%3 == 0){
                total += Math.floor(productionPerDay * 0.75);
            } else {
                total += productionPerDay;
            }
        }
        System.out.printf("You have produced %.0f biscuits for the past month.%n", total);
        if (total > otherFactory){
            double diff = total - otherFactory;
            double percentage = (diff/otherFactory) * 100.0;
            System.out.printf("You produce %.2f percent more biscuits.", percentage);
        } else {
            double diff1 = otherFactory - total;
            double percentage1 = (diff1/otherFactory) * 100.0;
            System.out.printf("You produce %.2f percent less biscuits.", percentage1);
        }
    }
}
