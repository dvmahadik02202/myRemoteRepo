package com.test.springbootdemo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.test.springbootdemo.entity.Student;

@Repository
public class StudentDao {

	public static ArrayList<Student> fletchStudent() throws ClassNotFoundException, SQLException {

		System.out.println(1);
		// loading a class into memory
        Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println(2);
		
        Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
        System.out.println(3);
        
        String sql="SELECT*FROM Empdata.Employee";
        System.out.println(4);
        
        Statement Statement=connection.createStatement();
        System.out.println(5);
        ResultSet resultset=Statement.executeQuery(sql);
       
        ArrayList stlist=new ArrayList<>();
        
        while(resultset.next()) {
        	
        	int id=resultset.getInt(1);
        	String name=resultset.getString(2);
        	String dept=resultset.getString(3);
        	int salary=resultset.getInt(4);
        	
        	Student st=new Student(id, name, dept, salary);
       stlist.add(st);
       //System.out.println("id>>"+id);
       // System.out.println("name>>"+name);
        }
		return stlist;

	}
}
