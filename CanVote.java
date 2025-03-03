import java.util.*;

public class CanVote
{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int[] arr = new int[10];
		for(int i=0; i<arr.length;i++){
		    System.out.print("Enter the age of the student: ");
		    arr[i] =sc.nextInt();  // taking the input from the user
		}
		for(int i=0;i<arr.length;i++){  //loop to iterate all values one by one
		    if(arr[i]<0){
		        System.out.println("Invalid age");  //checking if age is negative or positive
		    }
		    else{
		        if(arr[i]>=18){
		            System.out.println(" The student with the age " + arr[i] + " can vote.");
		        }
		        else{
		            System.out.println(" The student with the age " + arr[i] + " cannot vote.");
		        }
		    }
		    }
		}
	}
