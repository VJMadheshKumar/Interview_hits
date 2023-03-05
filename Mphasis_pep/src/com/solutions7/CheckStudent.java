package com.solutions7;

import java.util.ArrayList;
import java.util.Scanner;

public class CheckStudent {

	public static void main(String[] args) {
		ArrayList<String> studentList = new ArrayList<>();
		Scanner io = new Scanner(System.in);
		studentList.add("madhesh");
		studentList.add("pradeep");
		studentList.add("kiruthiga");
		System.out.println("Enter a name to add in student list : ");
		String name = io.nextLine(); 
		checkStudent(studentList,name);

	}
	static void checkStudent(ArrayList<String> studentList,String name) {
		if (studentList.contains(name)) {
			System.out.println("student name "+name+" is already present in the list");
		}
		else {
			System.out.println("student name "+name+" is not present in the list");
		}
	}

}
