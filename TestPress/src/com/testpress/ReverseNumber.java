package com.testpress;

import java.util.Iterator;
import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner io = new Scanner(System.in);
		System.out.print("Enter a number to reverse : ");
		int num = io.nextInt();
		ReverseNumber call = new ReverseNumber();
		call.reverseNumber(num);

	}
 void reverseNumber(int n) {
		int last = n;
		int result = 0;
		while (n>0) {
			last = n%10;
			result = (result*10)+last;
			n/=10;
			
		}
		String output = Integer.toString(result);
		System.out.println(output.replaceFirst("0", ""));
	}
}
