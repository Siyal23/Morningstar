package com.morningstar.lab;

import java.util.Scanner;

public class PosNeg {
	
	public void isPositive(int number) {
		if(number>=0) {
			System.out.println("Number is positive");
		}
		else {
			System.out.println("Number is negative");
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		PosNeg obj=new PosNeg();
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		obj.isPositive(num);
		sc.close();
	}

}
