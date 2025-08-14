import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = sc.nextDouble(); // Read radius from user

        double area = Math.PI * radius * radius; // Calculate area

        System.out.println("Area of the circle: " + area);

        sc.close(); // Close the scanner
    }
}
