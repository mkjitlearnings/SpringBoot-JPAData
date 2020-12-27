package com.mkj.restapp.SpringBootRestDemo.ctr;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mkj.restapp.SpringBootRestDemo.bean.Instructor;

import com.mkj.restapp.SpringBootRestDemo.execptions.DuplicateInstructorIdException;
import com.mkj.restapp.SpringBootRestDemo.service.InstructorService;

@RestController
public class InstructorController {

	@Autowired
	InstructorService service;
	
	public InstructorController() {
		super();
		System.out.println(" Inside default contructor called ...");
		// TODO Auto-generated constructor stub
	}

	
	
	@GetMapping("/")
	public String  abd()
	{
		return "ytftydftyd";
	}

	@GetMapping("/instructor/info")
	public List<Instructor> getInstructorInfo()
	{
		System.out.println(" get Mapping called ");
		return service.getAllInstructors();
	}

	

	
	
	
	
}
