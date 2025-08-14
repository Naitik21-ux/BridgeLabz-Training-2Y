import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner object for input

        System.out.print("Enter the radius of the cylinder: ");
        double radius = sc.nextDouble(); // Read radius

        System.out.print("Enter the height of the cylinder: ");
        double height = sc.nextDouble(); // Read height

        double volume = Math.PI * radius * radius * height; // Calculate volume

        System.out.println("Volume of the cylinder: " + volume);

        sc.close(); // Close scanner
    }
}
