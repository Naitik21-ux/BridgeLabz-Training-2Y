import java.util.Scanner;

public class TriangleAreaCalculator {
    public static void main(String[] args) {
        double baseInches, heightInches;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the base of the triangle in inches: ");
        baseInches = input.nextDouble();

        System.out.print("Enter the height of the triangle in inches: ");
        heightInches = input.nextDouble();

        double areaInches = 0.5 * baseInches * heightInches;

        double areaCm = areaInches * 2.54 * 2.54;

        System.out.println("The area of the triangle is " + areaInches + " square inches and " + areaCm + " square centimeters.");

        input.close();
    }
}
