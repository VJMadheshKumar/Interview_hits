package com.distance;

import java.util.Scanner;

public class Distance {

	public static void main(String[] args) {
		/*distance is a scaler quantity which has only magnitude no direction
		 which means it can only be positive*/
		Scanner  io = new Scanner(System.in);
		System.out.print("Enter the speed :");
		int speed = io.nextInt();
		System.out.print("Enter the time :");
		int time = io.nextInt();
		int distance =0;
		distance = speed*time;
		System.out.println("The distace you have travelled is "+distance);

	}

}
