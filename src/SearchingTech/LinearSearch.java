package SearchingTech;
import java.util.*;

public class LinearSearch {
	
	public static void main(String[] args) {
		
		int[] arr = {5 , 8 , 1 , 2 , 6 , 7 , 4 , 3 , 9};
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number to be search in between 1-9 : ");
		int key = input.nextInt();
		
		for(int i = 0 ; i<arr.length ; i++) {
			if(arr[i]==key) {
				System.out.println(key + " is in " + i + "th index.");
			}
			
		}
		
		input.close();
	}
	

}
