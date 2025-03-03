import java.util.Scanner;

public class Bonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int employees = 10;
        double[] salary = new double[employees];
        double[] yearsOfService = new double[employees];
        double[] newSalary = new double[employees];
        double[] bonus = new double[employees];

        double totalBonus = 0, totalOldSalary = 0, totalNewSalary = 0;

        // Input loop for salaries and years of service
        for (int i = 0; i < employees; i++) {
            System.out.println("Enter details for Employee " + (i + 1) + ":");

            // Using a for loop to validate salary input
            for (int attempt = 0; attempt < 1; attempt++) {
                System.out.print("Enter salary: ");
                salary[i] = sc.nextDouble();
                if (salary[i] <= 0) {
                    System.out.println("Invalid salary! Please enter a positive value.");
                    i--; // Decrement index to re-enter for the same employee
                    break;
                }
            }
            for (int attempt = 0; attempt < 1; attempt++) {
                System.out.print("Enter years of service: ");
                yearsOfService[i] = sc.nextDouble();
                if (yearsOfService[i] < 0) {
                    System.out.println("Invalid years of service! Please enter a non-negative value.");
                    i--;
                    break;
                }
            }
        }

        // Calculate bonuses, new salaries, and totals
        for (int i = 0; i < employees; i++) {
            if (yearsOfService[i] > 5) {
                bonus[i] = salary[i] * 0.05;
            }
	    else {
                bonus[i] = salary[i] * 0.02;
            }

            newSalary[i] = salary[i] + bonus[i]; // Compute new salary
            totalBonus += bonus[i]; // Accumulate total bonus
            totalOldSalary += salary[i]; // Accumulate total old salary
            totalNewSalary += newSalary[i]; // Accumulate total new salary
        }

        // Display results
        System.out.println("\nEmployee Bonus and Salary Details:");
        for (int i = 0; i < employees; i++) {
            System.out.println("Employee " + (i + 1) + " => Old Salary: " + salary[i] +
                    ", Bonus: " + bonus[i] + ", New Salary: " + newSalary[i]);
        }

        // Print total values
        System.out.println("\nTotal Bonus: " + totalBonus);
    }
}
