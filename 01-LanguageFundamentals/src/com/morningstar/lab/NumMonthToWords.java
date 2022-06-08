package com.morningstar.lab;

import java.util.Scanner;

public class NumMonthToWords {
	
	public String convertMonthToWords(int month) {
		String monthAsText;
		switch(month) {
		case 1:
			monthAsText="January";
			return monthAsText;
		case 2:
			monthAsText="February";
			return monthAsText;
		case 3:
			monthAsText="March";
			return monthAsText;
		case 4:
			monthAsText="April";
			return monthAsText;
		case 5:
			monthAsText="May";
			return monthAsText;
		case 6:
			monthAsText="June";
			return monthAsText;
		case 7:
			monthAsText="July";
			return monthAsText;
		case 8:
			monthAsText="August";
			return monthAsText;
		case 9:
			monthAsText="September";
			return monthAsText;
		case 10:
			monthAsText="October";
			return monthAsText;
		case 11:
			monthAsText="November";
			return monthAsText;
		case 12:
			monthAsText="December";
			return monthAsText;
		default:
			return "Invalid Value";
	}
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter month in number:");
		int month=sc.nextInt();
		NumMonthToWords obj=new NumMonthToWords();
		obj.convertMonthToWords(month);
	}

}
