package com.solutions3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class LargestInArray {

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
			System.out.println(Collections.max(numbers));
		} catch (Exception e) {
			System.out.println("Enter a valide input");
		}
	}

}
