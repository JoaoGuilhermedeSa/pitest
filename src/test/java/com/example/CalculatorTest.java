package com.example;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

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
    
    // Incomplete test for isPrime - will show surviving mutants
    @Test
    public void testIsPrime() {
        assertFalse(calculator.isPrime(1));
        assertTrue(calculator.isPrime(2));
        assertTrue(calculator.isPrime(3));
        assertFalse(calculator.isPrime(4));
        assertTrue(calculator.isPrime(5));
        assertTrue(calculator.isPrime(7));
        assertFalse(calculator.isPrime(9));
        assertFalse(calculator.isPrime(25));
        assertFalse(calculator.isPrime(49));
        // Missing tests for larger primes and edge cases
    }
}