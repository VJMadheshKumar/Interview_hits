package com.solutions2;

import java.util.Scanner;

public class Pyramid {

	public static void main(String[] args) {
		System.out.println("Pyramid numbers");
		System.out.println("Enter the number of rows : ");
		try (Scanner io = new Scanner(System.in)){
			int row = io.nextInt();
			printPyramid(row);
			
		} catch (Exception e) {
			System.out.println("Enter a valide input");
		}
	}
	static void printPyramid(int rows) {
		for (int i = 1; i <= rows; i++) {
			for (int j = i; j <= rows; j++) {
			
				System.out.print("  ");}
			
			for (int k = 1; k <= i; k++) {
				System.out.print(i+k-1+" ");
			}
			for (int l = 2; l <=i; l++) {
				System.out.print((i-l)+i+" ");
			}
			
			System.out.println("");
		}
		
		
		
		
	}
}
