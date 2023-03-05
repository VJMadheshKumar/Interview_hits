package com.solutions;

import java.util.ArrayList;
import java.util.Scanner;



public class PrimeNumber {

	public static void main(String[] args) {
		System.out.println("Prime number list");
		System.out.println("Enter a number to to find all the prime numbers : ");
		ArrayList<Integer> array = new ArrayList<>();
		try (Scanner io = new Scanner(System.in)){
			int number = io.nextInt();
			for (int i = 2; i <= number; i++) {
		           if (isPrime(i)) {  
		               array.add(i);  
		           
		           }  
		       }
			System.out.println(array);
		} catch (Exception e) {
			System.out.println("Enter a valide input");
		}
	}
	public static boolean isPrime(int n) {  
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
