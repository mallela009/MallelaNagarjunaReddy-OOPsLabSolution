package com.greatlearning.model;

public class Employee {
	private String firstName;
	private String lastName;
	

public Employee() {
	firstName="";
	lastName="";	
}
public Employee(String firstName,String lastName) {
	this.firstName=firstName;
	this.firstName=lastName;
}
public void setfirstName(String firstName) {
	this.firstName=firstName;
	
}
public void setlastName(String lastName) {
	this.lastName=lastName;	
}
public String getFirstName() {
	return this.firstName;
}
public String getLastName() {
	return this.lastName;
	
}
}