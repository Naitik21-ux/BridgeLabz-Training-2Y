import java.util.Scanner;

public class TriangleAreaCalculator {
    public static void main(String[] args) {
        double baseCm, heightCm;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the base of the triangle in centimeters: ");
        baseCm = input.nextDouble();

        System.out.print("Enter the height of the triangle in centimeters: ");
        heightCm = input.nextDouble();

        double areaCm = 0.5 * baseCm * heightCm;

        double areaInches = areaCm / (2.54 * 2.54);

        System.out.println("The Area of the triangle in sq in is " + areaInches + " and sq cm is " + areaCm);

        input.close();
    }
}
