import java.util.Scanner;

public class TeamBMIMultiArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();

        double[][] personData = new double[n][3];
        String[] weightStatus = new String[n];

        for (int i = 0; i < n; i++) {
            double weight, height;
            do {
                System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
                weight = sc.nextDouble();
                if (weight <= 0) System.out.println("Please enter a positive value!");
            } while (weight <= 0);

            do {
                System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
                height = sc.nextDouble();
                if (height <= 0) System.out.println("Please enter a positive value!");
            } while (height <= 0);

            personData[i][0] = weight;
            personData[i][1] = height;
        }

        for (int i = 0; i < n; i++) {
            double weight = personData[i][0];
            double heightMeters = personData[i][1] / 100.0;
            double bmi = weight / (heightMeters * heightMeters);

            personData[i][2] = bmi;

            if (bmi < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (bmi < 24.9) {
                weightStatus[i] = "Normal weight";
            } else if (bmi < 29.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obesity";
            }
        }

        System.out.println("\nPerson\tHeight(cm)\tWeight(kg)\tBMI\t\tStatus");
        for (int i = 0; i < n; i++) {
            System.out.printf("%d\t%.2f\t\t%.2f\t\t%.2f\t%s\n",
                (i + 1), personData[i][1], personData[i][0], personData[i][2], weightStatus[i]);
        }
    }
}
