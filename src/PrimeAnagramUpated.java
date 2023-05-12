package com.datastructures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PrimeAnagramUpated {
	/**
	 * 
	 * @param range
	 * @return
	 */
	static ArrayList<String> toFindPrime(int range) {
		/*
		 * Declaring an array list
		 */

		ArrayList<String> list = new ArrayList<>();

		for (int i = 2; i <= range; i++) {
			int count = 0;
			for (int j = 2; j <= i; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 1) {
				list.add(Integer.toString(i));
			}
		}
		return list;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter range for prime numbers");

		int range = sc.nextInt();

		/*
		 * Declaring list to save anagram numbers
		 */

		ArrayList<String> anagramList = new ArrayList<>();

		/*
		 * Calling method to get prime numbers
		 */

		ArrayList<String> prime = toFindPrime(range);

		/*
		 * Traversing whole aaray list and finding anagram numbers
		 */

		for (int i = 0; i < prime.size() - 1; i++) {
			for (int j = i + 1; j < prime.size(); j++) {

				/*
				 * Getting elements and converting it to characteristic array
				 */
				char[] char1 = prime.get(i).toCharArray();
				char[] char2 = prime.get(j).toCharArray();

				/*
				 * Comparing the two arrays
				 */
				if (char1.length == char2.length) {

					Arrays.sort(char1);
					Arrays.sort(char2);

					/*
					 * Converting again arrays into string
					 */
					String string1 = new String(char1);
					String string2 = new String(char2);

					/*
					 * If both strings are equal then we got our anagrams
					 */
					if (string1.equals(string2)) {
						anagramList.add(prime.get(i));
						anagramList.add(prime.get(j));
					}

				}

			}
		}
		/*
		 * To print anagram numbers
		 */
		for (String str : anagramList) {
			System.out.println(str);
		}

	}

}
