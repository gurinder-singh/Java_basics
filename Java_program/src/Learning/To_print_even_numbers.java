package Learning;

public class To_print_even_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int start = 1;
	        int end = 100;

	        System.out.println("Even numbers from " + start + " to " + end + ":");

	        // Loop through all numbers in the range
	        for (int i = start; i <= end; i++) {
	            // Check if the current number (i) is even
	            // An even number has a remainder of 0 when divided by 2
	            if (i % 2 == 0) {
	                System.out.println(i);
	            }
	        }
	}

}
