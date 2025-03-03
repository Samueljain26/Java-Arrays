import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int i=0; //even  numbers array iteration
        int j=0; // odd number array iteration
        int[] even =new int[(number/2)+1];
        int[] odd =new int[(number/2)+1];
        for(int k=1;k<=number;k++){
	//checking if the number is even or odd
            if(k%2==0){
                even[i]=k;
                i++;
            }
            else{
                odd[j]=k;
                j++;
            }
        }
	//printing the even numbers
        System.out.print("Even Numbers: ");
        for(int x=0;x<i;x++){
            System.out.print(even[x] + " ");
        }
	//printing the odd numbers

        System.out.print("\nOdd Numbers: ");
        for(int y=0;y<j;y++){
            System.out.print(odd[y] + " ");
        }
    }
}
