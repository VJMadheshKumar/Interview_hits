package com.vid;

import java.util.Scanner;



public class PatternProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner io = new Scanner(System.in);
      int num = io.nextInt();
      int n =2;
      for (int i = 1; i <=num; i++) {
		loop(i, num, "  ",n); 
  		//loop(1, i, "* ");
		//loop(1, start, String.valueOf(start)+" ");
		
	}
	}

	
	static void loop(int start,int end,String print,int n) {
		if (n>0) {
			for (int j = start; j <=end; j++) {
				System.out.print(print);
				
			}
			loop(1, start, String.valueOf(start)+" ",n-1);
			System.out.println("");
		}
		
	}
}
