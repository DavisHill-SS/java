package com.part2;

public class Circle {
	double radius;
	
	public Circle(double r) {
		radius = r;
	}
	
	public double calculateArea() {
		return Math.pow(Math.PI*radius, 2);
	}
	
	public void Display() {
		System.out.println("The area of the Circle is: " + calculateArea());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Circle c = new Circle(10.235);
		c.Display();
	}

}
