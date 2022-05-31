package Exercise;

import java.util.Scanner;

public class WorldTour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder sb = new StringBuilder(scanner.nextLine());
        String line = scanner.nextLine();
        while (!line.equals("Travel")){
            String [] data = line.split(":");
            String command = data[0];
            switch (command){
                case "Add Stop":
                    int index = Integer.parseInt(data[1]);
                    String newStop = data[2];
                    sb.insert(index, newStop);
                    System.out.println(sb);
                    break;
                case "Remove Stop":
                    int start = Integer.parseInt(data[1]);
                    int end = Integer.parseInt(data[2]);
                    if (start >=0 && end >=0 && end <= sb.length()){
                    sb.delete(start, end + 1);
                    System.out.println(sb);
                    }
                    break;
                case "Switch":
                    String occurrence = data[1];
                    newStop = data[2];
                    String newThing = sb.toString().replaceAll(occurrence, newStop);
                    sb.setLength(0);
                    sb.append(newThing);
                    System.out.println(sb);
                    break;
            }

            line = scanner.nextLine();
        }

        System.out.println("Ready for world tour! Planned stops: " + sb);
    }
}
