package com.solutions3;

import java.util.Scanner;


public class Factorial {

	public static void main(String[] args) {
		System.out.println("Factorial of a number");
		System.out.print("Enter a number : ");
		try(Scanner io =  new Scanner(System.in)) {
			int number = io.nextInt();
			if (validate(number)) {
				System.out.println(findFactorial(number));	
			}
			else {
					System.out.println("negative values not allowed");
				
			}
			
		} catch (Exception e) {
			System.out.println("Something went wrong");
		}

	}

	static int findFactorial(int num) {
		int factorial=num;
		if (num!=0) {
			factorial = num * findFactorial(num-1);
//			System.out.println(factorial);
//			System.out.println("in side");
		}
		else  {
			factorial=1;
		}
		return factorial;
	}
	
	static boolean validate(int num) {
		if (num<0) {
			return false;
		}
		return true;
	}
}
