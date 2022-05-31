import java.util.Scanner;

public class TimePlus30Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = scanner.nextInt();
        int minutes = scanner.nextInt();

        //calc 30m later
        minutes += 30;
        if (minutes >59){
            hours++;
            minutes -= 60;
        }
        if (hours>23){
            hours-=24;
        }
        if (minutes <10){
            System.out.printf("%d:%02d", hours, minutes);
        } else{
        System.out.printf("%d:%d", hours, minutes);}

    }
}
