package com.vid;

import java.util.Scanner;

public class RemovePalindrome {

	public static void main(String[] args) {
		Scanner io = new Scanner(System.in);
		String sentance = io.nextLine();
		String[] sArray = sentance.split(" ");
		int len = sArray.length;
		String check = "";
		for (int i = 0; i < len; i++) {
			for (int j = 0; j <sArray[i].length(); j++) {
				char ch =sArray[i].charAt(j);
				check = ch+check;
			}
			if (sArray[i].equals(check)) {
				System.out.print("");	
			}
			else {
				System.out.print(sArray[i]+" ");
			}
			check="";
			
			
		}

	}

}
