import java.util.Scanner;

class Frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for the number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Array to store frequency of digits (0-9)
        int[] frequency = new int[10];

        // Finding the frequency of each digit
        while (number > 0) {
            int digit = number % 10;  // Extract last digit
            frequency[digit]++;     // Increase frequency of that digit
            number/= 10;             // Remove last digit
        }

        // Printing output
        System.out.println("Digit Frequencies:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + ": " + frequency[i]);
            }
            }
}
}


