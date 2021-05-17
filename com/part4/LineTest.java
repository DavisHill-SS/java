package com.part4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.test;

public class LineTest {
	private Line line = new Line(0,0,0,0);
	
	@test
	public void getSlopeTest() {
		assertEquals( double(0), line.getSlope());
		assertNotEquals(double(10), line.getSlope());
	}
	
	@test
	public void getDistanceTest() {
		assertEquals( double(0), line.getDistance());
		assertNotEquals(double(10), line.getDistance());
	}
	
	@test
	public void getParallelToTest() {
		assertEquals( double(0), line.getParallelTo());
		assertNotEquals(double(10), line.getParallelTo());
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
