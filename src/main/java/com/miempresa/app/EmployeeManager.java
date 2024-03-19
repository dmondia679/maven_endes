package com.miempresa.app;
import java.util.ArrayList;
/**
 * @version 1.0
 * @author David
 */
public class EmployeeManager {
ArrayList<Employee> lista = new ArrayList<Employee>();
/**
 * 
 * @param name Nombre del empleado
 * @param years Años en la empresa
 */
public void addEmployee(String name, int years) {
Employee nuevo = new Employee(name,years);
lista.add(nuevo);
}

public void printEmployees() {
System.out.println("List of employees:");
for (Employee empleado: lista) {
	System.out.println(empleado.toString());
	}
}
}