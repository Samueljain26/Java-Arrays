import java.util.Scanner;
import java.util.Arrays;

public class LargestDigitSpace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int maxDigit = 10; // Initial array size
        int[] digits = new int[maxDigit];
        int index = 0;

        for (int i = 0; ; i++) {
            if (number == 0){
		 break; // Exit loop when number is completely processed
		}
            if (index == maxDigit) {
                maxDigit += 10;
                // Create a new array with increased size
                int[] temp = new int[maxDigit];
                // Copy existing digits to the new array
                System.arraycopy(digits, 0, temp, 0, index);
                // Assign temp array back to digits
                digits = temp;
            }

            digits[index] = number % 10; // Store last digit
            number /= 10;
            index++; // Move to the next index
        }

        int largest = 0, secondLargest = 0;

        // Find largest and second largest using for loop
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest; // Update second largest
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i]; // Update second largest
            }
        }

        // Output result
        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);
    }
}
