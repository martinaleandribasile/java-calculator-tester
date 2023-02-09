package org.lesson.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class testCalculator {
	Calculator calculator = null;
	@Test
	@DisplayName("Test metodo ADD")
	public void testAdd() {
		calculator=new Calculator();
		float result = calculator.add(35,5);
		assertEquals(result, 40);
	}
	@Test
	@DisplayName("Test metodo SUBTRACT")
	public void testSubtract() {
		calculator=new Calculator();
		float result = calculator.subtract(35, 5);
		assertEquals(result, 30);
	}
	@Test
	@DisplayName("Test metodo MULTIPLY")
	public void testMultiply() {
		calculator=new Calculator();
		float result = calculator.multiply(35, 5);
		assertEquals(result, 175);
	}
	@Test
	@DisplayName("Test metodo DIVIDE")
	public void testDivide() throws Exception {
		calculator=new Calculator();
		float result = calculator.divide(35, 5);
		assertEquals(result, 7);
	}
	@Test
	@DisplayName("Test per ECCEZIONI metodo DIVIDE")
	public void testException() throws Exception {
		calculator= new Calculator();
		assertThrows(Exception.class,()->calculator.divide(0, 5));
	}
	
}
