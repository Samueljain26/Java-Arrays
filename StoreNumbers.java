import java.util.Scanner;

public class StoreNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] numbers = new double[10]; // Array to store up to 10 numbers
        double total = 0; 
        int index = 0; 

        // Infinite loop to take input from the user
        while (true) {
            System.out.print("Enter a number: ");
            double num = sc.nextDouble();

            // Check if input is 0 or negative to stop taking input
            if (num <= 0) {
                break;
            }

            // Store number in array and update index
            numbers[index] = num;
            index++;

            // Break if the array reaches its maximum size (10 elements)
            if (index == 10) {
                break;
            }
        }

        // Calculate the total sum of the entered numbers
        for (int i = 0; i < index; i++) {
            total += numbers[i];
        }

        System.out.println("Entered Numbers: ");
        for (int i = 0; i < index; i++) {
            System.out.print(numbers[i] + " ");
        }

        // Display the total sum
        System.out.println("\nTotal Sum: " + total);

    }
}
