
package com.datastructures;

import java.util.*;

class Queue1<T> {
	int front = -1, rear = -1;

	/*
	 * 
	 * Creating an object of ArrayList class of T type
	 */
	ArrayList<T> Palindrom = new ArrayList<>();

	/*
	 * Method Returns value of element at front
	 */
	T front() {
		// If it is not pointing to any element in queue
		if (front == -1)

			return null;

		// else return the front element
		return Palindrom.get(front);
	}

	/*
	 * Method returns value of element at rear
	 */
	T rear() {
		// If it is not pointing to any element in queue
		if (rear == -1)
			return null;
		return Palindrom.get(rear);
	}

	/*
	 * Method 3 Inserts element at the front of queue
	 */
	void enqueue(T X) {
		// If queue is empty
		if (this.empty()) {
			front = 0;
			rear = 0;
			Palindrom.add(X);
		}

		// If queue is not empty
		else {
			front++;
			if (Palindrom.size() > front) {

				// Mov front pointer to next
				Palindrom.set(front, X);
			} else

				// Add element to the queue
				Palindrom.add(X);
		}
	}

	/*
	 * Method 4 Deletes elements from the rear from queue
	 */
	void dequeue() {
		// if queue doesn't have any elements
		if (this.empty())

			// Display message when queue is already empty
			System.out.println("Queue is already empty");

		// If queue has only one element
		else if (front == rear) {

			// Both are pointing to same element
			front = rear = -1;
		}

		// If queue has more than one element
		else {

			// Increment the rear
			rear++;
		}
	}

	/*
	 * Method 5 Checks whether the queue is empty
	 */
	boolean empty() {

		if (front == -1 && rear == -1)
			return true;
		return false;
	}

}

public class PalindromeString {
	/**
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		/*
		 * To create object for class
		 */
		Queue1<Character> queuen = new Queue1<>();

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter string to be check");

		String str = sc.next();

		/*
		 * To enqueue string in queue
		 */
		for (int i = 0; i < str.length(); i++) {
			queuen.enqueue(str.charAt(i));
		}

		/*
		 * To check string is palidrome or not by dequeue elements
		 */
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (queuen.front() == str.charAt(i)) {
				queuen.dequeue();
				count++;
			}
		}
		/*
		 * If number of count is equal to length of string then the string will be palindrome.
		 */
		if (count == str.length()) {
			System.out.println("String is a palidrome");
		} else {
			System.out.println("String is not a palidrome");
		}
	}

}
