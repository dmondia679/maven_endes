package com.miempresa.app;

public class Employee {
	private int años;
	private String nombre;
	
	public Employee(String nombre, int anyos) throws Exception {
		this.años=años;
		this.nombre=nombre;
		if(anyos < 0) {
			throw new Exception("No puede ser nagativo");
		}
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
