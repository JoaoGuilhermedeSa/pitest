package com.example.original;

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

	// This method is way more complex, allowing more surviving mutants or needing way more test scenarios to safely cover all branches.
	public boolean isPrime(int n) {
		if (n <= 1) {
			return false;
		}
		if (n <= 3) {
			return true;
		}
		if (n % 2 == 0 || n % 3 == 0) {
			return false;
		}

		for (int i = 5; i * i <= n; i += 6) {
			if (n % i == 0 || n % (i + 2) == 0) {
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