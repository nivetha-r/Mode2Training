package com.nivi;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class NamedMainQuery {
	public static void main(String[] args) {
		Configuration cfg=new AnnotationConfiguration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Query q=s.createQuery("from Employee");
		q=s.getNamedQuery("HQL_GET_ALL_EMPLOYEE");
		q=s.getNamedQuery("SQL_GET_ALL_EMPLOYEE");
		List<Employee> list=q.list();
		for (Employee employee : list) {
			System.out.println(employee);
			
		}
		sf.close();
		
}
}
