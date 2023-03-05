package com.vid;

interface say {

	void print() ;
}

class hello implements say{
	
	@Override
	public void print() {
		System.out.println("hello");
	} 
}
class hai implements say{
	
	@Override
	public void print() {
		System.out.println("hai");
		
	}
}