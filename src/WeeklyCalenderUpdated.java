package com.datastructures;

class Calender{
	
}

public class WeeklyCalenderUpdated {

	public static <T> void main(String[] args) {
		Calender<T> stack = new Calender<>();

		// Adding weekdays to the stack
		stack.push((T) "Monday");
		stack.push((T) "Tuesday");
		stack.push((T) "Wednesday");
		stack.push((T) "Thursday");
		stack.push((T) "Friday");
		stack.push((T) "Saturday");
		stack.push((T) "Sunday");

		// Adding dates of the month to the stack
		for (int i = 1; i <= 31; i++) {
			stack.push((T) Integer.valueOf(i));
		}

		// Printing the contents of the stack
		while (!stack.isEmpty()) {
			System.out.println(stack.pop());

		}
	}
}
