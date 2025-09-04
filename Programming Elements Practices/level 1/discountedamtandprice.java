import java.util.Scanner;

public class discountedamtandprice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Student fee:");
        double fee = input.nextDouble();
        System.out.print("Fee discount:");
        double discount = input.nextDouble();
        double discounted_amount = (discount * fee)/100;;
        System.out.println("The discount is:" +discounted_amount);
        double discounted_price = fee - discounted_amount;
        System.out.println("The price is:" +discounted_price);
    }
}
