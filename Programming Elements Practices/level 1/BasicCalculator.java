import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        double number1, number2;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        number1 = input.nextDouble();

        System.out.print("Enter the second number: ");
        number2 = input.nextDouble();

        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        double division = 0;

        if (number2 != 0) {
            division = number1 / number2;
        } else {
            System.out.println("Division by zero is not allowed.");
        }

        System.out.println("The addition, subtraction, multiplication and division value of 2 numbers " 
                           + number1 + " and " + number2 + " is " 
                           + addition + ", " + subtraction + ", " + multiplication + ", and " 
                           + (number2 != 0 ? division : "undefined (division by zero)"));

        input.close();
    }
}
