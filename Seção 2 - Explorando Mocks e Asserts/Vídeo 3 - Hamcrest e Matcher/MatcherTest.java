package com.teste;

import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.hamcrest.Matchers;
import org.hamcrest.beans.HasProperty;
import org.hamcrest.object.HasToString;
import org.junit.Test;

public class MatcherTest {
	
	@SuppressWarnings("deprecation")
	@Test
	public void givenBean_checkToString() {
		Person person = new Person("Barrack", "Obama");
		String str = person.toString();
		assertThat(person, HasToString.hasToString(str));
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void givenBean_checkPropertyExists() {
		Person person = new Person("Barrack", "Obama");
		assertThat(person, HasProperty.hasProperty("name"));
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void givenCollection_checkEmpty() {
		List<String> emptyList = new ArrayList<String>();
		assertThat(emptyList, Matchers.empty());
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void givenAnInteger_checkGreater() {
		assertThat(1, Matchers.greaterThan(0));
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void givenString_checkNull() {
		String str = null;
		assertThat(str, Matchers.isEmptyOrNullString());
	}

}