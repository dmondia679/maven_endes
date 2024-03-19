package com.miempresa.app;

public class Employee {
	private int anyos;
	private String nombre;
	
	public Employee(String nombre, int anyos) throws Exception {
		if(anyos < 0) {
			throw new Exception("No puede ser nagativo");
		}
		this.anyos=anyos;
		this.nombre=nombre;

	}

	public int getAnyos() {
		return anyos;
	}

	public void setAnyos(int anyos) {
		this.anyos = anyos;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	@Override
	public String toString() {
		return "Empleado: " + this.nombre + ", Años en la empresa: " + this.anyos;
	}
	
}
