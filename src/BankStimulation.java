package com.datastructures;

import java.util.*;
/**
 * 
 * @author DELL
 *
 */

public class BankStimulation {
	
	private static int balance = 10000;

	private static void deposit(int amount) {
		balance += amount;
	}
	/**
	 * 
	 * @param amount
	 */

	private static void deposit1(int amount) {
		balance += amount;
	}
	/**
	 * 
	 * @author DELL
	 *
	 */

	private static class Applicant {
		private final String name;
		private final String type;
		private final int amount;

		private Applicant(String name, String type, int amount) {
			this.name = name;
			this.type = type;
			this.amount = amount;
		}
	}
	/**
	 * 
	 * @param amount
	 * @return
	 */

	private static boolean withdraw(int amount) {
		if (amount <= balance) {
			balance -= amount;
			return true;
		} else {
			return false;
		}
	}
	/**
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		/*
		 * To declare queue
		 */
		Queue queue = new LinkedList<>();

		Scanner scanner = new Scanner(System.in);

		/*
		 * Switcu case statements to give banking operations to customer
		 */
		while (true) {
			System.out.println("Welcome to the Banking Cash Counter, applicant should choose from following operations");
			System.out.println("1. Add a person to the queue");
			System.out.println("2. Serve the next person in the queue");
			System.out.println("3. Check the cash balance");
			System.out.println("4. Exit");

			int choice = scanner.nextInt();

			switch (choice) {

			/*
			 * To add customer detail in queue
			 */
			case 1:
				System.out.println("Enter person name:");
				String name = scanner.next();
				System.out.println("Enter transaction type (Debit/Credit):");
				String type = scanner.next();
				System.out.println("Enter amount:");
				int amount = scanner.nextInt();
				queue.offer(new Applicant(name, type, amount));
				break;
			/*
			 * To deque and perform banking actions
			 */
			case 2:
				if (!queue.isEmpty()) {
					Applicant person = (Applicant) queue.poll();
					if (person.type.equals("D")) {
						deposit(person.amount);
						System.out.println(person.name + " deposited RS" + person.amount);
					} else if (person.type.equals("W")) {
						if (withdraw(person.amount)) {
							System.out.println(person.name + " withdrew Rs" + person.amount);
						} else {
							System.out.println(person.name + " cannot withdraw Rs" + person.amount);
						}
					}
				} else {
					System.out.println("Queue is empty!");
				}
				break;

			case 3:
				System.out.println("Cash balance is Rs" + balance);
				break;

			case 4:
				System.exit(0);
				break;

			default:
				System.out.println("Invalid choice!");
				break;
			}
		}
	}

}
