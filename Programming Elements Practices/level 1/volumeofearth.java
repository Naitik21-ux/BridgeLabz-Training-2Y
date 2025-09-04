import java.util.Scanner;

public class volumeofearth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter radius of Earth:");
        double radius = input.nextDouble();
        double volume = 1.3333*3.14*radius*radius*radius;
        System.out.println("The volume is:" +volume);
        double miles = volume*0.621371192;
        System.out.println("The miles is:" +miles);
    }
}
