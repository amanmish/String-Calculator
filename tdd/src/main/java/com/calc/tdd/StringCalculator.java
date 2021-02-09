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
		String[] inputNumber;
		if(!numbers.contains(",")) {
			 return Integer.parseInt(numbers);
		}
		
		inputNumber = inputNumber(numbers);
		int sum = 0;
		int len = inputNumber.length;
		for(String str : inputNumber) {
			int get = Integer.parseInt(str);
			sum += get;
		}
		return sum;
	}
	/*
	 * To convert the String to tokens based on regex
	 */
	public String[] inputNumber(String input) {
		String[] tokens = input.split(",|\n");
		return tokens;
	}
}
