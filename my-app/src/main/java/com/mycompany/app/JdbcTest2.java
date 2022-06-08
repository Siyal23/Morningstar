package com.mycompany.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcTest2 {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
			String sql="Select Employee_Id,Last_Name,Salary FROM employees";
			Statement stmt= con.createStatement();
			ResultSet rs=stmt.executeQuery(sql);
			while(rs.next()) {
				int employeeId=rs.getInt("Employee_Id");
				String employeeName=rs.getString("Last_Name");
				double salary=rs.getDouble("Salary");
				System.out.println("Employee Id:"+employeeId+" Employee Name:"+employeeName+" Salary:"+salary);
			}
		} catch (ClassNotFoundException e) {
			System.out.println("Driver class not found");
		} catch (SQLException e) {
			System.out.println("Unable to connect");
		}
	}

}
