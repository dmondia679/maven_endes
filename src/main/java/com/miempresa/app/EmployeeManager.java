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
 * @throws Exception 
 */
public void addEmployee(String name, int anyos) throws Exception {
Employee nuevo = new Employee(name,anyos);
lista.add(nuevo);
}
/**
 * Añade un empleado a una lista.
 */
public void printEmployees() {
System.out.println("List of employees:");
for (Employee empleado: lista) {
	System.out.println(empleado.toString());
	}
}
/**
 * Imprime los empleados de una lista.
 */
}