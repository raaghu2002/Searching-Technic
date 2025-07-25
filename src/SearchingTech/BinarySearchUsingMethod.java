package SearchingTech;
import java.util.*;

public class BinarySearchUsingMethod {

    public static void main(String[] args) {
        int[] arr = {5, 7, 9, 11, 13, 21, 26, 32, 39, 46};
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number to be searched: ");
        int key = input.nextInt();
        input.close();

        int low = 0;
        int high = arr.length - 1;

        boolean found = false;
        
        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == key) {
                System.out.println(key + " is found at index " + mid + ".");
                found = true;
                break;
            }
            else if (arr[mid] < key) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        if (!found) {
            System.out.println(key + " is not in the array.");
        }
    }
}
