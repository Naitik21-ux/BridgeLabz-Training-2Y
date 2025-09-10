import java.util.Scanner;

public class LargestDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        final int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        int temp = Math.abs(number); // Handle negative input

        // Extract digits into the array
        while (temp != 0) {
            if (index == maxDigit) {
                break;
            }
            digits[index] = temp % 10;
            temp /= 10;
            index++;
        }

        if (index == 0) { // For input 0
            digits[0] = 0;
            index = 1;
        }

        int largest = -1;
        int secondLargest = -1;

        // Find largest and second largest digit
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        System.out.println("Largest digit: " + largest);

        if (secondLargest == -1) {
            System.out.println("Second largest digit not found (all digits may be the same).");
        } else {
            System.out.println("Second largest digit: " + secondLargest);
        }
    }
}
