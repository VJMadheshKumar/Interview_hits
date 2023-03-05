package com.solutions6;

import java.util.Scanner;

public class CalcAverage {

	public static void main(String[] args) {
		Scanner io =  new Scanner(System.in);
		int num = io.nextInt();
		try {
			if (num<=0) {
				throw new IllegalArgumentException();
			}
			else {
				System.out.println(avgFirstN(num));
			}
		} catch (Exception IllegalArgumentException) {
			System.out.println("Natural numbers are only allowed");
		}
		
		
		

	}
	public static double avgFirstN(int N){
		double res =0;
		res = N / 2;
		return res;
			
	}

}
