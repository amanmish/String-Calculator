package com.calc.tdd;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalculator {
	/**
	 * This method will perform the sum of the numbers
	 * @param numbers
	 * @return sum result
	 */
	public static int count = 0;
	public int add(String numbers) {
		GetCalledCount();
		if(numbers.isEmpty()) {
			return 0;
		}
		System.out.println(count);
		String[] inputNumber;
		inputNumber = inputNumber(numbers);
		int sum = 0;
		int len = inputNumber.length;
		ArrayList<Integer> negative = new ArrayList<Integer>();
		for(String str : inputNumber) {
			int get = Integer.parseInt(str);
			if(get < 0) {
				negative.add(get);
			}
			if(get > 1000) {
				continue;
			}
			sum += get;
		}
		checkNegative(negative);
		return sum;
	}
	
	private void checkNegative(ArrayList<Integer> negative) {
		// TODO Auto-generated method stub
		if(negative.size() > 0) {
			throw new RuntimeException("Negatives not allowed- "+join(negative));
		}
	}

	public int GetCalledCount() {
		count++;
		return count;
	}
	private String join(ArrayList<Integer> negative) {
		// TODO Auto-generated method stub
		String ans = "";
		for(int x : negative) {
			ans += x;
		}
		return ans;
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
