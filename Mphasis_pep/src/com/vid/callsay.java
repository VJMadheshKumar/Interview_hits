package com.vid;

public class callsay {
	static say Say;
	public static void main(String[] args) {
		setsay(new hello());
		Say.print();
	}
public static void setsay(say s) {
	Say =s;
	
}
}
