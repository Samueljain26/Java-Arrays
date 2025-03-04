import java.util.*;

class ReverseNumber{
	public static void main(String[] args){
	Scanner sc =new Scanner(System.in);
	//taking user input
	System.out.print("Enter a number: ");
	int number =sc.nextInt();
	int arr[] =new int[30]; //declaring an array
	int size = 0;
	for(int i=0;i<arr.length;i++){ //breaking the loop when number becomes 0
	if(number ==0){
	break;
	}
	else{
	size++; //calculating the size of the number
	arr[i] =number%10; // digit storing from last to first position in array
	number =number/10;
	}
	}
	//printing the output
	System.out.print("Reverse Number: ");
	 for(int i=0;i<size;i++){
	System.out.print(arr[i]);
}	}
}

