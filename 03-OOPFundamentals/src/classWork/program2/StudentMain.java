package classWork.program2;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Student sobj;
		ArrayList<Student> arrObj=new ArrayList<Student>();
		for(int i=0;i<1;i++) {
			
			System.out.println("Enter Student ID:");
			int id=sc.nextInt();
			
			System.out.println("Enter Name:");
			String name=sc.nextLine();
			sc.next();
			
			System.out.println("Contact Number:");
			long contactNo=sc.nextLong();
			
			System.out.println("Enter course:");
			String course=sc.nextLine();
			sc.next();
			
			System.out.println("Enter Fees:");
			float fees=sc.nextFloat();
			
			sobj=new Student(id,name,contactNo,course,fees);
			
			arrObj.add(sobj);
		}
		for(int i=0;i<arrObj.size();i++) {
			System.out.println(arrObj.get(i).getCourse());
		}
		
	}
}