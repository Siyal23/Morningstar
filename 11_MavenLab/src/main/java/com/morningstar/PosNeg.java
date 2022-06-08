package com.morningstar;

public class PosNeg {
	
	 public static boolean PNnum(int x) {
		  boolean flag=true;
		 if(x>=0) {
		 flag=true;
		 }
		 else {
			 flag=false;
		 }
		
		  return flag;
		 }
	 public static void main(String[] args) {
		 
		 if(PNnum(2)) {
			 System.out.println("Number is positive");
		 }
		 else {
			 System.out.println("Numberis negative");
		 }
		 if(PNnum(-1)) {
			 System.out.println("Number is positive");
		 }
		 else {
			 System.out.println("Numberis negative");
		 } 
	 }
}
