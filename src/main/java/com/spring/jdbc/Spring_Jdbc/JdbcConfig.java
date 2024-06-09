package com.spring.jdbc.Spring_Jdbc;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.spring.jdbc.Spring_Jdbc.dao.StudentDAO;
import com.spring.jdbc.Spring_Jdbc.dao.StudentDAOImpl;

@Configuration
@ComponentScan(basePackages = {"com.spring.jdbc.Spring_Jdbc.dao"})
public class JdbcConfig {
	@Bean("ds")
	public DataSource getDataSource() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/springjdbc");
		ds.setUsername("root");
		ds.setPassword("admin123");
		return ds;
	}
	
	@Bean("jdbcTemplate")
	public JdbcTemplate getTemplate() {
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(getDataSource());
		return jdbcTemplate;
	}
	
	/*
	 * @Bean("studentDao") public StudentDAO getStudentDao() { StudentDAOImpl
	 * studentDao = new StudentDAOImpl(); studentDao.setJdbcTemplate(getTemplate());
	 * return studentDao; }
	 */
}
