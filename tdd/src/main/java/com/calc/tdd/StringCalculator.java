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
		String[] inputString;
		if(!numbers.contains(",")) {
			 return Integer.parseInt(numbers);
		}
		
		inputString = numbers.split(",");
		int sum = 0;
		int len = inputString.length;
		for(String str : inputString) {
			int get = Integer.parseInt(str);
			sum += get;
		}
		return sum;
	}
}
