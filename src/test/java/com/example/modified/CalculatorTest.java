package com.example.modified;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

	private Calculator calculator;

	@Before
	public void setUp() {
		calculator = new Calculator();
	}

	@Test
	public void testAdd() {
		assertEquals(5, calculator.add(2, 3));
		assertEquals(0, calculator.add(-1, 1));
		assertEquals(-5, calculator.add(-2, -3));
	}

	@Test
	public void testSubtract() {
		assertEquals(2, calculator.subtract(5, 3));
		assertEquals(-2, calculator.subtract(3, 5));
		assertEquals(0, calculator.subtract(5, 5));
	}

	@Test
	public void testMultiply() {
		assertEquals(15, calculator.multiply(3, 5));
		assertEquals(0, calculator.multiply(0, 5));
		assertEquals(-10, calculator.multiply(-2, 5));
	}

	@Test
	public void testDivide() {
		assertEquals(2.5, calculator.divide(5, 2), 0.001);
		assertEquals(-2.0, calculator.divide(-4, 2), 0.001);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testDivideByZero() {
		calculator.divide(5, 0);
	}

	@Test
	public void testIsEven() {
		assertTrue(calculator.isEven(4));
		assertFalse(calculator.isEven(3));
		assertTrue(calculator.isEven(0));
	}

	@Test
	public void testFactorial() {
		assertEquals(1, calculator.factorial(0));
		assertEquals(1, calculator.factorial(1));
		assertEquals(24, calculator.factorial(4));
		assertEquals(120, calculator.factorial(5));
	}

	@Test(expected = IllegalArgumentException.class)
	public void testFactorialNegative() {
		calculator.factorial(-1);
	}

	@Test
	public void testMax() {
		assertEquals(5, calculator.max(3, 5));
		assertEquals(5, calculator.max(5, 3));
		assertEquals(5, calculator.max(5, 5));
	}

	@Test
	public void testIsPrime() {
		assertFalse(calculator.isPrime(0));
		assertFalse(calculator.isPrime(1));
		assertTrue(calculator.isPrime(2));
		assertTrue(calculator.isPrime(3));
		assertFalse(calculator.isPrime(4));
		assertTrue(calculator.isPrime(5));
		assertFalse(calculator.isPrime(6));
		assertTrue(calculator.isPrime(7));
		assertFalse(calculator.isPrime(8));
		assertFalse(calculator.isPrime(9));
		assertFalse(calculator.isPrime(10));
		assertTrue(calculator.isPrime(11));
		assertTrue(calculator.isPrime(13));
		assertFalse(calculator.isPrime(25));
		assertFalse(calculator.isPrime(49));
		assertTrue(calculator.isPrime(97));
		assertFalse(calculator.isPrime(100));
	}

	// This test will kill the mutants
	@Test
	public void testSumOfArray() {
		int[] numbers = {};
		assertEquals(0, calculator.sumOfArray(numbers));

		int[] numbers2 = { 1, 2, 3, 4, 5 };
		assertEquals(15, calculator.sumOfArray(numbers2));
	}
}
