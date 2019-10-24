package com.jwt.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jwt.model.Student;



@Repository
public class StudentDAOImpl implements StudentDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public void addStudent(Student student) {
		sessionFactory.getCurrentSession().saveOrUpdate(student);

	}

	@SuppressWarnings("unchecked")
	public List<Student> getAllStudent() {

		return sessionFactory.getCurrentSession().createQuery("from Student")
				.list();
	}

	
	public void deleteStudent(Integer studentId) {
		Student student = (Student) sessionFactory.getCurrentSession().load(
				Student.class, studentId);
		if (null != student) {
			this.sessionFactory.getCurrentSession().delete(student);
		}

	}

	public Student updateStudent(Student student) {
		// TODO Auto-generated method stub
		return null;
	}

	public Student getStudent(int stuid) {
		// TODO Auto-generated method stub
		return null;
	}

}