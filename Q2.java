import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // create Scanner object to take input

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt(); // read first number

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt(); // read second number

        int sum = num1 + num2; // calculate sum

        System.out.println("The sum is: " + sum); // print sum

        sc.close(); // close the scanner
    }
}
