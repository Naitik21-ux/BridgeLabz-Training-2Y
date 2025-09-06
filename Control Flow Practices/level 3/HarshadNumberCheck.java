import java.util.Scanner;

public class HarshadNumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        int sum = 0;
        int temp = Math.abs(number); 
        while (temp != 0) {
            int digit = temp % 10;
            sum += digit;
            temp /= 10;
        }

        if (sum != 0 && number % sum == 0) {
            System.out.println(number + " is a Harshad Number.");
        } else {
            System.out.println(number + " is NOT a Harshad Number.");
        }
    }
}
