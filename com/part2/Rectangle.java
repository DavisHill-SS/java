package com.part2;

public class Rectangle implements Shape {
	int length;
	int height;
	
	public Rectangle(int l, int h) {
		length = l;
		height = h;
	}
	
	
	public double calculateArea() {
		return length * height;
	}
	
	public void Display() {
		System.out.println("The area of the Rectangle is: " + calculateArea());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangle r = new Rectangle(2, 5);
		r.Display();

	}

}
