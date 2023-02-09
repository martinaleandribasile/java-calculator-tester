package org.lesson.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class testCalculator {
	static Calculator calculator ;
	@BeforeAll
	static void initCalculator() {
		calculator= new Calculator();
	}
	@Test
	@DisplayName("Test metodo ADD")
	public void testAdd() {
		float result = calculator.add(35,5);
		assertEquals(result, 40);
	}
	@Test
	@DisplayName("Test metodo SUBTRACT")
	public void testSubtract() {
		float result = calculator.subtract(35, 5);
		assertEquals(result, 30);
	}
	@Test
	@DisplayName("Test metodo MULTIPLY")
	public void testMultiply() {
		float result = calculator.multiply(35, 5);
		assertEquals(result, 175);
	}
	@Test
	@DisplayName("Test metodo DIVIDE")
	public void testDivide() throws Exception {
		float result = calculator.divide(35, 5);
		assertEquals(result, 7);
	}
	@Test
	@DisplayName("Test per ECCEZIONI metodo DIVIDE")
	public void testException() throws Exception {
		assertThrows(Exception.class,()->calculator.divide(0, 5));
	}
	
}
