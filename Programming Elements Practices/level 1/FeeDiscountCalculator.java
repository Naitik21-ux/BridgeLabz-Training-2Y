import java.util.Scanner;

public class FeeDiscountCalculator {
    public static void main(String[] args) {
        double fee, discountPercent;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the student fee: ");
        fee = input.nextDouble();

        System.out.print("Enter the university discount percentage: ");
        discountPercent = input.nextDouble();

        // Calculate discount amount
        double discount = (discountPercent / 100) * fee;

        // Calculate final fee after discount
        double finalFee = fee - discount;

        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);

        input.close();
    }
}
