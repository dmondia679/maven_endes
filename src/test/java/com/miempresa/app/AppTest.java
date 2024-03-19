package com.miempresa.app;
/*
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import com.miempresa.app.EmployeeManager;
import com.miempresa.app.Employee;
/**
 * Unit test for simple App.
 */

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AppTest 
{
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Inicio");
	}
	
	EmployeeManager gestor = new EmployeeManager();
    @Test
    @DisplayName("Establecer una prueba que de error dado a un número negativo como años en la empresa")
    public void limiteAños() throws Exception
    {
        Employee empleado = new Employee("Paco",-2);
        gestor.addEmployee(empleado.getNombre(), empleado.getAños());
        
        Integer numeroEsperado = -2;
        Integer numeroReal = empleado.getAños();
        assertEquals(numeroEsperado,numeroReal, "Deberá ser positivo");
}}
    /*
    @Test
    @DisplayName("Prueba que de error debido a un nombre de carácteres mayor a 25.")
    public void limiteCaracteres() throws Exception
    {
        Employee empleado = new Employee("Nombreconmasde25caracteres",5);
        gestor.addEmployee(empleado.getNombre(), empleado.getAños());
        
        if (empleado.getNombre().length() > 25) {
        	throw new IllegalArgumentException("El nombre no puede tener un número de carácteres mayor a 25.");
    }
        else {
        	System.out.println("Se ha creado el empleado.");
        }
    }}*/
