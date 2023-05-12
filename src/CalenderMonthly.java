package com.datastructures;

import java.time.LocalDate;
import java.time.YearMonth;
import java.util.*;

/**
 * 
 * @author DELL
 *
 */

public class CalenderMonthly {
	/**
	 * 
	 * @param y
	 * @param m
	 */

	static void displayMonthdetails(int y, int m) {

		YearMonth ym = YearMonth.of(y, m);
		System.out.println("The following are the details");

		System.out.println("----------------------------");

		System.out.println("Sunday Monday Tuesday Wednesday Thursday Friday Saturday");

		System.out.println("----------------------------");

		int countday = 1;

		/*
		 * To get day of week by calling out functions
		 */
		int day = LocalDate.of(y, m, 1).getDayOfWeek().getValue();
		if (day != 7)
			for (int i = 0; i < day; i++, countday++) {
				System.out.printf("%-4s", "");
			}
		/*
		 * To get date on that day of week
		 */

		for (int i = 1; i <= ym.getMonth().length(ym.isLeapYear()); i++, countday++) {
			System.out.printf("%-4d", i);
			if (countday % 7 == 0) {
				System.out.println();
			}
		}
		System.out.println("\n---------------------------");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Month of year");

		int month = sc.nextInt();

		System.out.println("Enter Year");

		int year = sc.nextInt();
		/*
		 * Calling functions
		 */

		displayMonthdetails(year, month);

	}

}
