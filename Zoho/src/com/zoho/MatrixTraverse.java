package com.zoho;

import java.util.Scanner;

public class MatrixTraverse{
	public static void main (String[] args){
	Scanner io = new Scanner(System.in);
	int row = io.nextInt();
	int coloumn = io.nextInt();
	int[][] matrix = new int[row][coloumn];
	System.out.println("Enter the elements one by one");
	for(int i=0; i<row; i++){
	for(int j =0; j<coloumn; j++){
		int element = io.nextInt();
		matrix[i][j]= element;
 		}
	  }
	print(matrix,row,coloumn);
    Rev(matrix,row-1,coloumn-1);
	}

	static void print(int[][] arr,int row, int coloumn){
		for(int i=0; i<row; i++){
		 for(int j =0; j<coloumn; j++){
		System.out.print(arr[i][j]);
 		}System.out.println("");
	  }

		}


	static void Rev(int[][] arr,int row, int coloumn){
	
		for(int i=row; i>=0; i--){
			for(int j =coloumn; j>=0; j--){
				System.out.print(arr[i][j]);
 				}
			System.out.println("");
	  }

		}

}