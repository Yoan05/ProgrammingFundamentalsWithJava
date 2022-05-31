import java.util.Scanner;

public class SoftUniReception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int emp1eff = Integer.parseInt(scanner.nextLine());
        int emp2eff = Integer.parseInt(scanner.nextLine());
        int emp3eff = Integer.parseInt(scanner.nextLine());
        int studentsNum = Integer.parseInt(scanner.nextLine());

        int allEff = emp1eff + emp2eff + emp3eff;
        int counter = 0;

        while(studentsNum > 0){
            counter++;
            if (counter%4 != 0){
                studentsNum -= allEff;
            }
        }
        System.out.printf("Time needed: %dh.", counter);
    }

}
