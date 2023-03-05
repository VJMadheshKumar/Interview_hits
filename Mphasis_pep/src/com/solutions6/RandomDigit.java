package com.solutions6;



public class RandomDigit {

	public static void main(String[] args) {

		threeDigits();
		fiveDigits();
		tenDigits();

	}
	static void threeDigits() {
		int upperBound = 999;
		int lowerBound = 100;
		int number = lowerBound + (int)(Math.random() * ((upperBound - lowerBound) + 1));
		System.out.println(number);
	}
	static void fiveDigits() {
		int upperBound = 99999;
		int lowerBound = 10000;
		int number = lowerBound + (int)(Math.random() * ((upperBound - lowerBound) + 1));
		System.out.println(number);
	}
	static void tenDigits() {
		int upperBound = 99999;
		int lowerBound = 1000000000;
		int number = lowerBound + (int)(Math.random() * ((upperBound - lowerBound) + 1));
		System.out.println(number);
	}


}
