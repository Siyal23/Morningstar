package lab5.Q4employee;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
		ArrayList<Employee> eArr=new ArrayList<Employee>();
		Employee e1=new Employee(100,"Siyal","CD",50000);
		Employee e2=new Employee(101,"Arnav","NGP",60000);

		eArr.add(e1);
		eArr.add(e2);

		System.out.println("Search Using \n 1.Employee id. \n 2.Employee name.");
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		switch(number) {
		case 1:
			System.out.println("Enter Employee id:");
			int id=sc.nextInt();
			for(Employee e:eArr) {
				if(e.getEmpId()==id) {
					System.out.println(e.toString());
				}
				else {
					System.out.println("Employee not found");
				}
			}
			break;
		case 2:
			System.out.println("Enter Employee Name:");
			String name;
			name=sc.next();
			for(Employee e:eArr) {
				if(e.getEmpName().equals(name)) {
					System.out.println(e.toString());
					break;
				}
				else {
					System.out.println("Employee not found.");
				}
			}
			break;
		}
		
	}

}
