package lab2;

import java.util.Scanner;

public class SumCalc {
	public static int computeSum(int num) {
		int sum=0;
		while(num>0) {
			if(num%4==0 || num%7==0) {
				sum=sum+num;
				
			}
			num--;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		System.out.println("Enter number:");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println(computeSum(num));
	}
}
