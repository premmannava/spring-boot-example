package com.example.rest.webservices.restfulwebservices.student;

import java.util.Date;

public class Student {
Integer id;
String name;
Date dob;
public Student(int id, String name, Date dob) {
	super();
	this.id = id;
	this.name = name;
	this.dob = dob;
}

protected Student() {
	super();
}

public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Date getDob() {
	return dob;
}
public void setDob(Date dob) {
	this.dob = dob;
}


}
