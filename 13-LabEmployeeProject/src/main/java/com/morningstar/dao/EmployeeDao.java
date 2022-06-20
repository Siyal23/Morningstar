package com.morningstar.dao;

import java.sql.SQLException;
import java.util.List;

import com.morningstar.model.Employee;

public interface EmployeeDao {
	public int createEmployee(Employee employee) throws SQLException;
	public boolean deleteEmployee(int employee_id) throws SQLException;
	public int updateEmployee(int employee_id,Employee employee) throws SQLException;
	public Employee findById(int employee_id) throws SQLException;
	public List<Employee> getAllEmployees() throws SQLException;
	public Employee findByName(String employee_name) throws SQLException;
}

