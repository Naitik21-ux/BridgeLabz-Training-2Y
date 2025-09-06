import java.util.Scanner;

public class SumNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n < 1) {
            System.out.println("The number " + n + " is not a natural number.");
        } else {
            int sumWhile = 0;
            int count = 1;
            while (count <= n) {
                sumWhile += count;
                count++;
            }

            int sumFormula = n * (n + 1) / 2;

            System.out.println("Sum using while loop: " + sumWhile);
            System.out.println("Sum using formula: " + sumFormula);

            if (sumWhile == sumFormula) {
                System.out.println("Both methods give the same result. The result is correct.");
            } else {
                System.out.println("There is a discrepancy between the two methods.");
            }
        }
    }
}
