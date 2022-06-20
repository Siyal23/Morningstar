package com.morningstar.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.morningstar.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao{
	private static Connection connection=null;

	public static Connection getConnection() {
		return connection;
	}
	
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
			connection.setAutoCommit(false);
		} catch (SQLException  | ClassNotFoundException e) {
			System.out.println("There is a problem:");
			e.printStackTrace();
		}
	}

	@Override
	public int createEmployee(Employee employee) throws SQLException {
		
		String sql="INSERT INTO employee(EMPLOYEE_ID,EMPLOYEE_NAME,EMPLOYEE_SALARY,DEPARTMENT_ID) VALUES (?,?,?,?)";
		System.out.println(employee.getDepartment_id());
		PreparedStatement pstmt=connection.prepareStatement(sql);
		pstmt.setInt(1, employee.getEmployee_id());
		pstmt.setString(2, employee.getEmployee_name());
		pstmt.setFloat(3, employee.getEmployee_salary());
		pstmt.setInt(4, employee.getDepartment_id());
		
		int result=pstmt.executeUpdate();
		pstmt.close();
		return result;
	}

	@Override
	public boolean deleteEmployee(int employee_id) throws SQLException {
		String sql="DELETE FROM employee WHERE employee_id=?";
		PreparedStatement pstmt=connection.prepareStatement(sql);
		pstmt.setInt(1, employee_id);
		boolean result=pstmt.execute();
		return result;
	}

	@Override
	public int updateEmployee(int employee_id,Employee emp) throws SQLException {
		String sql="UPDATE employee SET employee_name=?,employee_salary=?,department_id=? WHERE employee_id="+employee_id;
		PreparedStatement pstmt=connection.prepareStatement(sql);
		pstmt.setString(1, emp.getEmployee_name());
		pstmt.setFloat(2, emp.getEmployee_salary());
		pstmt.setInt(3, emp.getDepartment_id());
		
		int result=pstmt.executeUpdate();
		return result;
	}

	@Override
	public Employee findById(int employee_id) throws SQLException {
		String sql="SELECT * FROM employee WHERE employee_id="+employee_id;
		Employee employee=new Employee();
		PreparedStatement pstmt=connection.prepareStatement(sql);
		ResultSet rs=pstmt.executeQuery();
		
		if(rs.next()) {
			employee.setEmployee_id(rs.getInt("employee_id"));
			employee.setEmployee_name(rs.getString("employee_name"));
			employee.setEmployee_salary(rs.getInt("employee_salary"));
			employee.setDepartment_id(rs.getInt("department_id"));
		}
		else {
			System.out.println("Data not found");
		}
		
		return employee;
	}

	@Override
	public List<Employee> getAllEmployees() throws SQLException {
		List<Employee> employees=new ArrayList<>();
		String sql="SELECT * FROM employee";
		Statement stmt=connection.createStatement();
		ResultSet rs=stmt.executeQuery(sql);
		
		while(rs.next()) {
			int empId=rs.getInt("employee_id");
			String empName=rs.getString("employee_name");
			float empSalary=rs.getFloat("employee_salary");
			int empDept=rs.getInt("department_id");
			Employee employee=new Employee(empId, empName, empSalary,empDept);
			employees.add(employee);
		}
		return employees;
	}

	@Override
	public Employee findByName(String employee_name) throws SQLException{
		String sql="SELECT * FROM employee";
		Statement stmt=connection.createStatement();
		ResultSet rs=stmt.executeQuery(sql);
		Employee emp=new Employee();
		if(rs.next()) {
			emp.setEmployee_id(rs.getInt("employee_id"));
			emp.setEmployee_name(rs.getString("employee_name"));
			emp.setEmployee_salary(rs.getFloat("employee_salary"));
			emp.setDepartment_id(rs.getInt("department_id"));
		}
		return emp;
	}
	
	
}
