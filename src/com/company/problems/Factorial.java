package com.company.problems;


/**
* 	Recursion problems Factoria and Fib series
**/

public class Factorial {
	
	public int calculateFactorial (int i) {
		if (i == 1)
			return 1;
		else 
			return i * calculateFactorial(i - 1);
	}
	
	public int calculateFib(int i) {
		if(i == 1 || i == 2)
			return 1;
		else 
			return calculateFib(i -1) + calculateFib(i - 2);
	}
}
