package com.solutions2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class DecToBin {

	public static void main(String[] args) {
		System.out.println("Decimal to Binary");
		System.out.println("Enter a number : ");
		
		try(Scanner io = new Scanner(System.in)) {
			int number = io.nextInt();
			System.out.println(binary(number));
			System.out.println(mBinary(number));
			
		} catch (Exception e) {
			System.out.println(e);
		}

	}
	
	static ArrayList<Integer> binary(int num) {
		ArrayList<Integer> arrayList = new ArrayList<>();
		int div=num;
		int rem;
		while (div>0) {
			rem = div%2;
			//System.out.println(rem);
			div = div/2;
			//System.out.println(div);
			arrayList.add(rem);
			//resultString+=String.valueOf(rem);
		}
		Collections.reverse(arrayList);
		return arrayList;
	}
	
	static String mBinary(int num) {
		
		return Integer.toBinaryString(num);
	}

}
