package com.zoho.test;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner io = new Scanner(System.in);
		System.out.println("first");
		String word1 = io.nextLine();
		System.out.println("second");
		String word2 = io.nextLine();
		
		Character[] first = toCharArr(word1);
		Character[] second = toCharArr(word2);
		
		
		check(first, second);
	}

static Character[] toCharArr(String word) {
	int len = word.length();
	Character[] letters = new Character[len];
	for (int i = 0; i < len; i++) {
		letters[i]= word.charAt(i);
	}
	return letters;
}



static void check(Character[] first, Character[] second) {
	
	HashMap<Character, Character> Pattern = new HashMap<>();
	for (int j = 0; j < second.length; j++) {
		
		Pattern.put(first[j], second[j]);
	}
	System.out.println(Pattern);
	for (int i = 0; i < second.length; i++) {
		
		first[i]=Pattern.get(first[i]);	
	}
//	System.out.println(second[0]+""+second[1]+""+second[2]);
	if (Arrays.equals(first, second)) {
		System.out.println("true");
	}
	else {
		System.out.println("false");
	}

}





static void print(char[] p) {
	for (int i = 0; i < p.length; i++) {
		System.out.print(p[i]);
	}
}





//static void check(char[] first, char[] second) {
//int len = first.length;
//char[]  pattren = new char[len];
//if (first.length==second.length) {
//	//HashMap<Character, Character> pattern = new HashMap();
//	
//	int count =0;
//	for (int i = 0; i < first.length; i++) {
//		for (int j = 0; j < first.length; j++) {	
//			
//			if (first[i]==first[j]) {
//				count++;
//			
//			}
//			
//			for (int k = 0; k < first.length; k++) {
//				int dummy =0;
//				if (count==1||count==0&&dummy==1||dummy==0) {
//					pattren[i]=first[i];
//					dummy++;
//				}
//				else 
//					pattren[i]='#';
//			}
//		}count =0;
//	}
//	
//}
//print(pattren);
//if (Arrays.equals(pattren, first)) {
//	System.out.println("true");
//	
//}
//else {
//	System.out.println("false");
//}
//
//
//
//}
//static boolean count (char[] word) {
//	int count =0;
//	for (int i = 0; i < word.length; i++) {
//		for (int j = 0; j < word.length; j++) {
//			if (count==0)
//				
//				if (word[i]==word[j]) {
//					count++;
//				
//				}
//			System.out.println(word[i]+"  "+count);
//		}
//	}
//}


}
