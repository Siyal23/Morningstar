package com.morningstar.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.morningstar.dao.EmployeeDao;
import com.morningstar.dao.EmployeeDaoImpl;
import com.morningstar.model.Employee;

public class EmployeeServiceImpl implements EmployeeService{
	private EmployeeDao employeeDao;

	public EmployeeDao getEmployeeDao() {
		return employeeDao;
	}

	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}
	
	public void displayMenu() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Welcome to employee management application\r\n"
				+ "1.Add employee.\r\n"
				+ "2.Show all employee.\r\n"
				+ "3.Find employee by id.\r\n"
				+ "4.Find employee by name.\r\n"
				+ "5.Delete employee.\r\n"
				+ "6.Update employee.\r\n"
				+ "Enter your choice:");
		int choice=sc.nextInt();
		switch(choice) {
			case 1:
				
				int id;
				String name;
				float salary;
				int deptId;
				
				System.out.println("Enter Employee Id:-");
				id=sc.nextInt();
				
				System.out.println("Enter Employee Name:-");
				name=sc.next();
				sc.nextLine();
				
				System.out.println("Enter Employee Salary:-");
				salary=sc.nextFloat();
				
				System.out.println("Enter Employee department number:-");
				deptId=sc.nextInt();
				
				Employee emp=new Employee(id, name, salary, deptId);
				
				if (addEmployee(emp)) {
					System.out.println("Employee added.");
				} else {
					System.out.println("Some error occured enter details again.");
				}
				
				break;
		
			case 2:
				List<Employee> emps=getAllEmployees();
				for(Employee e:emps) {
					System.out.println(e.getEmployee_id());
					System.out.println(e.getEmployee_name());
					System.out.println(e.getEmployee_salary());
					System.out.println(e.getDepartment_id());
					System.out.println("----------------------------------------");
				}
				break;
		
			case 3:
				
				System.out.println("Enter employee id:");
				int id2=sc.nextInt();
				emp=findById(id2);
				if(emp!=null) {
					System.out.println("Employee id:"+emp.getEmployee_id());
					System.out.println("Employee Name:"+emp.getEmployee_name());
					System.out.println("Salary:"+emp.getEmployee_salary());
					System.out.println("Department id:"+emp.getDepartment_id());
				}
				else {
					System.out.println("Data not present");
				}
				break;
			case 4:
				System.out.println("Enter employee name:");
				String name1;
				
				name1=sc.next();
				sc.nextLine();
				
				emp=findByName(name1);
				if(emp!=null) {
					System.out.println("Employee id:"+emp.getEmployee_id());
					System.out.println("Employee Name:"+emp.getEmployee_name());
					System.out.println("Salary:"+emp.getEmployee_salary());
					System.out.println("Department id:"+emp.getDepartment_id());
				}	
				break;
			case 5:
				System.out.println("Enter Employee Id:");
				int empId=sc.nextInt();
				boolean deleteResult=deleteEmployee(empId);
				if(deleteResult) {
					System.out.println("Data Successfully deleted");
				}
				else {
					System.out.println("Data not present");
				}
				break;
			case 6:
				System.out.println("Enter Employee Id:");
				int empId1=sc.nextInt();
				boolean result=updateEmployee(empId1);
				if(result) {
					System.out.println("Data is updated successfully");
				}
				else {
					System.out.println("Some error occured while updating data");
				}
				break;
			default:
				System.out.println("Enter Valid Value");
		}
				
		
	}

	@Override
	public boolean addEmployee(Employee employee) {
		 System.out.println(employee.getEmployee_id());
			try {
				int result=employeeDao.createEmployee(employee);
				System.out.println(result);
				if(result>=1) {
					EmployeeDaoImpl.getConnection().commit();
					return true;
				}
			} catch (SQLException e) {
				try {
					EmployeeDaoImpl.getConnection().rollback();
				}
				catch(SQLException e2) {
					e2.printStackTrace();
				}
			}
			return false;
	}

	@Override
	public boolean deleteEmployee(int employee_id) {
		try {
			boolean result=employeeDao.deleteEmployee(employee_id);
			if(result) {
				return result;
			}
		}
		catch(SQLException e) {
			System.out.println("Employee not present.");
		}
		return false;
	}

	@Override
	public boolean updateEmployee(int employee_id) {
		Scanner sc=new Scanner(System.in);
		
		String name;
		float salary;
		int deptId;
		try {
			Employee emp=employeeDao.findById(employee_id);
			if(emp!=null) {
				System.out.println("Enter Employee Name:-");
				name=sc.next();
				sc.nextLine();
				
				System.out.println("Enter Employee Salary:-");
				salary=sc.nextFloat();
				
				System.out.println("Enter Employee department number:-");
				deptId=sc.nextInt();
				
				emp.setEmployee_name(name);
				emp.setEmployee_salary(salary);
				emp.setEmployee_id(deptId);
				int result=employeeDao.updateEmployee(employee_id, emp);
				if(result!=0) {
					return true;
				}
				else {
					return false;
				}
			}
		}
		catch(SQLException e){
			System.out.println("Data not present.");
		}
		return false;
	}

	@Override
	public Employee findById(int employee_id) {
		Employee employee=null;
		try {
			employee=employeeDao.findById(employee_id);
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return employee;
	}

	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> list=null;
		try {
			list=employeeDao.getAllEmployees();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public Employee findByName(String employee_name) {
		Employee employee=null;
		try {
			employee=employeeDao.findByName(employee_name);
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return employee;
	}
	
	
}
