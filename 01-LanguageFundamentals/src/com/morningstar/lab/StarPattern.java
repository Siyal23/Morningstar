package com.morningstar.lab;

public class StarPattern {

	public static void main(String[] args) {
	
		
		  for(int i=0; i<9; i+=3) 
		  { 
			  for(int j=0; j<i+1; j+=3)
		  { 
				  System.out.print(" *");
		  } 
			  System.out.println();
		  }
	}
}
