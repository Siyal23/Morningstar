package com.morningstar.book;

public class Book {
	//instance variable
	private String bookName;
	private String bookAuthor;
	private double bookPrice;
	private static double discount;//=>class variable
	//all the static members 
	/*
	 * static member of the class we can access it in he non static method
	 * we cannot access non static member of the class in the static method (IMPORTANT)
	 * */
	static {
		discount=10;
	}
	
	public void getData(String bookName,String bookAuthor,double bookPrice) {
		this.bookName=bookName;
		this.bookAuthor=bookAuthor;
		this.bookPrice=bookPrice;
	}
	public void showBookDetail() {
		System.out.println("Book Name:"+bookName);
		System.out.println("Book Author:"+ bookAuthor);
		System.out.println("Book Price:"+ bookPrice);
		System.out.println("Price after discount:"+ calculateDiscount());
	}
	
	public static void setDiscount(double discount) {
		Book.discount=discount;
		//notice how we did'nt use this keyword here.
		//its because we are referring it to as class variable and not object variable.
	}
	
	public double calculateDiscount() {
		double actualPrice=bookPrice-bookPrice*discount;
		return actualPrice;
	}
}
