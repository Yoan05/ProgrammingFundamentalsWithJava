package MidExam;

import java.util.Scanner;

public class Task2TaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] cars = scanner.nextLine().split(">>");
        double total = 0.0;
        for (int i = 0; i < cars.length; i++) {
            String[] vehicle = cars[i].split(" ");
            int years = Integer.parseInt(vehicle[1]);
            int km = Integer.parseInt(vehicle[2]);
            int tax = 0;
            int yearDecline = 0;
            double kmIncrease = 0;
            double taxModified = tax + kmIncrease - yearDecline;
            switch(vehicle[0]){
                case "family":
                    tax = 50;
                    yearDecline = years*5;
                    kmIncrease = Math.floor(km/3000) * 12;
                    taxModified = tax + kmIncrease - yearDecline;
                    System.out.printf("A family car will pay %.2f euros in taxes.%n", taxModified);
                    total += taxModified;
                    break;
                case "heavyDuty":
                    tax = 80;
                    yearDecline = years*8;
                    kmIncrease = Math.floor(km/9000) * 14;
                    taxModified = tax + kmIncrease - yearDecline;
                    System.out.printf("A heavyDuty car will pay %.2f euros in taxes.%n", tax + kmIncrease - yearDecline);
                    total += taxModified;
                    break;
                case "sports":
                    tax = 100;
                    yearDecline = years*9;
                    kmIncrease = Math.floor(km/2000) * 18;
                    taxModified = tax + kmIncrease - yearDecline;
                    System.out.printf("A sports car will pay %.2f euros in taxes.%n", tax + kmIncrease - yearDecline);
                    total += taxModified;
                    break;
                default:
                    System.out.println("Invalid car type.");
                    break;
            }
        }
        System.out.printf("The National Revenue Agency will collect %.2f euros in taxes.", total);
    }
}
