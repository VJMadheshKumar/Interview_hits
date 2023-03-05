package com.java;


import java.util.Arrays;
import java.util.Comparator;

public class CompareElements {

	public static void main(String[] args) {
		Integer[] names = {53,123,37,102,29,56};
		
		Comparator<Integer> comparator = (Integer o1, Integer o2)->{
			int num1 = o1%10;
			int num2 = o2%10;
			if(num1>num2)
				return 1;
			else if(num1<num2)
				return -1;
			else
				return 0;
			
			
		};
		
		Arrays.sort(names,comparator);
		
		
		
		
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		
		
		
		
		
//		
//		Arrays.sort(names, new Comparator<String>() {
//
//			@Override
//			public int compare(String o1, String o2) {
//				//int  result = o1.compareTo(o2);
//				if(o1.length()<o2.length())
//					return 1;
//				else if(o1.length()>o2.length())
//					return -1;
//				else
//					return 0;
//			}
//		
//		
//		});
//		
		
	}

}
