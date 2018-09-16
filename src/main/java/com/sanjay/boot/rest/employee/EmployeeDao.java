package com.sanjay.boot.rest.employee;


import java.util.List;

public interface EmployeeDao {
	
	
	public List getEmployeeDetails();
	
	public EmployeeDetails getEmployeeDetailById(Long id);

	public void createEmployeeDetails(EmployeeDetails employeeDetails);

	
}
