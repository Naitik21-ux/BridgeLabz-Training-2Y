import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner object for input

        System.out.print("Enter Principal amount: ");
        double principal = sc.nextDouble(); // Read principal

        System.out.print("Enter Rate of interest: ");
        double rate = sc.nextDouble(); // Read rate

        System.out.print("Enter Time (in years): ");
        double time = sc.nextDouble(); // Read time

        // Calculate Simple Interest
        double simpleInterest = (principal * rate * time) / 100;

        System.out.println("Simple Interest: " + simpleInterest);

        sc.close(); // Close scanner
    }
}
