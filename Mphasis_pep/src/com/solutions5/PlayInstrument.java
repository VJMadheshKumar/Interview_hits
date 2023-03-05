package com.solutions5;

//import java.util.ArrayList;
import java.util.Random;



public class PlayInstrument {
	
	public static void main(String[] args) {
	Instrument[] instruments = new Instrument[10];
	
	//using array list
	/*ArrayList<Instrument> ins = new ArrayList<>();
	ins.add(new Piano());
	System.out.println("i am array list");
	ins.get(0).play();
	System.out.println("+++++++++++++++");*/
	
	Random rand = new Random();
	for (int i = 0; i < 10; i++) {
    	int randomNum = rand.nextInt((3 - 1) + 1) + 1;
    	
    	if (randomNum == 1)
    		instruments[i] = new Piano();
    	else if (randomNum == 2)
    		instruments[i] = new Flute();
    	else if (randomNum == 3)
    		instruments[i] = new Guitar();
    	if (instruments[i] instanceof Piano) {
    	System.out.println(i);
    		instruments[i].play();
    	}
    	if (instruments[i] instanceof Flute) {
        	System.out.println(i);
        		instruments[i].play();
        	}
        	
    	if (instruments[i] instanceof Guitar) {
        	System.out.println(i);
        		instruments[i].play();
        	}
        	
    	
    }
//	Instrument instrument = new Piano();
//	if (instrument instanceof Piano) {
//		instrument.play();
//	}
//		instrument.play();
		
		
		

	}

}
abstract class Instrument{
	
	 abstract void play();
}
class Piano extends Instrument{

	void play(){
		System.out.println("Piano is playing tan tan tan tan");
	}
}

class Flute extends Instrument{

	void play(){
		System.out.println("Flute is playing toot toot toot toot");
	}
}

class Guitar extends Instrument{

	void play(){
		System.out.println("Guitar is playing tin tin  tin");
	}
}