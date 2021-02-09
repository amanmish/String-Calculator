package com.calc.tdd;

public class StringCalculator {
	/**
	 * This method will perform the sum of the numbers
	 * @param numbers
	 * @return sum result
	 */
	public int add(String numbers) {
		
		if(numbers.isEmpty()) {
			return 0;
		}
		String[] inputString  = numbers.split("\\,");
		int[] input = new int[2];
		int sum = 0;
		switch(inputString.length) {
		case 1:
			sum = Integer.parseInt(inputString[0]);
			break;
		case 2:
			sum = Integer.parseInt(inputString[0]) + Integer.parseInt(inputString[1]);
			break;
		default :
			System.out.println("Invalid input String");
			return -1;
		}
		return sum;
	}
}
