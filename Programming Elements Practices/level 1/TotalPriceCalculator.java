import java.util.Scanner;

public class TotalPriceCalculator {
    public static void main(String[] args) {
        double unitPrice;
        int quantity;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the unit price of the item (INR): ");
        unitPrice = input.nextDouble();

        System.out.print("Enter the quantity to be bought: ");
        quantity = input.nextInt();

        double totalPrice = unitPrice * quantity;

        System.out.println("The total purchase price is INR " + totalPrice + " if the quantity " + quantity + " and unit price is INR " + unitPrice);

        input.close();
    }
}
