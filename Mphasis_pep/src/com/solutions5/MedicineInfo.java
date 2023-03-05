package com.solutions5;



interface MedicineInfo {

default void displayLable() {
	System.out.println("Company : AtoZ Pharmachy");
	System.out.println("Address : Chennai");
};

}
class Tablet implements MedicineInfo{

	@Override
	public void displayLable() {
		System.out.println("store in a cool dry place");
		
	}
	
}
class Syrup implements MedicineInfo {
	@Override
	public void displayLable() {
		System.out.println("Shake well before use");
		
	}
	
}
class Ointment implements MedicineInfo{
	
	@Override
	public void displayLable() {
		System.out.println("for external use only");
		
	}
	
	
}