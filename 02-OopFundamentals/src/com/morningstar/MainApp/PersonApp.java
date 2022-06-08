package com.morningstar.MainApp;

import com.morningstar.oop2.Person;

public class PersonApp {

	public static void main(String[] args) {
			//local variables
			int x,y;
			Person obj1=new Person();
			obj1.getData("Siyal", "Patil", "Chandrapur");
			
			Person obj2=new Person();
			obj1.getData("Shailesh", "Dubey", "Mumbai");
			obj1.show();
			obj2.show();
	}

}
