package com.datastructures;

public class Prime2D {

	public static boolean isPrime(int n) {
		if (n <= 1) {
			return false;
		}

		// Check from 2 to the square root of n
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}

		return true;
	}

	public static int[][] generatePrimeArray(int rows, int columns) {
		int[][] primeArray = new int[rows][columns];
		int num = 2;
		int count = 0;

		while (count < rows * columns) {
			if (isPrime(num)) {
				primeArray[count / columns][count % columns] = num;
				count++;
			}
			num++;
		}

		return primeArray;
	}

	public static void main(String[] args) {

		int rows = 4;
		int columns = 4;
		int[][] primeArray = generatePrimeArray(rows, columns);

		// Display the prime array
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print(primeArray[i][j] + " ");
			}
			System.out.println();

		}
	}
}
