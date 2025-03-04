import java.util.*;

public class YoungestFriend{
	public static void main(String[] args) {
	    Scanner sc =new Scanner(System.in);
	    int[] age = new int[3]; //age array
	     int[] height = new int[3]; //height array
	     int maxAge =100;
	     int maxHeight=0;
	     int indexAge=0;
	     int indexHeight=0;
	    for(int i=0;i<age.length;i++){
	//taking input for their ages and height
	        System.out.print("Enter the age of " + (i+1) + " person: ");
	        age[i] = sc.nextInt();
	        System.out.print("Enter the height of " + (i+1) + " person: ");
	        height[i] = sc.nextInt();
	    }
	//finding the tallest friend
	    for(int i=0;i<height.length;i++){
	        if(height[i]>maxHeight){
	            maxHeight =height[i];
	            indexHeight=i;
	        }
	        }
	//finding the youngest friend
	        for(int i=0;i<age.length;i++){
	        if(age[i] < maxAge){
	            maxAge =age[i];
	            indexAge=i;
	        }
	        }
		// printing the output
	        System.out.println("Youngest friend is " +(indexAge+1) + " => " + age[indexAge] );
	        System.out.println("Tallest friend is " +(indexHeight+1) + " => " + height[indexHeight] );
	    }
	}

