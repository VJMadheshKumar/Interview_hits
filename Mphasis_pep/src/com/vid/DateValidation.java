package com.vid;


import java.util.Scanner;



public class DateValidation {
	private static boolean leapYear = false;

	public static void main(String[] args) {
		Scanner io = new Scanner(System.in);
		String input = io.nextLine();
		String[] datesStrings = input.split("/");
		int[] date = new int[datesStrings.length];
		for (int i = 0; i < datesStrings.length; i++) {
			date[i]=Integer.valueOf(datesStrings[i]);
		}
		System.out.print("date "+" ");
		print(date);
		validate(date);
		
		
	
	}
	
	static void validate(int[] date) {
		int day = date[0];
		int month = date[1];
		int year = date[2];
		if (yearValidation(year)) {
			if (monthAndDayValidation(month, day)) {
				System.out.println("valide date");
			}
			else {
				System.out.println("invalide date");
			}
		}
		else {
			System.out.println("invalide date");
		}
		
	}
	static boolean yearValidation(int year) {
		boolean flag = false;
		int temp = year;
		//April, June, September, and November.
		
		
		int digit = 0;
		while (temp>0) {
			temp/=10;
			++digit;
		}
		if (digit==4) {
			flag= true;
			if(((year%4==0)&&(year%100!=0))||(year%400==0)) {
				leapYear=true;
			}
			else {
				leapYear = false;
			}
			
		}
		return flag;
		
	}
	static boolean monthAndDayValidation(int month,int day) {
		boolean flag = false;
		int[] days_30= {4,6,9,11};
		int[] days_31= {1,3,5,7,8,10,12};
		
		if (month<=12) {
			if (month==2) {
				if (leapYear) {
					if (day<=29) {
						flag = true;
					}
				}
				if (!leapYear) {
					if (day<=28) {
						flag=true;
					}
				}
			}
			
			
			for (int i = 0; i < days_30.length; i++) {
				if (month==days_30[i]) {
					if (day<=30) {
						flag=true;
					}
				}
			}
			
			for (int i = 0; i < days_31.length; i++) {
				if (month==days_31[i]) {
					if (day<=31) {
						flag=true;
					}
				}
			}
			
			
			
			
			
		}
		
		return flag;
	}
	 static void print(int[] arr){
			for(int i =0; i<arr.length; i++){
			   System.out.print(arr[i]+"/");
			}
		}

}
