import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner object to take input

        System.out.print("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble(); // Read Celsius value from the user

        double fahrenheit = (celsius * 9 / 5) + 32; // Convert Celsius to Fahrenheit

        System.out.println("Temperature in Fahrenheit: " + fahrenheit);

        sc.close(); // Close the scanner
    }
}
