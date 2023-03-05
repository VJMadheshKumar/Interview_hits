package com.solutions5;

import java.util.Random;

public class TestMedicine {

	public static void main(String[] args) {
		MedicineInfo[] medicineInfos = new MedicineInfo[10];
		
		Random rand = new Random();
		for (int i = 0; i < 10; i++) {
	    	int randomNum = rand.nextInt((3 - 1) + 1) + 1;
	    	
	    	if (randomNum == 1)
	    		medicineInfos[i] = new Tablet();
	    	else if (randomNum == 2)
	    		medicineInfos[i] = new Syrup();
	    	else if (randomNum == 3)
	    		medicineInfos[i] = new Ointment();
	    	if (medicineInfos[i] instanceof Tablet) {
	    	System.out.println(i);
	    		medicineInfos[i].displayLable();
	    	}
	    	if (medicineInfos[i] instanceof Syrup) {
	        	System.out.println(i);
	        		medicineInfos[i].displayLable();
	        	}
	        	
	    	if (medicineInfos[i] instanceof Ointment) {
	        	System.out.println(i);
	        		medicineInfos[i].displayLable();
	        	}
	        	
	    	
	    }

	}

}
