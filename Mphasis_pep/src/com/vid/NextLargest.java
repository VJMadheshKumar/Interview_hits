package com.vid;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.concurrent.CopyOnWriteArrayList;

public class NextLargest {

	public static void main(String[] args) {
		Scanner io = new Scanner(System.in);
		String input = io.nextLine();
		String[] sArray= input.split(" "); 
		
		ArrayList<Integer> nArrayList = new ArrayList<>();

		for (int i = 0; i < sArray.length; i++) {
			nArrayList.add(Integer.valueOf(sArray[i]));
		}
		
		ArrayList<Integer> sortArrayList= new ArrayList<>(nArrayList);
		Collections.sort(sortArrayList);

		for (int i = 0; i < nArrayList.size(); i++) {
			for (int j = 0; j < sortArrayList.size()-1; j++) {
				if (nArrayList.get(i)==sortArrayList.get(j)) {
					System.out.println(nArrayList.get(i)+"----->"+sortArrayList.get(j+1));
				}
			}
		}
		System.out.println(nArrayList);
		System.out.println(sortArrayList);
	
	}

}
