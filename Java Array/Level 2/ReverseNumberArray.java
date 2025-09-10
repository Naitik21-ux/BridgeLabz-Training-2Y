import java.util.Scanner;

public class ReverseNumberArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int temp = Math.abs(number);  
        int count = (temp == 0) ? 1 : 0;
        int t = temp;
        while (t != 0) {
            count++;
            t /= 10;
        }

        int[] digits = new int[count];
        t = temp;
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = t % 10;
            t /= 10;
        }

        int[] reversedDigits = new int[count];
        for (int i = 0; i < count; i++) {
            reversedDigits[i] = digits[count - 1 - i];
        }

        System.out.print("Reversed number: ");
        for (int i = 0; i < count; i++) {
            System.out.print(reversedDigits[i]);
        }
        System.out.println();
    }
}
