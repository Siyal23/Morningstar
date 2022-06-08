package com.morningstar.service;

import com.morningstar.model.Student;

public interface StudentService {
	public boolean addStudent(Student student);
	public Student findByStudentId(int studentId);
}
