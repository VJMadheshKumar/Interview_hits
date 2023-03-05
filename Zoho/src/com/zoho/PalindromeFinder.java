package com.zoho;

import java.util.Arrays;
import java.util.Scanner;

public class PalindromeFinder {

	public static void main(String[] args) {
		Scanner io = new Scanner(System.in);
		String word = io.nextLine();
//		String word2 = "";

		if (canSplit(tocharArray(word))) {
			System.out.println("can split");
		}
		
		else {
			System.out.println("can't split");
		}
//		canSplit(tocharArray(word2));
	
	}
	
	static boolean canSplit(char[] words) {
		boolean flag = false;
	for (int i = 1; i < words.length; i++) {
		char[] word1 = Arrays.copyOfRange(words, 0, i);
		char[] word2 = Arrays.copyOfRange(words, i, words.length);
		
		if (revCheck(word1)&revCheck(word2)) {
			flag=true;
			break;
		}
		
	}return flag;
		
		
		
	}
	
	
	static char[] tocharArray(String word) {
		char[] letters = new char[word.length()];
		for (int i = 0; i < word.length(); i++) {
			char letter = word.charAt(i);
			letters[i]=letter;
		}
		
		return letters;
		
	}
	
	static boolean revCheck(char[] word) {
		boolean flag = false;
		char[] temp = new char[word.length];
		if (word.length==1) {
			flag = true;
		}
		else {
			int index = 0;
			for (int i = temp.length-1; i >=0 ; i--) {
				temp[index++]=word[i];}
		
			if (Arrays.equals(word, temp)) {
				flag=true;
			}
			
		}
		return flag;
		
	}
	
	
	
	
	
	
	
	
}
