package com.learn.springboot.crud.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learn.springboot.crud.entity.Student;
import com.learn.springboot.crud.repository.CrudRepositry;

@Service
public class StudentService {
	@Autowired
	private CrudRepositry repo;
	
	public static List<Student> stdnt=new ArrayList<>();
	public static int count=3;
	static {
		stdnt.add(new Student("Jill Jck", "Jill Jck Address"));
		stdnt.add(new Student("Jack B", "Jack B Address"));
		stdnt.add(new Student("Ark Jack", "Ark Jack Address"));
	}
	/*
	 * get students data from database
	 */
	public List<Student> getAll() {
		System.out.println("Student service....");
		return (List<Student>) repo.findAll();
	}
	
	public Optional<Student> getStudentById(long id) {
		return repo.findById(id);
	}
	
	/*
	 * Student data saving method
	 */
	public String saveStd(Student st) {
		repo.save(st);
		return "Student data saved successfully....";
	}
	
	public void deleteStudent(long id) {
		repo.deleteById(id);
	}
	
	public void updateStudent(Student st, long id) {
		if (repo.existsById(id)) {
			repo.save(st);
		}
	}

}
