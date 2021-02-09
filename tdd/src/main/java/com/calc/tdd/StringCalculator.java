package com.calc.tdd;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
		if(input.startsWith("//")) {
			Matcher m = Pattern.compile("//(.)\n(.*)").matcher(input);
			m.matches();
			String customDelimeter = m.group(1);
			String numbers = m.group(2);
			return numbers.split(customDelimeter);
		}
		String[] tokens = input.split(",|\n");
		return tokens;
	}
	
}
