package com.example.rest.webservices.restfulwebservices.student;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class StudentDaoService {
  private static  List<Student> students = new ArrayList<>();
  private static int studentsCount = 3;
  static {
	  students.add(new Student(1, "Prem Mannava", new Date()));
	  students.add(new Student(2,"ravi",new Date()));
	  students.add(new Student(3,"rajesh", new Date()));
  }
  
  public List<Student> findAll() {
	  return students;
  }
  
  public Student save(Student s) {
	  if(s.getId()==null){
		  s.setId(++studentsCount);
	  }
	  students.add(s);
	  return s;
  }
    
  public Student removeStudent(int id) {
	  for(Student student : students) {
		  if(student.getId() == id) {
			  students.remove(student);
		  }
	  }
	  return null;
  }

  public Student findStudent(int id) {
	  for(Student student : students) {
		  if(student.getId() == id) {
			  return student;
		  }
	  }
	  return null;
  }
}
