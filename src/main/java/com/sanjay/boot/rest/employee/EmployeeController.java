package com.sanjay.boot.rest.employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeSevice;
	
	@RequestMapping(method = RequestMethod.GET, path = "employee")
	public List getAllEmployee() {
		return employeeSevice.getEmployeeDetails();		
	}
	
	
	@RequestMapping(method = RequestMethod.GET, path = "employee/{id}")
	public EmployeeDetails getAllEmployee(@PathVariable Long id) {
		return employeeSevice.getEmployeeDetailsById(id);
		
	}
	
	@RequestMapping(method = RequestMethod.POST, path = "employee")
	public ResponseEntity createEmployeeDetails(@RequestBody EmployeeDetails employeeDetails) {
		employeeSevice.createEmployeeDetails(employeeDetails);
		return new ResponseEntity(HttpStatus.CREATED);
	}
	

}
