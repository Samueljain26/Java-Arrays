import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();
	int index=0;
        if (number <= 0) {
            System.out.println("Invalid");
        }

        String[] arr = new String[number]; // Array to store results
        for (int i = 1; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                arr[index] = "FizzBuzz";
		index++;
            }
	    else if (i % 3 == 0) {
                arr[index] = "Fizz";
		index++;
            }
	    else if (i % 5 == 0) {
                arr[index] = "Buzz";
		index++;
            }
	    else {
                arr[index] = Integer.toString(i); // Store the number as a string
                 index++;
		}
        }

        // Loop to print results in the specified format
        for (int i = 0; i < number; i++) {
            System.out.println("Position " + (i+1) + " = " + arr[i]);
        }
    }
}
