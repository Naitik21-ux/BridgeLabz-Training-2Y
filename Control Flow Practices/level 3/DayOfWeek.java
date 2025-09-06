import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter month (1-12): ");
        int m = sc.nextInt();

        System.out.print("Enter day (1-31): ");
        int d = sc.nextInt();

        System.out.print("Enter year (e.g., 2025): ");
        int y = sc.nextInt();

        if (m < 3) {
            m += 12;
            y -= 1;
        }

        int k = y % 100;  // year of the century
        int j = y / 100;  // zero-based century

        int h = (d + (13 * (m + 1)) / 5 + k + (k / 4) + (j / 4) + 5 * j) % 7;

        int dayOfWeek = (h + 6) % 7;  // convert so that 0=Sunday, 1=Monday...

        System.out.println("Day of the week is: " + dayOfWeek);
    }
}
