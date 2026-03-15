package Data_structures;

public class Linear_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* 
 * 1️⃣ Linear Search (Beginner – MUST know)
Idea (Very Simple)

Check each element one by one

Stop when found

This works for any array (sorted or unsorted).
  When to Use Linear Search?

✅ Small data
✅ Unsorted array
✅ Simple logic (very common in QA interviews)
 *  */
		int arr[] = {5, 3, 7, 1, 9};
        int target = 7;
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == target) {
                System.out.println("Found at index: " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Element not found");
        }
    
	}

}
