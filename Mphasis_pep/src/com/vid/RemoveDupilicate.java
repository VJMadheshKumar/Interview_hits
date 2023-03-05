package com.vid;

import java.nio.channels.NonWritableChannelException;
import java.util.Scanner;

public class RemoveDupilicate {

	public static void main(String[] args) {
		Scanner io = new Scanner(System.in);
		System.out.print("Enter the number of elements : ");
		int len = io.nextInt();
		int[] array = new int[len];
		System.out.println("Enter elements one by one :");
		int element = 0;
		for (int i = 0; i < len; i++) {
			element = io.nextInt();
			array[i] = element;
		}
		System.out.println("your array is : ");
		printArray(array);
		System.out.println("Your array when duplicates are removed");
		removeDupilicate(array);
		
	}
	
	static void printArray(int[] arr) {
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
	}
	
	
	static int[] removeDupilicate(int[] arr) {
		int[] result = new int[arr.length];
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(arr[i]==arr[j]) {
					count++;
								}
			}
		}
		
		return arr;
	}

}
