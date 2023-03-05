package com.solutions;

import java.util.ArrayList;
import java.util.Scanner;

import javax.imageio.stream.MemoryCacheImageInputStream;
import javax.swing.event.MenuDragMouseEvent;

public class DynamicFibbo {

	public static void main(String[] args) {
		Scanner io = new Scanner(System.in);
		System.out.println("To find the Nth fibbionic number");
		System.out.println("Enter a number : ");
		int num = io.nextInt();
		ArrayList<Integer> memo= new ArrayList<>();
		memo.add(0);
		memo.add(1);
		System.out.println(findN(num-1,memo));
		
	}
static int findN(int n, ArrayList<Integer> memo) {
	Integer result;
	if (n<memo.size()) 
		return memo.get(n);
	else if(n==1||n==2) 
		result=1;
	else 
	     result = findN(n-1, memo)+findN(n-2, memo);
	memo.add(n, result);
	return result;
}
}
