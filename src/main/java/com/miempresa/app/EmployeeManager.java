package com.miempresa.app;
import com.miempresa.app.Employee;
import java.util.ArrayList;
import java.util.List;
/**
 * @version 1.0
 * @author David
 */
public class EmployeeManager {
ArrayList<Employee> lista = new ArrayList<Employee>();
String[] employeeNames = new String[10];
int[] employeeYears = new int[10];
int numberOfEmployees = 0;
/**
 * 
 * @param name
 * @param years
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

public static void main(String[] args) {
EmployeeManager manager = new EmployeeManager();
manager.addEmployee("John Doe", 5);
manager.addEmployee("Jane Smith", 2);
manager.printEmployees();
}
}