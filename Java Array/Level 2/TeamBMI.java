import java.util.Scanner;

public class TeamBMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();

        double[] weights = new double[n];
        double[] heights = new double[n]; // in centimeters
        double[] bmis = new double[n];
        String[] status = new String[n];

        // Take input for weights and heights
        for (int i = 0; i < n; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            weights[i] = sc.nextDouble();
            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            heights[i] = sc.nextDouble();
        }

        // Calculate BMI and assign status
        for (int i = 0; i < n; i++) {
            double heightMeters = heights[i] / 100.0;
            bmis[i] = weights[i] / (heightMeters * heightMeters);

            if (bmis[i] < 18.5) {
                status[i] = "Underweight";
            } else if (bmis[i] < 24.9) {
                status[i] = "Normal weight";
            } else if (bmis[i] < 29.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obesity";
            }
        }

        System.out.println("\nPerson\tHeight(cm)\tWeight(kg)\tBMI\t\tStatus");
        for (int i = 0; i < n; i++) {
            System.out.printf("%d\t%.2f\t\t%.2f\t\t%.2f\t%s\n",
                    (i + 1), heights[i], weights[i], bmis[i], status[i]);
        }
    }
}
