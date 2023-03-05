package com.solutions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		System.out.println("Enter a number to check wheater it was odd or even : ");
		
		try (Scanner io = new Scanner(System.in);){
			
			int number = io.nextInt();
			if (number%2==0) {
				System.out.println("Even number");
			} else {
				System.out.println("Odd number");
			}
		} catch (InputMismatchException e) {
			System.out.println("Numbers are only accepted as input");
		}
		
		
		

	}

}
