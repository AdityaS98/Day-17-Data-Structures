package com.genericdemo;

import java.util.ArrayList;
import java.util.LinkedList;


public class HashMapsUpdated {
	class Node {
	    int key;
	    Node next;

	    public Node(int key) {
	        this.key = key;
	        this.next = null;
	    }
	}

	class HashTable {
	    private ArrayList<Node> hashTable;
	    private LinkedList<Node> list;

	    public HashTable() {
	        hashTable = new ArrayList<>();
	        list = new LinkedList<>();
	    }

	    private int hashFunction(int value) {
	        return value % 11;
	    }

	    public void addValue(int value) {
	        int hashKey = hashFunction(value);
	        Node head = null;

	        for (Node node : hashTable) {
	            if (node.key == hashKey) {
	                head = node;
	                break;
	            }
	        }

	        if (head == null) {
	            head = new Node(hashKey);
	            hashTable.add(head);
	        }

	        head.next = list.addNode(value, head.next);
	    }

	    public boolean search(int value) {
	        int hashKey = hashFunction(value);

	        for (Node node : hashTable) {
	            if (node.key == hashKey) {
	                Node current = node.next;
	                while (current != null) {
	                    if (current.key == value) {
	                        return true;
	                    }
	                    current = current.next;
	                }
	                break;
	            }
	        }
	        return false;
	    }

	    public void printHashTable() {
	        for (Node node : hashTable) {
	            System.out.print(node.key + " --> ");
	            list.printList(node.next);
	            System.out.println();
	        }
	    }

	    public static void main(String[] args) {
	    	
	        HashTable hashTable = new HashTable();

	        hashTable.addValue(10);
	        hashTable.addValue(20);
	        hashTable.addValue(11);
	        hashTable.addValue(21);
	        hashTable.addValue(12);
	        hashTable.addValue(22);
	        hashTable.addValue(13);	        hashTable.addValue(23);
	        hashTable.addValue(14);
	        hashTable.addValue(24);

	        hashTable.printHashTable();
	    }
	}


}
