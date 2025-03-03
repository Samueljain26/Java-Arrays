import java.util.*;

public class ComparingNumbers
{
	public static void main(String[] args){
	Scanner sc =new Scanner(System.in);
		int[] arr = new int[5];
		for(int i=0; i<arr.length;i++){
		    System.out.print("Enter the numbers ");
		    arr[i] =sc.nextInt(); //taking the user input
		}
		for(int i=0;i<arr.length;i++){
		    if(arr[i]>0){  //to check is the number is greater then 0
		        if(arr[i]%2==0){ // to check if even number
		            System.out.println(arr[i] +" is positive and even number");
		        }
		        else{
		             System.out.println(arr[i] +" is positive and odd number");
		        }
		    }
		    else if(arr[i]==0){
		        System.out.println(arr[i]+ " is zero");
		    }
		    else{
		        System.out.println(arr[i] + " is negative number");
			}
		}
		if(arr[0]>arr[4]){ // to check is first number is greater then last
		    System.out.println(arr[0] + " is greater");
		}
		else if(arr[0]==arr[4]){ // to check is first number is equal to  last

		    System.out.println(arr[4] + " is equal to " + arr[0]);
		}
		else{
		    System.out.println(arr[4] + " is greater");
		}
		}
	}

