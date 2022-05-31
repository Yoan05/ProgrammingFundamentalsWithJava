package Lab;

import java.util.*;

public class HeroesOfCodeAndLogicVII {
    static class Hero{
        String name;
        int hitPoints;
        int manaPoints;

        public Hero(String name, int hitPoints, int manaPoints) {
            this.name = name;
            this.hitPoints = hitPoints;
            this.manaPoints = manaPoints;

        }
        public String getName(){
            return name;
        }
        public int getHitPoints(){
            return hitPoints;
        }
        public int getManaPoints(){
            return manaPoints;
        }
        public int setManaPoints(){
            return manaPoints;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String ,Hero> heroes = new LinkedHashMap<>();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            String[] heroParams = line.split(" ");
            Hero hero = new Hero(heroParams[0], Integer.parseInt(heroParams[1]), Integer.parseInt(heroParams[2]));
            heroes.put(hero.getName(), hero);
        }
        String command = scanner.nextLine();
        while (!command.equals("End")){
            String[] commandParts = command.split(" - ");

            String commandName = commandParts[0];
            switch (commandName){
                case"CastSpell":
                    handleCastSpell(heroes, commandParts[1], Integer.parseInt(commandParts[2]), commandParts[3]);
                    break;
                case"TakeDamage":
                    handleTakeDamage(heroes, commandParts[1], Integer.parseInt(commandParts[2]), commandParts[3]);
                    break;
                case"Recharge":
                    handleRecharge(heroes, commandParts[1], Integer.parseInt(commandParts[2]));
                    break;
                case"Heal":
                    handleHeal(heroes, commandParts[1], Integer.parseInt(commandParts[2]));
                    break;
                default:
                    throw new IllegalStateException("Unknown command " + commandName);

            }
            command = scanner.nextLine();
        }

        for (Hero hero : heroes.values()) {
            System.out.println(
                    hero.getName() + System.lineSeparator()
                    + "  HP:" + hero.getHitPoints() + System.lineSeparator()
                    + "  MP:" + hero.getManaPoints());
        }
    }

    private static void handleHeal(Map<String, Hero> heroes, String heroName, int parseInt) {

    }

    private static void handleRecharge(Map<String, Hero> heroes, String heroName, int parseInt) {

    }

    private static void handleTakeDamage(Map<String, Hero> heroes, String heroName, int parseInt, String parseInt1) {

    }

    private static void handleCastSpell(Map<String, Hero> heroes, String heroName, int mana, String spell) {
            Hero hero = heroes.get(heroName);

            if (hero.getManaPoints() >= mana){

            }
    }
}
