package com.teste;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;

public class CalculadoraTest {

	@Test
	public void testSomar() {
		Calculadora calc = new Calculadora();
		int soma = calc.somar("1+1+3");
		assertEquals(5, soma);
	}
	
	
	/*
	 * Adicionar no pom.xml a seguinte dependência:
	 * 
	 * <dependency> 
	 * 		<groupId>org.mockito</groupId>
	 * 		<artifactId>mockito-core</artifactId>
	 * 		<version>4.2.0</version>
	 * </dependency>
	 * 
	 */
	@Test
	public void testeSomarComMock() {
		Calculadora calculadora = mock(Calculadora.class);		
		when(calculadora.somar("1+2")).thenReturn(10);		
		int resultado = calculadora.somar("1+2");		
		assertEquals(10, resultado);		
	}

}