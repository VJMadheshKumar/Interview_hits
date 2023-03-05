package com.solutions6;

import java.io.IOError;
import java.util.Scanner;

public class Number {
	int a;
	int b;
	double result;
   public Number() {
	   this.a = 5;
	   this.b = 0;
   }
	public static void main(String[] args) {
		Scanner io = new Scanner(System.in);
		Number number = new Number();
		System.out.println("1.Addition"
				+ "\n2.Subtraction"
				+ "\n3.Multiplication"
				+ "\n4.Division");
		System.out.print("Enter your choice : ");
		int key = io.nextInt();
		switch (key) {
		case 1:
			System.out.println(number.add());
			break;
		case 2:
			System.out.println(number.sub());
			break;
		case 3:
			System.out.println(number.mul());
			break;
		case 4:
			System.out.println(number.div());
			break;
		default:
			System.out.println("Enter a valide input");
			break;
		}

	}
	
	 double add() {
		result = a+b;
		return result;
	}
	 double sub() {
			result = a-b;
			return result;
		}
	 double mul() {
			result = a*b;
			return result;
		}
	 double div() {
		 try {
			 result = a/b;
			 
		} 
		 
		 catch (ArithmeticException e) {
			System.out.println("since division by zero is undefined");
			
		}
		 	
			return result;
		}

}
