package com.learn.springboot.crud.controller;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.learn.springboot.crud.entity.Student;
import com.learn.springboot.crud.repository.CrudRepositry;
import com.learn.springboot.crud.service.StudentService;

@RestController
@RequestMapping("/student")
public class SBCrudController {
	@Autowired
	private StudentService service;
	
	
//	@RequestMapping("/hi")
//	public String sayHi() {
//		return "Hi Spring Boot with Eclipse...!!";
//	}
	
	@GetMapping("/")
	public List<Student> getAllStudents(){
		return service.getAll();
	}
	@GetMapping("/{student_id}")
	public Optional<Student> retriveStudnet(@PathVariable("student_id") int id) {
		return service.getStudentById(id);
	}
	
	@PostMapping("/")
	public Student saveUser(@RequestBody Student st) throws Exception{
		service.saveStd(st);
		if(st== null) {
			throw new Exception("while save User u not found ="+st);
		}
		return st;
	}
	
	@DeleteMapping("/{student_id}")
	public int removing(@PathVariable("student_id") int id) {
		service.deleteStudent(id);
		return id;
	}
	
	@PutMapping("/{student_id}")
	public long addStudent(@RequestBody Student st, @PathVariable("student_id")long id){
		service.saveStd(st);
		return st.getStudentId();
	}

}
