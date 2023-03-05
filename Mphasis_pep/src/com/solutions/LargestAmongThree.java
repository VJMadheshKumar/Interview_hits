package com.solutions;

import java.util.Scanner;

public class LargestAmongThree {

	public static void main(String[] args) {
		System.out.println("To find largest number among three");
		System.out.println("Enter any Three numbers : ");

try (Scanner io = new Scanner(System.in) ){
	String number = io.nextLine();
	String[] sArray = number.split(" ");
	int[] array  = new int[sArray.length];
	for (int i = 0; i < array.length; i++) {
		array[i] = Integer.valueOf(sArray[i]);
	}
	System.out.println(largestNum(array));
	
} catch (Exception e) {
	System.out.println("Enter a vallide input");
}
	}

	
	static int largestNum(int[] array) {
		int result = 0;
		if (array[0]>array[1]&&array[0]>array[2]) {
			result = array[0];
					
		} 
		
		else if (array[1]>array[0]&&array[1]>array[2]) {
			result = array[1];
		}
		else {
			result = array[2];
		}
		
		
		return result;
	}
}
