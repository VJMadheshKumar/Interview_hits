package com.solutions4;

public class Point {
	private int x;
	private int y;

	
	public  Point(int X,int Y) {
		this.x = X;
		this.y =Y;
		
	}

	@Override
	public String toString() {
		return " [x=" + x + ", y=" + y + "]";
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	

}
