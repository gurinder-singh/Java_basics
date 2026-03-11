package Learning;

import java.util.Scanner;

public class Reversing_a_number {

	public static void main(String[] args) {
	 int num = 1234, reversed = 0;
	    
	    System.out.println("Original Number: " + num);

	    // run loop until num becomes 0
	    while(num != 0) {
	    
	      // get last digit from num
	      int digit = num % 10;
	      reversed = reversed * 10 + digit;

	      // remove the last digit from num
	      num /= 10;
	    }

	    System.out.println("Reversed Number: " + reversed);
	
	    
	    //////////////////////////////////////////
	    try(Scanner scanner = new Scanner(System.in)){

            // Step 1: Prompt the user for input
            System.out.print("Enter a number to reverse: ");
            int number = scanner.nextInt();
    
            // Step 2: Reverse the number using a while loop
            int reversedNumber = 0;
            while (number != 0) {
                int digit = number % 10;  // Extract the last digit
                reversedNumber = reversedNumber * 10 + digit;  // Build the reversed number
                number /= 10;  // Remove the last digit from the original number
            }
    
            // Step 3: Display the reversed number
            System.out.println("Reversed number: " + reversedNumber);
        }  
    }
	    
}
