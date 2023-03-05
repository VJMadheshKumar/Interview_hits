package com.solutions;


import java.util.ArrayList;
import java.util.Scanner;

public class Fibbo {

	public static void main(String[] args) {
		System.out.println("Fibbonoci series");
		System.out.println("Enter a numeber : ");
		try(Scanner io = new Scanner(System.in)) {
			int number = io.nextInt();
			System.out.println(fSeries(number));
			System.out.println(sumResult(fSeries(number)));
			
		} catch (Exception e) {
			System.out.println("Enter a valide output");
		}
		
	}
	
	static ArrayList<Integer> fSeries(int num){
		ArrayList<Integer> array = new ArrayList<>();
		array.add(0);
		array.add(1);
		for (int i = 2; i <= num*2; i++) {
			int element =array.get(i-1)+array.get(i-2);
			array.add(element);
		}
		return array;
	}
	
	static int sumResult(ArrayList<Integer> array) {
		int result = 0;
		for (int i = 0; i <=array.size(); i++) {
			if (i%2==0) {
				 result +=array.get(i);
			}
		}
		
		return result;
	}
}
