package com.mycompany.app;

import com.morningstar.dao.StudentDao;
import com.morningstar.dao.StudentDaoImpl;
import com.morningstar.model.Student;
import com.morningstar.service.StudentServiceImpl;

public class App 
{
    public static void main( String[] args )
    {
    	StudentServiceImpl service=new StudentServiceImpl();
    	StudentDao studentDao=new StudentDaoImpl();
    	service.setStudentDao(studentDao);
    	Student student=new Student(100, "Siyal Patil", 85);
    	
    	boolean result=service.addStudent(student);
    	if(result) {
    		System.out.println("Student data is added");
    	}
    	else {
    		System.out.println("Data is not added");
    	}
    }
}
