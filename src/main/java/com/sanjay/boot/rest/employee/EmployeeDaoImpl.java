package com.sanjay.boot.rest.employee;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.springframework.stereotype.Component;

@Component
public class EmployeeDaoImpl implements EmployeeDao {
	
    @PersistenceContext
    private EntityManager entityManager;

	@Override
	public List getEmployeeDetails() {
		Criteria criteria = entityManager.unwrap(Session.class).createCriteria(EmployeeDetails.class);
		return criteria.list();
	}

	@Override
	public EmployeeDetails getEmployeeDetailById(Long id) {
		// TODO Auto-generated method stub
		return entityManager.find(EmployeeDetails.class, id);
	}

	@Override
	public void createEmployeeDetails(EmployeeDetails employeeDetails) {
		// TODO Auto-generated method stub
		entityManager.persist(employeeDetails);
	}

}
