package com.morningstar.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.morningstar.model.Student;

public class StudentDaoImpl implements StudentDao{
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
	public int createStudent(Student student) throws SQLException {
		String sql="INSERT INTO Student (Student_Id,Student_Name,Student_Score) VALUES (?,?,?)";
		PreparedStatement pstmt=connection.prepareStatement(sql);

		
		pstmt.setInt(1, student.getStudentId());
		pstmt.setString(2, student.getStudentName());
		pstmt.setDouble(3, student.getStudentScore());
		
		int result=pstmt.executeUpdate();
		pstmt.close();
		return result;
	}

	@Override
	public Student readStudent(int studentId) throws SQLException {
		String sql="SELECT * FROM Student WHERE Student_Id="+studentId;
		Statement stmt=connection.createStatement();
		ResultSet rs=stmt.executeQuery(sql);
		Student student=null;
		if(rs.next()) {
			int studId=rs.getInt("studentId");
			String studName=rs.getString("student_Name");
			double studScore=rs.getDouble("Student_Score");
			student=new Student(studId, studName, studScore);
		}
		stmt.close();
		return student;
	}

}
