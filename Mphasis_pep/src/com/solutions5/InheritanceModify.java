package com.solutions5;

import java.util.Scanner;

public class InheritanceModify {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		EmployeeModify employee = new EmployeeModify();

	}

}
//"My name is Madhesh Kumar V J"
class PersonModify{
	PersonModify(String name){
		System.out.println(name);
	}
}
//"and I'm staying at Chennai"
class AddressModify{
	 AddressModify(String address) {
		 System.out.println(address);
	}
}

class EmployeeModify  {
	Scanner io =  new Scanner(System.in);
	EmployeeModify() {
		System.out.println("Enter your name : ");
		String name = io.nextLine();
		
		System.out.println("Enter your address : ");
		String location = io.nextLine();
		
		@SuppressWarnings("unused")
		PersonModify person = new PersonModify("My name is "+name);
		@SuppressWarnings("unused")
		AddressModify address = new AddressModify("and I'm staying at "+location);
	 }
}