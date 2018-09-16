package com.sanjay.boot.rest.employee;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name = "Employee_Details")
public class EmployeeDetails {
	
	@Id
	@SequenceGenerator(name="employee_id_seq",sequenceName="employee_id_seq",initialValue=205, allocationSize=12)
	@GeneratedValue(strategy= GenerationType.IDENTITY, generator="employee_id_seq")
	@Column(name="\"id\"",unique=true,nullable=false)
	Long id;
	
	String name;
	String email;
	String address;
	
	
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	
	@Column(name = "name")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Column(name = "email")
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Column(name = "address")
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

}
