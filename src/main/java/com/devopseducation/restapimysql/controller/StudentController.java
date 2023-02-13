package com.devopseducation.restapimysql.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.devopseducation.restapimysql.model.Students;
import com.devopseducation.restapimysql.repository.StudentRepository;


@Controller 
@RequestMapping(path="/student") 
public class StudentController {
	
	@Autowired
	private StudentRepository studentRepository;	
	
	
	@PostMapping(path="/add") 
	public @ResponseBody String addNewUser (@RequestParam String firstName, @RequestParam String lastName) {
		try {
			Students student = new Students();
		    student.setFirstName(firstName);
		    student.setLastName(lastName);
		    studentRepository.save(student);
		   
		}catch(Exception e) {
			e.printStackTrace();
		}
		 return "Saved";
	}
	
	 @GetMapping(path="/all")
	 public @ResponseBody Iterable<Students> getAllStudents() {
	    return studentRepository.findAll();
	 }


}
