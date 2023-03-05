package com.java;

import java.util.ArrayList;


public class Abstract_Demo {

	public static void main(String[] args) {
		human women = new women();
		human men = new men();
		String Wname  = women.name("lavanya");
		String Wcolor = women.color();
		String Whair = women.hair();
		int Wage = women.age();
		String Mname = men.name("Madhesh Kumar");
		String Mcolor = men.color();
		String Mhair = men.hair();
		int Mage = men.age();
		System.out.println("Name :"+Wname+"\n"+
				"Age :"+Wage+"\n"+
				"Color :"+Wcolor+"\n"+
				"Hair :"+Whair+"\n");
System.out.println("---------------------------");
System.out.println("Name :"+Mname+"\n"+
		"Age :"+Mage+"\n"+
		"Color :"+Mcolor+"\n"+
		"Hair :"+Mhair+"\n");
	}

}
 abstract class human{
	 
	 int age() {
			// TODO Auto-generated method stub
			int age = (int)(Math.random()*80);
			return age;
		}

	  String color() {
			// TODO Auto-generated method stub
			ArrayList<String> colorList= new ArrayList<String>();
			colorList.add("black");
			colorList.add("white");
			int random = (int)(Math.round(Math.random()*(1)));
			String color = colorList.get(random);
		
			return color;
		}
	  String hair() {
			// TODO Auto-generated method stub
			ArrayList<String> hairList= new ArrayList<String>();
			hairList.add("short");
			hairList.add("long");
			int random = (int)(Math.round(Math.random()*(1)));
			String hair = hairList.get(random);
			return hair;
		}
 
	  abstract String name(String name);

}
 
 
 
 class men extends human{


	String name(String name) {
		return name;
	}



 		}
 class women extends human{


	String name(String name) {
		return name;
	}



 		}