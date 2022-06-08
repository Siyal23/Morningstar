package com.morningstar;

/*
 * I can test this method by passing values in the main method
 * OR
 * I can create a test case to test if the method is working or not.
 * */
public class Calculator {
	public int addition(int number1,int number2) {
		return number1+number2;
	}
	
	//method should give you sum of numbers you passed as arguments
	//there could be 3,4,5 or many numbers of arguments 
	//if you passing 1 argument then method should give IllegalArgumentException
	public int addition(int ...numbers) {
		if(numbers.length<=1) {
			throw new IllegalArgumentException("Enter more than one numbers.");
		}
		
		else {
			int sum=0;
			for (int num:numbers) {
				sum+=num;
			}
			return sum;
		}
	}
}

