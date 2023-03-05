package com.solutions2;

import java.util.Scanner;


public class CharToInt {

	public static void main(String[] args) {
		System.out.println("Character To Integer");
		System.out.println("Enter a character as integer : ");
		try(Scanner io = new Scanner(System.in)) {
			char character = io.next().charAt(0);
			int number = Character.getNumericValue(character);
			System.out.println(number);
		} catch (Exception e) {
			System.out.println("Enter a valide input");
		}
	}

}
