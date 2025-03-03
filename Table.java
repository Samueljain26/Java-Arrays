import java.util.*;

public class Table
{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int[] arr = new int[10];
		    System.out.print("Enter the number ");
		    int number =sc.nextInt(); // taking user input
		for(int i=0;i<arr.length;i++){
	// Displaying the multiplication table
		    arr[i] = (i+1)*number;
		    System.out.println(number + " * " + (i+1) + " = " + arr[i]);
		}
	}
}
