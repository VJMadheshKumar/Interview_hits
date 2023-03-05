package com.soft;

import java.util.Scanner;

public  class TimeTaken {

	public static void main(String[] args) {
		Scanner io = new Scanner(System.in);
		System.out.println("To find time taken to press the keys");
		System.out.println("Enter the keyboard pattern randomly(0-9) : ");
		String kBoard = io.nextLine();
		System.out.print("Enter the keys you have to press : ");
		String keys = io.nextLine();
		
		findTimeTaken(kBoard,keys);
	}

	static void findTimeTaken(String pattern, String keys) {
		int count = 0;
		int pre = 0;
		for (int i = 0; i < keys.length(); i++) {
			for (int j = 0; j < pattern.length(); j++) {
				if (keys.charAt(i)==pattern.charAt(j)) {
					count =count+Math.abs(j-pre);
					pre =j;
				}
			}
		}
		System.out.println("Time taken to press this keys : "+count+"seconds");
	}
	
}
