package com.testpress;

import java.util.Scanner;

public class ReverseString {
	
	public static void main(String[] args) {
		Scanner io = new Scanner(System.in);
		System.out.println("Enter a String to reverse : ");
		String input = io.nextLine().trim();
		ReverseString call = new ReverseString();
		if (call.checkLowercase(input)) {
			System.out.println(call.reverse(input));
		} else {
			System.out.println("only lowercase characters ['a' to 'z'] allowed as input");
		}
		

	}
	
	boolean checkLowercase(String word) {
		boolean flag = false;
		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i)>=97&&word.charAt(i)<=122) {
				flag = true;
			}
			else {
				flag = false;
				break;
			}
		}
		return flag;
	}
	
	String reverse(String word) {
		String output = "";
		int len = word.length();
		for (int i =len-1 ; i >=0; i--) {
			output+= word.charAt(i); 
		}
		return output;
	}
}
