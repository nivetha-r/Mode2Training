package com.nivi;

import java.util.List;

import javax.swing.plaf.synth.SynthSeparatorUI;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class Main {
	public static void main(String[] args) {
		Configuration cfg=new AnnotationConfiguration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Query q=s.createQuery("from Employee");
		q.setFirstResult(2);
		q.setMaxResults(5);
		
		// this s for salary aftr 1000 executed
//		Criteria c=s.createCriteria(Employee.class);
//		c.add(Restrictions.gt("basic", 10000));
//		List<Employee> list=c.list();
//		
//		for(Employee employee : list) {
//			System.out.println("Empno " +employee.getEmpno());
//			System.out.println("Name " +employee.getName());
//			System.out.println("Dept " +employee.getDept());
//			System.out.println("Desig " +employee.getDesig());
//			System.out.println("Salary " +employee.getBasic());
//			System.out.println("------------------");
//		}
		//names in ascending order
//		Criteria a=s.createCriteria(Employee.class);
//		a.addOrder(Order.asc("name"));
//		List<Employee> list1=a.list();
//		
//		for(Employee employee : list1) {
//			System.out.println("Empno " +employee.getEmpno());
//			System.out.println("Name " +employee.getName());
//			System.out.println("Dept " +employee.getDept());
//			System.out.println("Desig " +employee.getDesig());
//			System.out.println("Salary " +employee.getBasic());
//			System.out.println("------------------");
//		}
		//Only names alone executed
		Criteria b=s.createCriteria(Employee.class);
		b.setProjection(Projections.property("name"));
		List<String> list2=b.list();
		 for (String employee : list2) {
			 System.out.println("Name :"+employee);
			
		}
		 sf.close();
	}
}
