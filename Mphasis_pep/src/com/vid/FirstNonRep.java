package com.vid;

import java.util.Scanner;

public class FirstNonRep {

	public static void main(String[] args) {
		Scanner io  = new Scanner(System.in);
		String input= io.nextLine();
		int len = input.length();

		int count = 0;
		
		for (int i = 0; i < len; i++) {
		for (int j = 0; j < len; j++) {
			if (input.charAt(i)==input.charAt(j)) {
				count++;
				}
		}
		if (count>1) {
			count =0;
		}
		else {
			System.out.println(input.charAt(i));
			//count = 0;
			break;
			}
		}
		
		
	}
	
}
