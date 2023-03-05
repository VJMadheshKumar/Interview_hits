package com.testpress;

import java.util.Scanner;


public class MinAndMax {

	public static void main(String[] args) {
		Scanner io = new Scanner(System.in);
		System.out.println("Enter numebr of elements : ");
		int len = io.nextInt();
		int[] array = new int[len];
		System.out.println("Enter elements one by one : ");
		for (int i = 0; i < len; i++) {
			int elements = io.nextInt();
			array[i]=elements;
		}
		MinAndMax call = new MinAndMax();
		call.findMinAndMax(array);
	}
	void findMinAndMax(int[] array) {
		int min =array[0];
		int max =array[0];
		for (int i = 0; i < array.length; i++) {
			for (int j = i+1; j < array.length; j++) {
				if (max<array[j]) {
					max = array[j];
				}
				if (min>array[j]) {
					min = array[j];
				}
			}
		}System.out.println("max is "+max+""
				+ "\nmin is "+min);
	}
}
