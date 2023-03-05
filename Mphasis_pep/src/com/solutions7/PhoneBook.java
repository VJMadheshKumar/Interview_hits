package com.solutions7;

import java.util.Map.Entry;
import java.util.HashMap;
import java.util.Scanner;


public class PhoneBook {
	 private HashMap<String,Long> contacts = new HashMap();
	public static void main(String[] args) {
		PhoneBook phoneBook  = new PhoneBook();
		Scanner io = new Scanner(System.in);
		boolean flag = true;
		while (flag) {
			System.out.println("choose your operation ");
			System.out.println("a.	Add new phone book entry "
					+ "\nb.	Search Phone Number"
					+ "\nc.	Quit");
			System.out.print("Enter your choice : ");
			String  key = io.nextLine();
			switch (key) {
			case "a":
				phoneBook.addContacts();
				break;
			case "b":
				phoneBook.searchContact();
				break;
			case "c":
				System.out.println("Quit successfully");
				flag =false;
				break;

			default:
				break;
			}
		}

	}
	
	void addContacts() {
		
		Scanner io = new Scanner(System.in);
		System.out.println("Enter Name : ");
		String name = io.nextLine();
		System.out.println("Enter phone number :");
		Long num = io.nextLong();
		if (contacts.containsValue(num)) {
			System.out.println("Phone number already exist");
		 for (Entry<String, Long> entry : contacts.entrySet()) {
			if (contacts.containsValue(num)) {
				System.out.println("Phone number already exist");
				System.out.println(entry.getKey());
				}
		 	}
		}
	else {
		contacts.put(name, num);
		System.out.println("contact added successfully");
		}
		
	}
	void searchContact() {
		Scanner io = new Scanner(System.in);
		System.out.println("Enter Name to search: ");
		String name = io.nextLine();
		if (contacts.containsKey(name)) {
			System.out.println(contacts.get(name));
			
		}
		else {
			System.out.println("not found");
		}
		
	}

}
