import java.util.Scanner;

class DimensionalBmi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for the number of persons
        System.out.print("Enter the number of persons: ");
        int n = sc.nextInt();

        // Creating a 2D array to store weight, height, and BMI
        double[][] personData = new double[n][3];
        String[] status = new String[n]; // Array to store weight status

        // Taking input for weight and height
        for (int i = 0; i < n; i++) {
            System.out.print("Enter weight of person " + (i + 1) + ": ");
            personData[i][0] = sc.nextDouble();
            if (personData[i][0] <= 0) { // Check if weight is invalid
                System.out.print("Enter a positive weight for person " + (i + 1) + ": ");
                personData[i][0] = sc.nextDouble();
            }

            System.out.print("Enter height of person " + (i + 1) + ": ");
            personData[i][1] = sc.nextDouble();
            if (personData[i][1] <= 0) { // Check if height is invalid
                System.out.print("Invalid height! Enter a positive height for person " + (i + 1) + ": ");
                personData[i][1] = sc.nextDouble();
            }

            // Calculating BMI
            personData[i][2] = personData[i][0] / (personData[i][1] * personData[i][1]);

            // Determining weight status
            if (personData[i][2] <= 18.4) {
                status[i] = "Underweight";
            }
	    else if (personData[i][2] >= 18.5 && personData[i][2] <= 24.9) {
                status[i] = "Normal";
            }
	    else if (personData[i][2] >= 25.0 && personData[i][2] <= 39.9) {
                status[i] = "Overweight";
            }
	    else {
                status[i] = "Obese";
            }
        }

        // Displaying results
        System.out.print("BMI Results: ");
        for (int i = 0; i < n; i++) {
            System.out.print("\nPerson " + (i + 1) + ": ");
            System.out.print("Weight: " + personData[i][0] + " ");
            System.out.print("Height: " + personData[i][1] + " ");
            System.out.println("BMI: " + personData[i][2] + " ");
            System.out.println("Status: " + status[i] + " ");
        }
    }
}
