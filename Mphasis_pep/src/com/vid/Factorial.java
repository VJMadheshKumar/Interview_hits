package com.vid;

import java.util.Scanner;



public class Factorial {

	public static void main(String[] args) {
	Scanner ioScanne = new Scanner(System.in);
	int fact = ioScanne.nextInt();
	int x  = fact;
	for (int i = 1; i <x; i++) {
		fact = fact*i;
	}
	System.out.println(fact);

	}

}
