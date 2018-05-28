package com.example.rest.webservices.restfulwebservices.student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController

public class StudentController {
@Autowired
private StudentDaoService service;

@GetMapping("/students")
public List<Student> retrieveAllStudents(){
return service.findAll();
}

@GetMapping("/students/retrieve/{id}")
public Student retrieveStudent(@PathVariable int id) {
	return service.findStudent(id);
}

@PostMapping("/students")
public Student createStudent(@RequestBody Student s) {
	return  service.save(s);
	
}

@GetMapping("/students/remove/{id}")
public Student removeStudent(@PathVariable int id) {
	return service.removeStudent(id);
}


}
