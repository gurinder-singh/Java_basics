package Data_structures;
import java.util.LinkedList;

import java.util.Queue;
import java.util.Stack;
public class Stack_and_Queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack();{
			/*   
			 * A Stack is a data structure that follows:LIFO → Last In, First Out
			 *   | Operation | Meaning            |
                | --------- | ------------------ |
                | push()    | Add element to top |
                | pop()     | Remove top element |
                | peek()    | View top element   |
 
			 * 
			 */
		}
		Queue();{
/*			A Queue is a data structure that follows:FIFO → First In, First Out
			| Operation | Meaning                |
			| --------- | ---------------------- |
			| enqueue   | Add element (rear)     |
			| dequeue   | Remove element (front) |
			| peek      | View front element     |
*/
		}

	}

	

	private static void Stack() {
		// TODO Auto-generated method stub
		  Stack<Integer> stack = new Stack<>();

	        // push
	        stack.push(10);
	        stack.push(20);
	        stack.push(30);
	        stack.push(40);

	        System.out.println("Array after Stack"+stack); // [10, 20, 30]

	        //  pop is remove the last element Inputed
	        stack.pop();
	        System.out.println("Array after Pop"+stack); // [10, 20]

	        // peek(Over view the element from top )
	        System.out.println("Array after Peek "+stack.peek()); // 20
		
	}
	private static void Queue() {
		// TODO Auto-generated method stub
		   Queue<Integer> queue = new LinkedList<>();

	        // enqueue
	        queue.add(10);
	        queue.add(20);
	        queue.add(30);
	        queue.add(50);

	        System.out.println("Queue Array is "+queue); // [10, 20, 30]

	        // dequeue
	        queue.remove();
	        System.out.println("Removed the Element from Queue"+queue); // [20, 30]

	        // peek
	        System.out.println("Queue Top element(peek) is "+queue.peek()); // 20
	    }
	}


