package com.mkj.restapp.SpringBootRestDemo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mkj.restapp.SpringBootRestDemo.bean.Instructor;
import com.mkj.restapp.SpringBootRestDemo.dao.InstructorRepository;

@Service
public class InstructorServiceImpl implements InstructorService{

	@Autowired
	private InstructorRepository repository; 
	
	@Override
	@Transactional
	public List<Instructor> getAllInstructors() {
		return repository.findAll();
	}

	
}
