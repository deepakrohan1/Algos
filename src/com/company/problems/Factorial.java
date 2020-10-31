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
}
