package com.sanjay.boot.rest.employee;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class EmployeeService {
	
	@Autowired
	EmployeeDao employeeDao;
	
	public List getEmployeeDetails() {
		return employeeDao.getEmployeeDetails();
	}
	
	public EmployeeDetails getEmployeeDetailsById(Long employeeId) {
		return employeeDao.getEmployeeDetailById(employeeId);		
	}
	
	public void createEmployeeDetails(EmployeeDetails employeeDetails) {
		 employeeDao.createEmployeeDetails(employeeDetails);	
	}

}
