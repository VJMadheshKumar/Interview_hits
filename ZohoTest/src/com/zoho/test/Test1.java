package com.zoho.test;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner io = new Scanner(System.in);
		System.out.print("Enter a number:");
		int num = io.nextInt();
		
		dolusNumber(num);
	}
	
	static void  dolusNumber(int n) {
		
		Double div2,div3,div5= 1.0;
		div2 = n/2.0;
		div3 = n/3.0;
		div5 = n/5.0;
		
		System.out.println(div2);
		System.out.println(div3);
		System.out.println(div5);
		
		if (div2%2==0||div2%3==0||div2%5==0) {
			System.out.println("true");
		}
		else if (div3%2==0||div3%3==0||div3%5==0) {
			System.out.println("true");
		}
		else if (div5%2==0||div5%3==0||div5%5==0) {
			System.out.println("true");
		}
		else {
			System.out.println("flase");
		}
		
	}

}
