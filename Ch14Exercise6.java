package hw04;
/*Kallan Brainard
CS 211
July 16, 2020
HW04*/

/*Write a method called rearrange that accepts a queue of integers as a
parameter and rearranges the order of the values so that all of the even
values appear before the odd values and that otherwise preserves the
original order of the queue. For example, if the queue stores 
[3, 5, 4, 17, 6, 83, 1, 84, 16, 37], your method should rearrange it to store
[4, 6, 84, 16, 3, 5, 17, 83, 1, 37]. Notice that all of the evens
appear at the front followed by the odds and that the relative order of the
evens and odds is the same as in the original. Use one stack as auxiliary storage.*/
import java.util.*;

public class Ch14Exercise6 {

	public static void main(String[] args) {
		//create a queue of integers from an array
		int [] array = {3,5,4,17,6,83,1,84,16,37};
		Queue<Integer> queue = new LinkedList<Integer>();
		
		for (int i : array) {
			queue.add(i);
		}

		//generate output
		System.out.println("Queue before reordering");
		System.out.println(queue);
		rearrange(queue);
		System.out.println("\nQueue after reordering");
		System.out.println(queue);
	}

	public static void rearrange(Queue<Integer> queue) {
		int num;
		int qSize = queue.size();
		Stack<Integer> stack = new Stack<Integer>();	//stack for auxiliary storage

		//remove the front element of the queue and checks if element is even. 
		//If even, add back to queue, if odd then add to stack
		for (int i = 0; i<qSize; i++) {
			num = queue.remove();
			if (num % 2 == 0) {
				queue.add(num);
			} else {
				stack.push(num);
			}
		}
		
		//odds are added back into queue 
		while (!stack.isEmpty()) {
			queue.add(stack.pop());
		}
		
		// Odds currently in reverse order. 
		// Repeats the process above to preserve original ordering of queue
		for(int i = 0; i <qSize; i++) {
			num = queue.remove();
			// Even elements are added back to the list
			if(num%2==0) {
				queue.add(num);
			} else {
				stack.push(num);
			}
		}
		
		//odds are added back into queue
		while(!stack.isEmpty()) {
			queue.add(stack.pop());
		}
	}
}

