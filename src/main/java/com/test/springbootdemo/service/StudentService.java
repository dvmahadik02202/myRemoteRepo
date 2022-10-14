package com.test.springbootdemo.service;

import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.test.springbootdemo.dao.StudentDao;
import com.test.springbootdemo.entity.Student;
@Service
public class StudentService {

	public static ArrayList<Student> fletchStudent() throws ClassNotFoundException, SQLException {
		ArrayList<Student> alstu = StudentDao.fletchStudent();

		
		/*
		 * ArrayList<Student>alstufiltered=new ArrayList<Student>();
		 * 
		 * for(Student Student:alstu) { if (Student.getName().startsWith("m")&&
		 * (Student.getSalary()>50000)){ //System.out.println(Student);
		 * 
		 * alstufiltered.add(Student); }}
		 */
		
		return alstu;
	}
}
