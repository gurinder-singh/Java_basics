package Data_structures;

public class Binary_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * What Just Happened? (Important Insight)

First step → cut array in half

Second step → cut half again

We never check every element
✅ “Binary search only works on sorted arrays.”
✅ “Binary search reduces the search space by half each time.”
✅ “Binary search has O(log n) time complexity.”
 * 
 */
		 int arr[] = {10, 20, 30, 40, 50};
	        int target = 40;

	        int start = 0;
	        int end = arr.length - 1;
	        boolean found = false;

	        while (start <= end) {

	            int mid = (start + end) / 2;

	            if (arr[mid] == target) {
	                System.out.println("Found at index: " + mid);
	                found = true;
	                break;
	            } 
	            else if (target > arr[mid]) {
	                start = mid + 1;
	            } 
	            else {
	                end = mid - 1;
	            }
	        }

	        if (!found) {
	            System.out.println("Element not found");
	        }
	    }
	
}
