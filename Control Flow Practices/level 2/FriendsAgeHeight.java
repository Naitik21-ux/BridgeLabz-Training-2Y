import java.util.Scanner;

public class FriendsAgeHeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Amar's age: ");
        int ageAmar = sc.nextInt();
        System.out.print("Enter Amar's height: ");
        double heightAmar = sc.nextDouble();

        System.out.print("Enter Akbar's age: ");
        int ageAkbar = sc.nextInt();
        System.out.print("Enter Akbar's height: ");
        double heightAkbar = sc.nextDouble();

        System.out.print("Enter Anthony's age: ");
        int ageAnthony = sc.nextInt();
        System.out.print("Enter Anthony's height: ");
        double heightAnthony = sc.nextDouble();

        String youngest;
        int youngestAge = ageAmar;
        youngest = "Amar";
        if (ageAkbar < youngestAge) {
            youngestAge = ageAkbar;
            youngest = "Akbar";
        }
        if (ageAnthony < youngestAge) {
            youngestAge = ageAnthony;
            youngest = "Anthony";
        }

        String tallest;
        double tallestHeight = heightAmar;
        tallest = "Amar";
        if (heightAkbar > tallestHeight) {
            tallestHeight = heightAkbar;
            tallest = "Akbar";
        }
        if (heightAnthony > tallestHeight) {
            tallestHeight = heightAnthony;
            tallest = "Anthony";
        }

        System.out.println("The youngest friend is " + youngest + " with age " + youngestAge);
        System.out.println("The tallest friend is " + tallest + " with height " + tallestHeight);
    }
}
