package com.solutions3;

import java.util.ArrayList;

import java.util.Scanner;


public class AverageOfArray {

	public static void main(String[] args) {
		System.out.println("Find the largest element in a array");
		try (Scanner io = new Scanner(System.in)){
			ArrayList<Integer> numbers = new ArrayList<>();
			System.out.print("Enter the number of elements : ");
			int size = io.nextInt();
			System.out.println("Enter the elements one by one");
			for (int i = 0; i < size; i++) {
				int element = io.nextInt();
				numbers.add(element);
			}
			System.out.println(average(numbers));
		} catch (Exception e) {
			System.out.println("Enter a valide input");
		}
	}
	static Double average(ArrayList<Integer> array) {
		Double result = 0.0;
		for (int i = 0; i < array.size(); i++) {
			result+=array.get(i);
		}
		result=result/array.size();
		return result;
	}

}
