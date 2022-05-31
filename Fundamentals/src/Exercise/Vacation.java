package Exercise;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int groupNumber = Integer.parseInt(scanner.nextLine());
        String typeOfGroup = scanner.nextLine();
        String dayOfWeek = scanner.nextLine();
        double price = 0.0;
        double totalPrice = 0.0;
        //	        Friday	Saturday	Sunday
        //Students	8.45	9.80	    10.46
        //Business	10.90	15.60	    16
        //Regular	15	    20	        22.50

        switch (typeOfGroup){
            case "Students":
                if (dayOfWeek.equals("Friday")){
                    price = 8.45;
                } else if (dayOfWeek.equals("Saturday")){
                    price = 9.80;
                } else if (dayOfWeek.equals("Sunday")){
                    price = 10.46;
                }
                totalPrice = groupNumber * price;
                if (groupNumber >= 30){
                    totalPrice = 0.85 * totalPrice;
                }
                break;
            case "Business":
                if (dayOfWeek.equals("Friday")){
                    price = 10.90;
                } else if (dayOfWeek.equals("Saturday")){
                    price = 15.60;
                } else if (dayOfWeek.equals("Sunday")){
                    price = 16.00;
                }
                if (groupNumber >= 100){
                    groupNumber -= 10;
                }
                totalPrice = groupNumber * price;
                break;
            case "Regular":
                if (dayOfWeek.equals("Friday")){
                    price = 15.00;
                } else if (dayOfWeek.equals("Saturday")){
                    price = 20.00;
                } else if (dayOfWeek.equals("Sunday")){
                    price = 22.50;
                }
                totalPrice = groupNumber * price;
                if (groupNumber >= 10 && groupNumber <=20){
                    totalPrice = 0.95 * totalPrice;
                }
                break;
        }
        System.out.printf("Total price: %.2f", totalPrice);
    }
}
