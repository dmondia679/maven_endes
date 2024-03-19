package com.miempresa.app;

import com.github.javafaker.Faker;

public class Main {

	public static void main(String[] args) throws Exception {
	
		Faker faker = new Faker();
		EmployeeManager manager = new EmployeeManager();
		
		
		manager.addEmployee("John Doe", 5);
		manager.addEmployee("Jane Smith", 2);
		for(int i=0; i<100; i++) {
		manager.addEmployee(faker.name().name(), faker.number().randomDigit());
		}
		manager.printEmployees();
		
		

	}

}
