package com.morningstar.MainBookApp;

import com.morningstar.book.Book;

public class MainBookApp {

	public static void main(String[] args) {
		//Book.setDiscount(0.40);
		Book obj1=new Book();
		obj1.getData("The Alchemist", "Paulo Coelho", 500);
		
		obj1.showBookDetail();
		
	}

}
