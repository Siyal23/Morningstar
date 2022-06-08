package com.morningstar;

public class Calculator2 {

	
	public float divide(int value1,int value2) {
		float division=0;
		
		if(value2==0) {
			throw new ArithmeticException();
			}
		else{
			division=value1/value2;
		};
		
		return division;
	}
	public static void main(String[] args) {
		Calculator2 calculator2=new Calculator2();
		System.out.println(calculator2.divide(10,0));
	}

}
