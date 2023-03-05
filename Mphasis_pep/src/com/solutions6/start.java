package com.solutions6;

class start{
	public static void main(String[] args) {
		Robot robot = new Robot();
		robot.start();
	}	
}

class Robot {
	private int id=1234;
class Brain{
	public void think() {
		System.out.println(id+" is thinking");
	}
}
static class Battery{
	static public void charge() {
		System.out.println("Battery is charging");
	}
}
public void start(){
	System.out.println("Roboting robot with ID : "+id);
	Brain brain = new Brain();
	brain.think();
	Robot.Battery.charge();
}


}
