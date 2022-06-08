package lab5.Q7;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class PhoneBook {

	public static void main(String[] args) {
		HashMap<String,Long> phoneBook=new HashMap<>();
		phoneBook.put("Siyal",7020646117L);
		phoneBook.put("Omkar",4151286L);
		phoneBook.put("Kulna",445153348L);
		
		System.out.println("Enter name to search a number:");
		String name;
		Scanner sc=new Scanner(System.in);
		name=sc.next();
		if(phoneBook.containsKey(name)) {
			System.out.println("Name:"+name+"Contact Number:"+phoneBook.get(name));
		}
		else {
			System.out.println("Phone number not found.");
		}
		
		Iterator it=phoneBook.entrySet().iterator();
		
	}

}
