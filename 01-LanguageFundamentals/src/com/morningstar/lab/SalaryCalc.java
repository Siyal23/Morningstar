package com.morningstar.lab;

import java.util.Scanner;

public class SalaryCalc {
	
	int HRA;
	int DA;
	float res;
	public float getGrossSalary(int sal) {
		int HRA;
		int DA;
		float res=0;
		if(sal<=15000) {
			HRA=20;
			DA=70;
			res=(float) (sal+((float)HRA+DA)/100*sal);
		}
		else if(sal<=30000){
			HRA=35;
			DA=80;
			res=(float) (sal-sal*((HRA/100)+(DA/100)));
		}
		else {
			HRA=20;
			DA=80;
			res=(float) (sal-sal*(HRA/100+DA/100));
		}
		return res;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int salary=sc.nextInt();
		SalaryCalc obj=new SalaryCalc();
		System.out.println(obj.getGrossSalary(salary));
		sc.close();
	}
}
