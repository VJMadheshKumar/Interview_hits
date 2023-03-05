package com.testpress;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		System.out.print("Enter a numebr to check wheather it was a prime number or not:");
		Scanner io = new Scanner(System.in);
		int num = io.nextInt();
		Prime call = new Prime();
		if (call.isPrime(num)) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
		
	}
	boolean isPrime(int n){
		  if (n <= 1) {  
	           return false;  
	       }  
	       for (int i = 2; i <= Math.sqrt(n); i++) {  
	           if (n % i == 0) {  
	               return false;  
	           }  
	       }  
	       return true;
	}

}
