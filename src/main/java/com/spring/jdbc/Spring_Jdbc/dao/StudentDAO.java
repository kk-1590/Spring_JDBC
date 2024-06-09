package com.spring.jdbc.Spring_Jdbc.dao;

import java.util.List;

import com.kk.jdbc.Spring_Jdbc.dao.entities.Student;

public interface StudentDAO {
	public int insert(Student student);
	
	public int change(Student student);
	
	public int delete(int studentId);
	
	public Student getStudent(int studentId);
	
	public List<Student> getAllStudents();
}
