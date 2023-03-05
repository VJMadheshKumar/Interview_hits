package com.zoho;

import java.util.Scanner;

public class AchieveSum{
	public static void main(String[] args){
	      Scanner io = new Scanner(System.in);
		System.out.print("Enter no of elements");
		int len = io.nextInt();
		int[] array = new int[len];
		for(int i=0; i<len; i++){
		   int element = io.nextInt();
		   array[i] = element;
			}
		System.out.print("Your array is :");
                print(array);
		System.out.print("Enter the sum value : ");
		int sum = io.nextInt();
		if(findSumWithin(sum,array)){
		findSum(sum,array);
			}		
		}
		
		
        static boolean findSumWithin(int s,int[] arr){
		int len = arr.length;
		for(int i=0; i<len; i++){
		 if(arr[i]==s) {
			System.out.print("Sum achived "+s+" "+"is with one element "+arr[i]);
			return false;
                      
			}
			}
		return true;
		     }

		


	static void findSum(int s,int[] arr){
		int len = arr.length;
		int num1 =0;
		int num2 =0; 
      		for(int i=0; i<len; i++){
			for(int j=i+1; j<len; j++){
				if(arr[i]+arr[j]==s){
					num1 = arr[i];
					num2 = arr[j];
					
					             }
				     }
			      
				if(num1>0||num2>0){
			         System.out.print("Sum achived "+s+" "+"is with two elements "+num1+","+num2);
			           break;
				}}
      		
				
                                    
					}

	static void print(int[] arr){
	for(int i=0; i<arr.length; i++){
	System.out.print(arr[i]+" ");
		}System.out.println("");
	}

}
