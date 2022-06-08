package com.morningstar;

import java.util.Scanner;

public class Factorial {

	public int getFactorial(int num) {
		
		if(num==0) {
			return 1;
		}
		else {
			return num*getFactorial(num-1);
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int number=sc.nextInt();
		Factorial obj=new Factorial();
		System.out.println(obj.getFactorial(number));
	}

}
