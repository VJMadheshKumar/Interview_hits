package com.solutions3;

import java.util.Scanner;



public class PowerOfNumber {

	public static void main(String[] args) {
		System.out.println("Power of Number");
		System.out.println("Enter  base number");
		try (Scanner io = new Scanner(System.in)){
			int base = io.nextInt();
			System.out.println("Enter the power number");
			int power = io.nextInt();
			System.out.println(power(base,power));
			
		} catch (Exception e) {
			System.out.println("Enter a valide input");
		}

	}
	static int power(int base, int power) {
		int result = 1;
		if (power!=0) {
			result = base * power(base,power-1);
		}
		
		return result;
	}
}
