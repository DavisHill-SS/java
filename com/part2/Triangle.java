package com.part2;

public class Triangle implements Shape{
	int length;
	int height;
	
	public Triangle(int l, int h) {
		length = l;
		height = h;
	}

	public double calculateArea() {
		return (length * height)/2;
	}
	
	public void Display() {
		System.out.println("The area of the Triangle is: " + calculateArea());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle t = new Triangle(2, 5);
		t.Display();

	}

}
