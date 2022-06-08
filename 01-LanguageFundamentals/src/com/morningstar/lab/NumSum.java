package com.morningstar.lab;

import java.util.Scanner;

public class NumSum {
	
	public int getSum(int num) {
		int sum=0;
		while(num>0) {
			int temp=num%10;
			sum=sum+temp;
			num=num/10;
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int number=sc.nextInt();
		NumSum obj=new NumSum();
		System.out.println(obj.getSum(number));
		sc.close();
	}

}
