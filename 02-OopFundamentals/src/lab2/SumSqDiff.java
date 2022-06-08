package lab2;

import java.util.Scanner;

public class SumSqDiff {
	public static int sumOfSquares(int num) {
		int sqSum=0;
		while(num>0) {
			sqSum=+(num*num);
			num--;
		}
		return sqSum;
	}
	public static int squareOfSum(int num) {
		int sum=0;
		while(num>0) {
			sum=sum+num;
			num--;
		}
		int res=sum*sum;
		return res;
	}

	public static int computeDifference(int num) {
		int sumOfSqrs=sumOfSquares(num);
		int sqOfSum=squareOfSum(num);
		int diff=sumOfSqrs-sqOfSum;
		return diff;
	}
	
	public static void main(String[] args) {
		System.out.println("Enter a number:");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println(computeDifference(num));
	}
}
