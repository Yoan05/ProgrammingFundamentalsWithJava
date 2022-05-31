package Exercise;

import java.util.*;

public class PlantDiscovery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        //TODO: class Plant -> only name and rarity;
        // map<Plant, Double>, this int will be the rating(0.00 by default);
        // Start over?


        int n = Integer.parseInt(scanner.nextLine());
        Map<String, String> plants = new LinkedHashMap<>();
        List<Plant> listOfPlants = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            String[] plantData = scanner.nextLine().split("<->");
            plants.put(plantData[0], plantData[1]);
        }
        String line = scanner.nextLine();
        while (!line.equals("Exhibition")){
            String[] data = line.split(": ");
            switch(data[0]){
                case "Rate":
                    String[] subData = data[1].split(" - ");
                    int rating = Integer.parseInt(subData[1]);
                    if (plants.containsKey(data[0])){
                    Plant plant = new Plant(data[0], plants.get(data[0]), rating);
                    listOfPlants.add(plant);
                    }

                    break;
                case"Update":
                    subData = data[1].split(" - ");
                    String newRarity = subData[1];
                    if (plants.containsKey(subData[0])){
                        plants.replace(subData[0], newRarity);
                    }
                    break;
                case"Reset":
                    if (plants.containsKey(data[1])){

                    }
                    break;
            }
            line = scanner.nextLine();
        }
        System.out.println("Plants for the exhibition:");
    }
    static class Plant{
       String name;
       String rarity;
       int rating;

        public Plant(String name, String rarity, int rating) {
            this.name = name;
            this.rarity = rarity;
            this.rating = rating;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getRarity() {
            return rarity;
        }

        public void setRarity(String rarity) {
            this.rarity = rarity;
        }

        public int getRating() {
            return rating;
        }

        public void setRating(int rating) {
            this.rating = rating;
        }
    }
}
