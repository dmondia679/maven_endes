package com.miempresa.app;
/*
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import com.miempresa.app.EmployeeManager;
import com.miempresa.app.Employee;
/**
 * Unit test for simple App.
 */

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AppTest 
{
	
	EmployeeManager gestor = new EmployeeManager();
    @Test
    @DisplayName("")
    public void limiteAños()
    {
        Employee empleado = new Employee("Paco",-2);
        gestor.addEmployee(empleado.getNombre(), empleado.getAños());
        
        if (empleado.getAños() < 0) {
        	throw new IllegalArgumentException("No puede tener un número negativo como años en la empresa.");
    }
        else {
        	System.out.println("Se ha creado el empleado.");
        }
}
    @Test
    public void limiteCaracteres()
    {
        Employee empleado = new Employee("Nombreconmasde25caracteres",5);
        gestor.addEmployee(empleado.getNombre(), empleado.getAños());
        
        if (empleado.getNombre().length() > 25) {
        	throw new IllegalArgumentException("El nombre no puede tener un número de carácteres mayor a 25.");
    }
        else {
        	System.out.println("Se ha creado el empleado.");
        }
    }}
