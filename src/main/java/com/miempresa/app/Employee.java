package com.miempresa.app;

public class Employee {
	private int años;
	private String nombre;
	
	public Employee(String nombre, int años) {
		this.años=años;
		this.nombre=nombre;
	}

	public int getAños() {
		return años;
	}

	public String getNombre() {
		return nombre;
	}

	@Override
	public String toString() {
		return "Empleado: " + this.nombre + ", Años en la empresa: " + this.años ;
	}
	
}
