package com.hcl.javastreams.DAO;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hcl.javastreams.model.Employee;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {
	@Autowired
	private SessionFactory sessionFactory;
	
	@SuppressWarnings("unchecked")
	public List<Employee> getAllEmployee() {

		return sessionFactory.getCurrentSession().createQuery("from Employee")
				.list();
	}

}
