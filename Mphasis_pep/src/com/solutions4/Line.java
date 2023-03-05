package com.solutions4;

import java.util.Scanner;


public class Line {
	private Scanner io = new Scanner(System.in);
	private  Point p1;
	private Point p2;
	
	public Line(Point point1, Point point2) {
		this.p1 = point1;
		this.p2 = point2;
	}
	
	
	public Point getP1() {
		return p1;
	}


	public void setP1(Point p1) {
		this.p1 = p1;
	}


	public Point getP2() {
		return p2;
	}


	public void setP2(Point p2) {
		this.p2 = p2;
	}

	public void  accept() {
	System.out.println("Enter the value of X1 : ");
	int x1 = io.nextInt();
	System.out.println("Enter the value of y1 : ");
	int y1 = io.nextInt();
	System.out.println("Enter the value of X2 : ");
	int x2 = io.nextInt();
	System.out.println("Enter the value of y2 : ");
	int y2 = io.nextInt();
	 p1 = new Point(x1, y1);
	 p2= new Point(x2, y2); 
	
	}
	public  void print() {
		Line line = new Line(getP1(), getP2());
		System.out.println("point 1 "+line.getP1());
		System.out.println("point 2 "+line.getP2());
		System.out.println("Length of the line is "+line.getLength());
	}
	
	public int getLength() {
        int x = (int) Math.pow((p2.getX()-p1.getX()), 2);
        int y = (int) Math.pow((p2.getY()-p1.getY()), 2);
        int result = (int) Math.sqrt((x+y));
		return result; 
	}
	public static void main(String[] args) {
		
		Line line = new Line(null, null);
		line.accept();
		line.print();

	}


	@Override
	public String toString() {
		return "Line ["+ " p1=" + p1 + ", p2=" + p2 + "]";
	}

}
