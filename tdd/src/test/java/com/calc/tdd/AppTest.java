package com.calc.tdd;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.io.FileNotFoundException;
import java.time.LocalTime;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
/**
 * Unit test for simple Calc App.
 */
public class AppTest {
    /**
     * Rigourous Test :-)
     */
	StringCalculator stringCalculator;
	@BeforeEach
	public void initialize() {
		stringCalculator = new StringCalculator();
	}
	@Test
    public void emptyStringInputTest() {
        String input = "";
        int actual = stringCalculator.add(input);
        int expected = 0;
        assertEquals(expected, actual);
    }
	
	@Test
	public void oneStringInputTest() {
		String input = "1";
		int actual = stringCalculator.add(input);
		int expected = 1;
		assertEquals(expected, actual);
	}
	
	@Test
	public void twoStringInputTest() {
		String input = "1,2";
		int actual = stringCalculator.add(input);
		int expected = 3;
		assertEquals(expected, actual);
	}
	
	@Test
	public void multipleStringInputTest() {
		String input = "1,2,3,5,6";
		int actual = stringCalculator.add(input);
		int expected = 17;
		assertEquals(expected, actual);
	}
	
	@Test
	public void newLineStringInputTest() {
		String input = "1,2,3,5\n6";
		int actual = stringCalculator.add(input);
		int expected = 17;
		assertEquals(expected, actual);
	}
	
	@Test
	public void customStringInputTest() {
		String input = "//;\n1;2;3";
		int actual = stringCalculator.add(input);
		int expected = 6;
		assertEquals(expected, actual);
	}
	
	@Test
	public void negativeStringInputExceptionTest() {
		try {
			
			String input = "-1,2,3";
			stringCalculator.add(input);
			
		} catch(RuntimeException e) { 
			assertEquals("Negatives not allowed- -1",e.getMessage());
		}
	}
	
	/*@Test
	public void countAddMethodTest() {
		int actual = stringCalculator.GetCalledCount();
		int expected = 6;
		assertEquals(expected, actual);
	}*/
	
	@Test
	public void greaterThenThousandTest() {
		String input = "1,1001,3";
		int actual = stringCalculator.add(input);
		int expected = 4;
		assertEquals(expected, actual);
	}
	
}

