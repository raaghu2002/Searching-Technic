package SearchingTech;
import java.util.*;

public class BinarySearch {
	
	public static void main(String[] args) {
		int[] arr = {5,7,9,11,13,21,26,32,39,46};
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number to be search : ");
		int key = input.nextInt();
		int low = 0;
		int high = arr.length-1;
		int mid = low + high / 2 ;
		
		if(key == arr[mid]) {
			System.out.println(key+" is in "+mid+"th index.");
		}
		
		else if(key < arr[mid]) {
			for(int i = 0 ; i < mid-1 ; i++) {
				if(key==arr[i]) {
					System.out.println(key+" is in "+i+"th index.");
				}
			}
		}
		
		else if(key > arr[mid]){
			for(int i = mid+1 ; i < high+1 ; i++ ) {
				if(key == arr[i]) {
					System.out.println(key+" is in "+i+"th index.");
				}
			}
		}
		
		else {
			System.out.println(key +" is not present in this array.");
		}
		
		input.close();
		
	}

}
