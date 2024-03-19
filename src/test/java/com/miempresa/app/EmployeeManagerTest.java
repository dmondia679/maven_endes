/**
 * 
 */
package com.miempresa.app;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * 
 */
class EmployeeManagerTest {
	EmployeeManager gestor;
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		gestor = new EmployeeManager();
	}

	@Test
	@DisplayName("Establecer nombre y edad correcta")
	void testValidad() throws Exception {
		
	
	}

}
