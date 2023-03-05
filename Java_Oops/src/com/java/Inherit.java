package com.java;


class a2{
	int a;
	
	void methh() {
		System.out.println("parent");
	}
}

class b2 extends a2{
	int b;
	
	void call() {
		System.out.println("child");
	}
}

public class Inherit {

	public static void main(String[] args) {
		b2 b = new b2();

		b.a=5;
		b.b=7;
		//System.out.println(b.a);
		//System.out.println(b.b);
		b.methh();
		b.call();
		
	}

}
