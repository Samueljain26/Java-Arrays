import java.util.*;

public class largestDigit{
	public static void main(String[] args) {
	    Scanner sc =new Scanner(System.in);
	    System.out.print("Enter a number: ");
	//taking input from user
	    int number =sc.nextInt();
	//making array to store the digits
	    int arr[] =new int[10];
	    int largest =0;
	    int secondLargest=0;
	    for(int i=0;i<arr.length;i++){
	        arr[i] = number%10; //storing the last digit of the number in array
	        number /= 10;
	        if(number ==0){
	            break;
	        }
	    }
	    for(int i=0;i<arr.length;i++){
		//finding the largest and 2nd largest digit
	        if(arr[i] > largest){
	            secondLargest =largest;
	            largest = arr[i];
	        }
	        if(arr[i] >secondLargest && arr[i] != largest){
	            secondLargest = arr[i];
	        }
	        }
		//printing the output
	        System.out.print("Largest digit is: " + largest + "\nSecond largest digit is: " + secondLargest);
	}
	 }
