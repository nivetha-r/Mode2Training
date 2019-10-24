package com.hcl.dao;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.hcl.model.Employee;




public class EmployeeDaoImpl implements EmployeeDao {
	@Autowired
	private SessionFactory sessionFactory;
	private Serializable employeeId;
	private Serializable id;

	
	@SuppressWarnings("unchecked")
	public List getAllEmployees() {

		return sessionFactory.getCurrentSession().createQuery("from employee")
				.list();
	}

	

	
}

	
	

