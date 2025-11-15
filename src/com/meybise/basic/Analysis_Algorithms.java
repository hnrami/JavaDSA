package com.meybise.basic;

import java.math.BigInteger;

public class Analysis_Algorithms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("====================countDiguit");
		coutDigit();
		System.out.println("====================Pelindrome-Number================");
		
		System.out.println(pelindromeNumber(1));
		
		System.out.println("====================Pelindrome-Number-case1================");
		System.out.println(pelindromeNumber_case(12121));
		
		System.out.println("====================factorial");
		
		factorial(15);
		System.out.println();
		System.out.println("====================end factorial");
		  int number = 15; // Example number

	        // Compute factorial
	        BigInteger factorial = computeFactorial(number);
	        System.out.println("Factorial of " + number + " is: " + factorial);

	        // Count trailing zeros
	        int trailingZeros = countTrailingZeros(number);
	        System.out.println("Number of trailing zeros in " + number + "! is: " + trailingZeros);
	}
	
	
	public static void coutDigit() {
		
		int input=0;
		int count=0;
		
		while(input>0) {
			
			input=input/10;
			count+=1;
		}
		
		System.out.println(count);
		
	}
	
	public static Boolean pelindromeNumber(int pelindrome) {
		String resultInput = String.valueOf(pelindrome);
		String reversedInput= new StringBuilder(resultInput).reverse().toString();
		return reversedInput.equals(resultInput);
		
	}
	
	public static Boolean pelindromeNumber_case(int pelindrome) {
		
		//1221
		// X%10 we get value of last number 
		// x=x/10 we get entire number except from last number 
		
		int originalInput=pelindrome;
		int reversed=0;
		
		if(pelindrome<0)
			return false;
		
		while(pelindrome>0) {
			
			int lastDigit = pelindrome %10;
			reversed = reversed *10+lastDigit;
			pelindrome=pelindrome/10;
			
		}
		
		return originalInput==reversed;
		
		
	}
	
	public static void factorial(int input) {
		
		
		int sum=1;
		while(input>0) {
			
			sum=sum*input;
			input=input-1;
		}
		System.out.println("factorial::: "+sum);
		String coutZero=String.valueOf(sum);
		
		//find zero from result;
		long numberoZero= coutZero.chars().filter(x -> x=='0').count();
		
		
		System.out.println("numberoZero:::  "+numberoZero);
	}
	
	
	 // Method to compute the factorial of a number
    public static BigInteger computeFactorial(int n) {
        BigInteger factorial = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        return factorial;
    }

    // Method to count trailing zeros in the factorial of a number
    public static int countTrailingZeros(int n) {
        int count = 0;
        while (n >= 5) {
            n /= 5;
            count += n;
        }
        return count;
    }
	

}
