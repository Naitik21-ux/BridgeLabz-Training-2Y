import java.util.Scanner;

public class MeanHeightFootballTeam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] heights = new double[11];
        double sum = 0.0;

        // Input heights for 11 players
        for (int i = 0; i < heights.length; i++) {
            System.out.print("Enter height of player " + (i + 1) + " in cm: ");
            heights[i] = sc.nextDouble();
            sum += heights[i];
        }

        // Calculate mean height
        double mean = sum / heights.length;

        System.out.printf("Mean height of the football team is: %.2f cm\n", mean);
    }
}
