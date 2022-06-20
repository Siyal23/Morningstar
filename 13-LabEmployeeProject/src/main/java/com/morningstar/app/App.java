package com.morningstar.app;

import com.morningstar.dao.EmployeeDao;
import com.morningstar.dao.EmployeeDaoImpl;
import com.morningstar.service.EmployeeServiceImpl;

public class App 
{
    public static void main( String[] args )
    {
    	EmployeeServiceImpl service=new EmployeeServiceImpl();
    	EmployeeDao employeeDao=new EmployeeDaoImpl();
    	service.setEmployeeDao(employeeDao);
    	service.displayMenu();
    }
}
