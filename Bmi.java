import java.util.Scanner;

class Bmi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for the number of persons
        System.out.print("Enter the number of persons: ");
        int n = sc.nextInt();

        // Creating arrays to store height, weight, BMI, and status
        double[] weight = new double[n];
        double[] height = new double[n];
        double[] bmi = new double[n];
        String[] status = new String[n];

        // Taking input for height and weight
        for (int i = 0; i < n; i++) {
            System.out.print("Enter weight (kg) of person " + (i + 1) + ": ");
            weight[i] = sc.nextDouble();
            System.out.print("Enter height (m) of person " + (i + 1) + ": ");
            height[i] = sc.nextDouble();

            // Calculating BMI
            bmi[i] = weight[i] / (height[i] * height[i]);

            // Determining weight status
            if (bmi[i] <= 18.4) {
                status[i] = "Underweight";
            } else if (bmi[i] >= 18.5 && bmi[i] <= 24.9) {
                status[i] = "Normal";
            } else if (bmi[i] >= 25.0 && bmi[i] <= 39.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }

        // Displaying results
        System.out.println("BMI Results: ");

        for (int i = 0; i < n; i++) {
            System.out.print("\nPerson " + (i + 1) + ": ");
            System.out.print("Weight: " + weight[i] + " ");
            System.out.print("Height: " + height[i] + " ");
            System.out.print("BMI: " + bmi[i] + " ");
            System.out.print("Status: " + status[i] + " ");
        }
    }
}
