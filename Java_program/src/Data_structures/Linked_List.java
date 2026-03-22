package Data_structures;

import java.util.LinkedList;

public class Linked_List {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		/*
		 * Each element in a linked list is known as a node. It consists of 3 fields:

Prev - stores an address of the previous element in the list. It is null for the first element
Next - stores an address of the next element in the list. It is null for the last element
Data - stores the actual data
// create Integer type linked list
LinkedList<Integer> linkedList = new LinkedList<>();

// create String type linked list
LinkedList<String> linkedList = new LinkedList<>();
		 */
		LinkedList<String> languages = new LinkedList<>();

	    // add elements in the linked list
	    languages.add("Python");
	    languages.add("Java");
	    languages.add("JavaScript");
	    System.out.println("LinkedList: " + languages);

	    // get the element from the linked list
	    String str = languages.get(1);
	    System.out.print("Get the Element at index 1: " + str);
	    
	 // change elements at index 3
	    languages.set(3, "Kotlin");
	    System.out.println("Updated LinkedList: " + languages);
	    
	 // remove elements from index 1
	    String rvstr = languages.remove(1);
	    System.out.println("Removed Element: " + rvstr);
	}

}
