import java.util.*;

class DimensionalPercentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for the number of students
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();

        // Creating arrays to store marks, percentages, and grades
        int[][] marks = new int[n][3]; // [student]
        double[] percentage = new double[n]; // Array to store percentage of each student
        char[] grade = new char[n]; // Array to store grades of each student

        // Taking input for marks in Physics, Chemistry, and Maths
        for (int i = 0; i < n; i++) {
            System.out.println("Enter marks for Student " + (i + 1) + ": ");

            System.out.print("Enter Physics marks: ");
            marks[i][0] = sc.nextInt();
            if (marks[i][0] < 0) {
                System.out.print("Invalid! Enter positive Physics marks: ");
                marks[i][0] = sc.nextInt();
            }

            System.out.print("Enter Chemistry marks: ");
            marks[i][1] = sc.nextInt();
            if (marks[i][1] < 0) {
                System.out.print("Invalid! Enter positive Chemistry marks: ");
                marks[i][1] = sc.nextInt();
            }

            System.out.print("Enter Maths marks: ");
            marks[i][2] = sc.nextInt();
            if (marks[i][2] < 0) {
                System.out.print("Invalid! Enter positive Maths marks: ");
                marks[i][2] = sc.nextInt();
            }

            // Calculate percentage
            percentage[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;

            // Assign grades based on percentage
            if (percentage[i] >= 80) {
                grade[i] = 'A';
            } else if (percentage[i] >= 70) {
                grade[i] = 'B';
            } else if (percentage[i] >= 60) {
                grade[i] = 'C';
            } else if (percentage[i] >= 50) {
                grade[i] = 'D';
            } else if (percentage[i] >= 40) {
                grade[i] = 'E';
            } else {
                grade[i] = 'R';
            }
        }

        // Displaying the results
        System.out.println("Results:");

        for (int i = 0; i < n; i++) {
            System.out.print("\nStudent " + (i + 1) + ": ");
            System.out.print("Physics Marks: " + marks[i][0] + " ");
            System.out.print("Chemistry Marks: " + marks[i][1] + " ");
            System.out.print("Maths Marks: " + marks[i][2] + " ");
            System.out.print("Percentage: " + percentage[i] + " ");
            System.out.print("Grade: " + grade[i] + " ");
        }
    }
}
