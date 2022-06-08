package lab1;

import java.util.Scanner;

public class Ex1 {
	
	public static int sumOfDigits(int num) {
		int sum=0;
		while(num>0) {
			int temp=num%10;
			sum+=temp;
			num=num/10;
		}
		return sum;
	}
	public static void main(String[] args) {
		System.out.println("Enter a Number:");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		System.out.println(sumOfDigits(num));
	}

}
