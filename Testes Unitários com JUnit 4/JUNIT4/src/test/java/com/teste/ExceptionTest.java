package com.teste;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.List;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ExceptionTest {
	
	@Test(expected = IndexOutOfBoundsException.class)
	public void empty() {
		new ArrayList<Object>().get(0);
	}
	
	@Test(expected = IndexOutOfBoundsException.class)
	public void empty2() {
		List<String> lista = new ArrayList<String>();
//		lista.add("Dimitri");
		
		lista.get(0);
	}
	
	@Rule
	public ExpectedException thrown = ExpectedException.none();
	
	@Test
	public void shouldTestExceptionMessage() throws IndexOutOfBoundsException {
		List<Object> list = new ArrayList<Object>();
		
		thrown.expect(IndexOutOfBoundsException.class);
		thrown.expectMessage("Index 0 out of bounds for length 0");
		list.get(0);
		
	}
	
	@Test
	public void testExceptionMessage() {
		try {
			new ArrayList<Object>().get(0);
			fail("Espero que IndexOutOfBoundsException seja lançada");			
		} catch (IndexOutOfBoundsException ex) {
			assertThat(ex.getMessage(), equalTo("Index 0 out of bounds for length 0"));
		}
	}	
	
}