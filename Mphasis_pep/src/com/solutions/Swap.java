package com.solutions;

import java.util.Arrays;
import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		System.out.println("Swapping two numbers!");
		System.out.print("Enter any two numbers to swap : ");
		
		
		try (Scanner io = new Scanner(System.in)){
			
			
			
			String numbers = io.nextLine();
			//|| numbers == null
			if (numbers == "" ) {
				System.err.println("Enter a valide input");
				
				
			} 
			else {
				String[] sArray = numbers.split(" ");
				int[] nArray = new int[sArray.length];
				for (int i = 0; i < sArray.length; i++) {
					nArray[i] = Integer.valueOf(sArray[i]);
				}
				System.out.println("Before swapping " +Arrays.toString(nArray));

				if (nArray.length<2 ) {
					System.err.println("you need two numbers to swap");
					
					
				} 
				

				
				
				
				else {
					
				
				System.out.println("1.•	Creating an auxiliary memory cell in the memory\n"+
									"2.•	Without creating any auxiliary(additional) memory cell\n"+
									"3.•	Using exclusive OR (Bitwise XOR) operator");
				System.out.println("Enter your preferred swapping method");
				int choice = io.nextInt();
				switch (choice) {
				case 1:
					
					//memorySwap(nArray) 
					Swap call = new Swap();
					System.out.println(call.memorySwap(nArray));
//					int[] mResult = memorySwap(nArray);
//					for (int j = 0; j < mResult.length; j++) {
//						System.out.println(mResult[j]);
//					}
					break;
					
				case 2:
					//swap(nArray);
					System.out.println(swap(nArray));
//					int[] result = swap(nArray);
//					for (int j = 0; j < result.length; j++) {
//						System.out.println(result[j]);
//					}
					
					break;
				case 3:
					//xorSwap(nArray);
					System.out.println(xorSwap(nArray));
//					int[] xorResult = xorSwap(nArray);
//					for (int j = 0; j < xorResult.length; j++) {
//						System.out.println(xorResult[j]);
//					}
					break;
				default:
					System.out.println("Enter a valide choice");
					break;
				}
			}
			}
			
			
			
		} catch (NumberFormatException e) {
			System.out.println("String input not accepted");
		}
		catch (Exception e) {
			System.out.println("Enter a valide input");
		}
		

		
		
		
		
	}



	 String memorySwap(int[] array) {
		
		System.out.println("Swapped using creating an auxiliary memory cell in the memory");
		int temp=0;
		temp = array[0];
		array[0] = array[1];
		array[1] = temp;
		return Arrays.toString(array);
		}
	  
	  static String swap(int[] array) {
		  System.out.println("swapped using Without creating any auxiliary(additional) memory cell");
		  
		  //a=1 b=2
		  array[0] = array[0]-array[1]; 
		  array[1] = array[0]+array[1]; 
		  array[0] = array[1]-array[0]; 
		  
		  return Arrays.toString(array);
	  }
	
	  static String xorSwap(int[] array) {
		  System.out.println("swapped using XOR ");
		  array[0] = array[0]^array[1];
		  array[1] = array[0]^array[1];
		  array[0] = array[1]^array[0];
		  
		  return Arrays.toString(array);
	  }

	
}
