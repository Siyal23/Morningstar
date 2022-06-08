package com.morningstar.lab;

import java.util.Scanner;

public class PrimeNumber {
	
	public boolean isPrime(int number) {
		boolean flag;
		for(int i=2;(i<number/2);i++) {
			if(number%i==0) {
				flag=false;
				return flag;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int number=sc.nextInt();
		PrimeNumber obj=new PrimeNumber();
		boolean answer=obj.isPrime(number);
		if(answer) {
			System.out.println(number+" is a prime number.");
		}
		else {
			System.out.println(number+" is not a prime number");
		}
	}

}
