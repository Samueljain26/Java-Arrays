import java.util.Scanner;

public class MeanHeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sum =0;
        double arr[] =new double[11];
	// taking user input in Double data type
        for(int i=0;i<arr.length;i++){
        System.out.print("Enter the height of players: ");
        arr[i] =sc.nextDouble();
        }
        for(int i=0;i<arr.length;i++){
	// sum of all heights of players
            sum += arr[i];
        }
        System.out.print("Mean height of players is: " + sum/11);
    }
}
