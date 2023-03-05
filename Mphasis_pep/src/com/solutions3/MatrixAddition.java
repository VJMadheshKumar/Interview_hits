package com.solutions3;


import java.util.Arrays;
import java.util.Scanner;

public class MatrixAddition {
	static Scanner io = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Matrix Addition");
		System.out.print("Enter no of rows : ");
		try {
			int rows = io.nextInt();
			System.out.print("Enter no of columns :");
			int columns = io.nextInt();
			System.out.println("Enter the elements of 1st matrix:");
		    int[][] a1 = matrix(rows, columns);
		    System.out.println("Enter the elements of 2nd matrix:");
		    int[][] a2 = matrix(rows, columns);
		    System.out.println("Your matrices are");
		    printMatrix(a1);
		    printMatrix(a2);
		    System.out.println("Your addition is :");
		    matrixAddition(a1,a2,rows,columns);

		} catch (Exception e) {
			System.out.println("Enter a valide input");
		}

	}
	
	
	static int[][] matrix(int rows,int columns){
		
		int[][] array = new int[rows][columns];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				int element = io.nextInt();
				array[i][j]=element;
			}
		}
		
		return array;
	}
static void printMatrix(int[][] matrix){
	for (int[] is : matrix) {
    	String res = Arrays.toString(is);
    	System.out.println(res);
    	
	}System.out.println("------");
	
}
	static void matrixAddition(int[][] a1,int[][] a2,int row,int columns) {
		int[][] result = new int[row][columns];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < columns; j++) {
				result[i][j]= a1[i][j]+a2[i][j];
			}
			
		}
		printMatrix(result);
	}
	
}
