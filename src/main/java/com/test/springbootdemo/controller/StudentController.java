package com.test.springbootdemo.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.springbootdemo.entity.Student;
import com.test.springbootdemo.service.StudentService;

@RestController
@RequestMapping("/api")
public class StudentController {

	@GetMapping("/wel")
	public String getMessage() {

		return "WELCOME to spring boot world";
	}

	@GetMapping("/getallstudent")
	static ArrayList<Student> fletchStudent()throws Exception {
		ArrayList<Student>alstu=StudentService.fletchStudent();
		return alstu;
	}
	
	@GetMapping("/getstudentstartwithm")
	static ArrayList<Student> getstudentstartwithm()throws Exception {
		ArrayList<Student>alstu=StudentService.getstudentstartwithm();
		return alstu;
	}
}
