package org.lesson.calculator;

public class Calculator {
	
	public float add(float num1, float num2) {
		return num1 + num2;
	}
	public float subtract(float num1, float num2) {
		return num1 - num2;
	}
	public float multiply(float num1, float num2) {
		return num1 * num2;
	}
	public float divide(float num1, float num2) throws Exception {
		if(num1 == 0 || num2 == 0) {
			throw new Exception("Operazione non eseguibile, un parametro ha valore 0");
		}
		return num1 / num2;
	}
}
