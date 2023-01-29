package com.example.demo.hello;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;

@Service
public class HelloService {

	@Autowired
	private StudentRepository studentRepository;
	@Autowired
	private TimeslotRepository timeslotRepository;

	public void addStudent(Student s) throws Exception {
		//Simple way
		//studentRepository.save(s);

		//Check first if exist already
		// in this way it could return HTTP 200 when it is able to save new entry
		// and 400, or 500 error with message when if fails
		Optional<Student> byId = studentRepository.findById(s.getName());
		if(!byId.isPresent())
			studentRepository.save(s);
	}

	public List<Student> getAllStudents() throws Exception {
		return studentRepository.findAll();
	}

	public List<Timeslot> getAllTimeslots() throws Exception {
		return timeslotRepository.findAll();
	}

}
