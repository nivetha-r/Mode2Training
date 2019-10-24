package com.jwt.service;

import java.util.List;

import com.jwt.model.Student;



public interface StudentService {
	
	public void addStudent(Student student);

	public List<Student> getAllStudent();

	public void deleteStudent(Integer studentId);

	public Student getStudent(int stuid);

	public Student updateStudent(Student student);
}
