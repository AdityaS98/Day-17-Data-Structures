package com.datastructures;

public class UnorderedLinkedlist {
	private Node head;

	private class Node {
		String data;
		Node next;

		public Node(String data) {
			this.data = data;
			this.next = null;
		}
	}

	public void insert(String data) {
		Node newNode = new Node(data);

		if (head == null) {
			head = newNode;
		} else {
			Node current = head;
			while (current.next != null) {
				current = current.next;
			}
			current.next = newNode;
		}
	}

	public void display() {
		Node current = head;
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {

		UnorderedLinkedlist linkedList = new UnorderedLinkedlist();

		// Insert elements into the linked list
		linkedList.insert("Hello");
		linkedList.insert("World");
		linkedList.insert("Java");

		// Display the linked list
		linkedList.display();
	}

}
