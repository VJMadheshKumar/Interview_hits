package com.solutions7;

public class Contact {
	private int number;
	private String nameString;
	@Override
	public String toString() {
		return "Contact [number=" + number + ", nameString=" + nameString + "]";
	}
	public Contact(int number, String nameString) {
		super();
		this.number = number;
		this.nameString = nameString;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getNameString() {
		return nameString;
	}
	public void setNameString(String nameString) {
		this.nameString = nameString;
	}
	

}
