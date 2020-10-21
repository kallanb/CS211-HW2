package hw04;
/*Kallan Brainard
CS 211
July 16, 2020
HW04

Write a method called expunge that accepts a stack of integers as a
parameter and makes sure that the stack's elements are in nondecreasing
order from top to bottom, by removing from the stack any element that
is smaller than any element(s) on top of it. For example, if the stack
stores [4, 20, 15, 15, 8, 5, 7, 12, 3, 10, 5, 1], the element
values 3, 7, 5, 8, and 4 should be removed because each has an
element above it with a larger value. So your method should change the
stack to store [20, 15, 15, 12, 10, 5, 1]. Notice that now the
elements are in nondecreasing order from top to bottom. If the stack is
empty or has just one element, nothing changes. Use one queue or stack
(but not both) as auxiliary storage.*/
import java.util.*;

public class Ch14Exercise13 {

	public static void main(String[] args) {
		//array of elements to be stored in stack
		int [] array = {4,20,15,15,8,5,7,12,3,10,5,1};
		Stack<Integer> stack1 = new Stack<Integer>();
		for (int i : array) {
			stack1.add(i);
		}
		printInfo(stack1); 
		
		//create an empty stack
		Stack<Integer> stack2 = new Stack<Integer>();
		printInfo(stack2);
		
		//create stack with one element
		Stack<Integer> stack3 = new Stack<Integer>();
		stack3.add(1);
		printInfo(stack3);
	}

	public static void expunge(Stack<Integer> stack) {
		//if stack is empty or contains 1 element, return to main.
		if (stack.isEmpty() || stack.size()==1) {
			return;
		}

		//queue for auxiliary storage
		Queue <Integer> queue = new LinkedList<Integer>();

		//examine stack elements and add to queue
		Integer num1 = stack.peek(); 
		Integer	num2;
		
		while (!stack.isEmpty()) {
			num2 = stack.pop();
			if (num1.intValue()<=num2.intValue()) {
				queue.add(num2.intValue());
				num1 = num2;
			}
		}

		//copy elements from queue to stack
		while (!queue.isEmpty()) {
			stack.add(queue.remove());
		}

		//reverse elements 
		while (!stack.isEmpty()) {
			queue.add(stack.pop());
		}

		//add back to stack
		while (!queue.isEmpty()) {
			stack.add(queue.remove());
		}
	}
	
	public static void printInfo(Stack<Integer> stack) {
		System.out.println("Before");
		System.out.println(stack);
		expunge(stack);
		System.out.println("After");
		System.out.println(stack + "\n");
	}
}
