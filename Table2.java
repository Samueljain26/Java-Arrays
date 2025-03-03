import java.util.*;

public class Table2
{
        public static void main(String[] args) {
                Scanner sc =new Scanner(System.in);
                int[] arr = new int[4];
                    System.out.print("Enter the number ");
                    int number =sc.nextInt(); // taking user input
	int num =6;
                for(int i=0;i<arr.length;i++){
        // Displaying the multiplication table
                    arr[i] = num*number;
                    System.out.println(number + " * " + num + " = " + arr[i]);
		num++;
                }
        }
}
