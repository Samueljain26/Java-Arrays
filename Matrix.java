import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       System.out.print("Enter the number of Rows: ");
       int rows =sc.nextInt();
        System.out.print("Enter the number of Columns: ");
       int columns =sc.nextInt();
       int[][] arr= new int[rows][columns]; //making 2d array
       for(int i=0;i<rows;i++){
           for(int j=0;j<columns;j++){
               System.out.print("Enter the number: ");
               arr[i][j] = sc.nextInt(); //taking input for the 2d array
           }
       }
	// making the new 1d array where the elements will be stored
       int[] newArr = new int[rows*columns];
       int index=0;
       for(int i=0;i<rows;i++){
           for(int j=0;j<columns;j++){
               newArr[index]= arr[i][j]; //stored the 2d elements in 1d array
                index++;
           }
       }
        System.out.print("Array: ");
	// printing the output
       for(int i=0;i<newArr.length;i++){
            System.out.print(newArr[i] + " ");
       }
           }
       }
