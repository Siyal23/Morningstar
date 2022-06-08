package com.morningstar.service;

import java.sql.SQLException;

import com.morningstar.dao.StudentDao;
import com.morningstar.dao.StudentDaoImpl;
import com.morningstar.model.Student;

public class StudentServiceImpl implements StudentService{

	private StudentDao studentDao;
	
	@Override
	public boolean addStudent(Student student) {
		try {
			int result=studentDao.createStudent(student);
			if(result>=1) {
				StudentDaoImpl.getConnection().commit();
				return true;
			}
		} catch (SQLException e) {
			try {
				StudentDaoImpl.getConnection().rollback();
			}
			catch(SQLException e2) {
				//printing stacktrace in UI is a bad practice.
				//i will just leave it like that for this project.
				e2.printStackTrace();
			}
		}
		return false;
}

	@Override
	public Student findByStudentId(int studentId) {
		Student student=null;
		try {
			student=studentDao.readStudent(studentId);
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return student;
	}

	public StudentDao getStudentDao() {
		return studentDao;
	}

	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}
	
}
