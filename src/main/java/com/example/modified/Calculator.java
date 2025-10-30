package com.example.modified;

public class Calculator {

	public int add(int a, int b) {
		return a + b;
	}

	public int subtract(int a, int b) {
		return a - b;
	}

	public int multiply(int a, int b) {
		return a * b;
	}

	public double divide(int a, int b) {
		if (b == 0) {
			throw new IllegalArgumentException("Division by zero is not allowed");
		}
		return (double) a / b;
	}

	public boolean isEven(int number) {
		return number % 2 == 0;
	}

	public int factorial(int n) {
		if (n < 0) {
			throw new IllegalArgumentException("Factorial is not defined for negative numbers");
		}
		if (n <= 1) {
			return 1;
		}
		return n * factorial(n - 1);
	}

	public int max(int a, int b) {
		if (a > b) {
			return a;
		} else {
			return b;
		}
	}

	public boolean isPrime(int n) {
		if (n <= 1) {
			return false;
		}
		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public int sumOfArray(int[] numbers) {
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		return sum;
	}
}