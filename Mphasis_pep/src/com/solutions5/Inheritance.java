package com.solutions5;

public class Inheritance {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Employee employee = new Employee();

	}

}

class Person{
	Person(){
		System.out.println("My name is Madhesh Kumar V J");
	}
}

class Address{
	 Address() {
		 System.out.println("and I'm staying at Chennai");
	}
}

class Employee extends Person{
	Address address = new Address();
}