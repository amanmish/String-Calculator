package com.calc.tdd;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Scanner sc =  new Scanner(System.in);
    	System.out.println("Enter the number with , seperated");
    	String input = sc.nextLine();
        StringCalculator calc = new StringCalculator();
        System.out.println(calc.add(input));
    }
}
