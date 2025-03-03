import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int index = 0;
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int maxFactor = 10;
        int[] arr = new int[maxFactor];
        int[] temp = new int[maxFactor * 2]; // Temporary array for resizing

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                if (index >= maxFactor) {
                    // Copy old elements to temp before expanding
                    for (int j = 0; j < maxFactor; j++) {
                        temp[j] = arr[j];
                    }
                }

                if (index < 10) {
                    arr[index] = i; // Store in original array if within limit
                }
                temp[index] = i; // Store in temp regardless
                index++;
            }
        }

        // Printing the temp array
        System.out.print("Factors are: ");
        for (int k = 0; k < index; k++) {
            System.out.print(temp[k] + " ");
        }

    }
}
