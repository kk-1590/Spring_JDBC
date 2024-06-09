package com.spring.jdbc.Spring_Jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.kk.jdbc.Spring_Jdbc.dao.entities.Student;
import com.spring.jdbc.Spring_Jdbc.dao.StudentDAO;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
		/*
		 * ApplicationContext context = new
		 * ClassPathXmlApplicationContext("com/spring/jdbc/Spring_Jdbc/config.xml");
		 */
    	
    	ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);
        
		/*
		 * JdbcTemplate jdbcTemplate =
		 * context.getBean("jdbcTemplate",JdbcTemplate.class);
		 * 
		 * //insert String query = "insert into student(id,name,city) values (?,?,?)";
		 * 
		 * int res = jdbcTemplate.update(query,789,"Mohit","Agra");
		 * System.out.println("number of records inserted " + res);
		 */
        
        StudentDAO studentDao = context.getBean("studentDao",StudentDAO.class);
        
		/*
		 * Student student = new Student(); student.setId(666); student.setName("John");
		 * student.setCity("Mathura");
		 * 
		 * int result = studentDao.insert(student); System.out.println("student added "
		 * + result);
		 */
        
		/*
		 * Student student = new Student(); student.setId(666); student.setName("Jay");
		 * student.setCity("Delhi");
		 * 
		 * int result = studentDao.change(student); System.out.println("data changed " +
		 * result);
		 */
                        
		/*
		 * int result = studentDao.delete(789); System.out.println("rows deleted " +
		 * result);
		 */
        
		/*
		 * Student student = studentDao.getStudent(456); System.out.println(student);
		 */
        
        List<Student> students = studentDao.getAllStudents();
        for(Student student : students) {
        	System.out.println(student);
        }
    }
}
