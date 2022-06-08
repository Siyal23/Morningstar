package com.morningstar;


public class App {
	public int addition(int number1,int number2) {
		return number1+number2;
	}

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