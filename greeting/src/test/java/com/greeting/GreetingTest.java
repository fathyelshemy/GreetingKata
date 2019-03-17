package com.greeting;

import static org.junit.Assert.*;

import org.junit.Test;

public class GreetingTest {

	@Test
	public void greetTest() {
		Greeting greeting= new Greeting();
		assertEquals("Hello, Bob.", greeting.greet("Bob"));
	}

	@Test
	public void handleGreetTest() {
		Greeting greeting= new Greeting();
		assertEquals("Hello, my friend.", greeting.greet());
	}
	
	@Test
	public void handleShoutGreeting() {
		Greeting greeting= new Greeting();
		assertEquals("HELLO JERRY!", greeting.greet("JERRY"));
	}
	
	@Test
	public void handleVarargGreetingWith2Arguments() {
		Greeting greeting = new Greeting();
		assertEquals("Hello, Jill and Jane.", greeting.greet("Jill","Jane"));
	}
	
	@Test
	public void handleVarargGreetingWith3Arguments() {
		Greeting greeting = new Greeting();
		assertEquals("Hello, Amy, Brian, and Charlotte.", greeting.greet("Amy","Brian","Charlotte"));
	}
}
