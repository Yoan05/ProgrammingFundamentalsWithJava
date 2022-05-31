package Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class NeedForSpeed3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Car> cars = new LinkedHashMap<>();
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] carInfo = scanner.nextLine().split("\\|");
            Car car = new Car(carInfo[0], Integer.parseInt(carInfo[1]), Integer.parseInt(carInfo[2]));
            cars.put(carInfo[0], car);
        }
        String line = scanner.nextLine();
        while (!line.equals("Stop")) {
            String[] data = line.split(" : ");
            String command = data[0];
            switch (command) {
                case "Drive":
                    if (cars.get(data[1]).fuel < Integer.parseInt(data[3])){
                        System.out.println("Not enough fuel to make that ride");
                    } else {
                        cars.get(data[1]).mileage += Integer.parseInt(data[2]);
                        cars.get(data[1]).fuel -= Integer.parseInt(data[3]);
                        System.out.printf("%s driven for %s kilometers. %s liters of fuel consumed.", data[1], data[2], data[3]);
                        if (cars.get(data[1]).mileage >= 100000){
                            System.out.printf("Time to sell the %s!", data[1]);
                        }
                    }
                    break;
                case "Refuel":
                    int givenFuel = Integer.parseInt(data[2]);
                    if(cars.get(data[1]).fuel + givenFuel > 75){
                        cars.get(data[1]).fuel = 75;
                    } else {
                        cars.get(data[1]).fuel += givenFuel;
                        System.out.printf("%s refueled with %s liters", data[1], data[2]);
                    }
                    break;
                case "Revert":

                    break;
            }
            line = scanner.nextLine();
        }
    }

    static class Car {
        String model;
        int mileage;
        int fuel;

        public Car(String model, int mileage, int fuel) {
            this.model = model;
            this.mileage = mileage;
            this.fuel = fuel;
        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public int getMileage() {
            return mileage;
        }

        public void setMileage(int mileage) {
            this.mileage = mileage;
        }

        public int getFuel() {
            return fuel;
        }

        public void setFuel(int fuel) {
            this.fuel = fuel;
        }
    }
}
