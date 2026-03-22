package Data_structures;

public class Sorting_algorithms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Sorting means arranging data in a specific order, usually:

 /*  Ascending (small → big)

Descending (big → small)
	Bubble sort (Arranging of Elements in asc or desc Order )
	Layman Explanation 🫧

Imagine numbers are bubbles in water

Bigger numbers are heavier

They slowly move to the right

Smaller numbers move to the left

We compare two adjacent numbers and swap if they are in wrong order.
*/
		Bubble_sort();{
			
		}
		
		Selection_sort();{
			/*
2️⃣ Selection Sort (Simple & Clean Logic)
Layman Explanation 🎯

Think like this:

Find the smallest number

Put it at the first position

Repeat for remaining array*/					}
	}


	private static void Bubble_sort() {
		// TODO Auto-generated method stub
		 int arr[] = {5, 1, 4, 2};

	        for (int i = 0; i < arr.length - 1; i++) {

	            for (int j = 0; j < arr.length - 1 - i; j++) {

	                if (arr[j] > arr[j + 1]) {

	                    int temp = arr[j];
	                    arr[j] = arr[j + 1];
	                    arr[j + 1] = temp;
	                }
	            }
	        }

	        for (int num : arr) {
	            System.out.print(+num + " ");
	        }
	    }
	private static void Selection_sort() {
		// TODO Auto-generated method stub
		 int arr[] = {64, 25, 12, 22, 11};

	        for (int i = 0; i < arr.length - 1; i++) {

	            int minIndex = i;

	            for (int j = i + 1; j < arr.length; j++) {

	                if (arr[j] < arr[minIndex]) {
	                    minIndex = j;
	                }
	            }

	            int temp = arr[minIndex];
	            arr[minIndex] = arr[i];
	            arr[i] = temp;
	        }

	        for (int num : arr) {
	            System.out.println(num + " ");
	        }
	    
	}

	}

