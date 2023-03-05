package com.solutions6;

public class CommandLine {

	public static void main(String[] args) {
//		String[] toUpperCase= toUpperCase(args);
//		printCommand(toUpperCase);
//		String[] toLowerCase= toLowerCase(args);
//		printCommand(toLowerCase);
//		String[] toFirstLetter = toFirstLetter(args);
//		printCommand(toFirstLetter);

		//reverseOrder(args);
		reverseString(args);

	}
	static void toUpperCase(String[] args) {
		System.out.println("To Upper Case");
		int len = args.length;
		for (int i = 0; i < len; i++) {
			args[i] =args[i].replace(args[i], args[i].toUpperCase());
		}
		printCommand(args);
	}
	static void toLowerCase(String[] args) {
		System.out.println("\nTo Lower Case");
		int len = args.length;
		for (int i = 0; i < len; i++) {
			args[i] =args[i].replace(args[i], args[i].toLowerCase());
		}
		printCommand(args);
	}
	static void toFirstLetter(String[] args) {
		System.out.println("\nTo First Letter");
		int len = args.length;
		for (int i = 0; i < len; i++) {
			args[i] =Character.toString(args[i].charAt(0)) ;
		}
		printCommand(args);
	}
	static void reverseOrder(String[] args) {
		System.out.println("\nReverse order");
		int len = args.length;
		for (int i = len-1; i <=0; i--) {
			
			System.out.println(args[i]);
		}
		
	}
	static void reverseString(String[] args) {
		System.out.println("\n ReverseString");
		int len = args.length;
		for (int i = 0; i < len; i++) {
			StringBuilder sBuilder = new StringBuilder(args[i]);
			args[i]=sBuilder.reverse().toString();
		}
		printCommand(args);
	}
	static void letterCount(String[] args) {
		System.out.println("\nTo Lower Case");
		int len = args.length;
		int count=0;
		for (int i = 0; i < len; i++) {
			count+=args[i].length();
		}
		System.out.println("Total length is: "+count);
	}
	static void printCommand(String[] commandLine) {
		for (int i = 0; i < commandLine.length; i++) {
			 System.out.print(commandLine[i]+" ");
		}
	}
}
