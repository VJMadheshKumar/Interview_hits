package com.solutions7;

import java.awt.Checkbox;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentArray {

	public static void main(String[] args) {
		ArrayList<String> studentList = new ArrayList<>();
		Scanner io = new Scanner(System.in);
		studentList.add("madhesh");
		studentList.add("pradeep");
		studentList.add("kiruthiga");
		System.out.println("Enter a name to add in student list : ");
		String name = io.nextLine(); 
		if (check(studentList,name)) {
			addStudent(studentList,name);
		}

	}
 static boolean check(ArrayList<String> stu,String name) {
	for (int i = 0; i < stu.size(); i++) {
		if(stu.get(i).equals(name)) {
			System.out.println("Name already exist");
			return false;
		}
	}return true;
 }
 
 static void addStudent(ArrayList<String> stu, String name) {
	 stu.add(name);
	 System.out.println("student name added successfully");
	 System.out.println(stu);
 }
 
}
