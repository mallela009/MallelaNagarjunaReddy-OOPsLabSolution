package com.greatlearning.service;

import java.util.Scanner;

import com.greatlearning.model.Employee;

public class DriverClass {
public static void main(String args[]) {
	Employee e = new Employee("Mallela","Nagarjuna Reddy");
	String generatedEmail;
	char[] generatedPassword;
	CredentialService cs= new CredentialService();
	Scanner scan = new Scanner(System.in);
	int choice;
	
	System.out.println("Please enter the Department from the following");
	System.out.println("1.Technical dept.");
	System.out.println("2.Admin dept.");
	System.out.println("3.Human Resource dept.");
	System.out.println("4.Legal dept.");
	
	choice = scan.nextInt();
	if(choice ==1) {
		generatedEmail=cs.generateEmailAddress(e.getFirstName(), e.getLastName(), "Technical");
		generatedPassword=cs.generatePassword();
		Employee employee;
		cs.showCredentials(e, generatedEmail, generatedPassword);
		
	}
	else if(choice ==2) {
		generatedEmail=cs.generateEmailAddress(e.getFirstName(), e.getLastName(), "Admin");
		generatedPassword=cs.generatePassword();
		Employee employee;
		cs.showCredentials(e, generatedEmail, generatedPassword);
	
	}
	else if(choice==3) {
		generatedEmail=cs.generateEmailAddress(e.getFirstName(), e.getLastName(), "Human resource");
		generatedPassword=cs.generatePassword();
		Employee employee;
		cs.showCredentials(e, generatedEmail, generatedPassword);
		
	}
	else if(choice==4) {
		generatedEmail=cs.generateEmailAddress(e.getFirstName(), e.getLastName(), "Legal");
		generatedPassword=cs.generatePassword();
		Employee employee;
		cs.showCredentials(e, generatedEmail, generatedPassword);
		
	}else {
		System.out.println("invalid choice");
	}
	
}
}
