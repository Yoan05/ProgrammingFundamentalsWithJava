import java.util.Scanner;

public class ComputerStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        double priceWithoutTaxes = 0.0;
        double taxes = 0.0;
        double totalPrice = 0.0;

        while (!line.equals("special") && !line.equals("regular")) {
            double priceOfProduct = Double.parseDouble(line);
            priceWithoutTaxes += priceOfProduct;
            taxes += 0.2 * priceOfProduct;
            if (priceOfProduct<=0){
                System.out.println("Invalid price!");
                priceWithoutTaxes-= priceOfProduct;
                taxes -= 0.2*priceOfProduct;
            }
            line = scanner.nextLine();
        }
        totalPrice += priceWithoutTaxes + taxes;
        if (line.equals("special")){
            totalPrice *=0.9;
        }
        if (totalPrice==0){
            if (totalPrice==0){
                System.out.println("Invalid order!");
            }
        } else {
        System.out.println("Congratulations you've just bought a new computer!");
        System.out.printf("Price without taxes: %.2f$%n", priceWithoutTaxes);
        System.out.printf("Taxes: %.2f$%n", taxes);
        System.out.println("-----------");
        System.out.printf("Total price: %.2f$", totalPrice);
        }
    }
}
