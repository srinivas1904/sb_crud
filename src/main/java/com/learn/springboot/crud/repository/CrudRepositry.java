package com.learn.springboot.crud.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.learn.springboot.crud.entity.Student;

@Repository
public interface CrudRepositry extends CrudRepository<Student, Long>{

}
