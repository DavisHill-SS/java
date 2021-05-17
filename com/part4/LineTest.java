package com.part4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.test;

public class LineTest {
	private Line line = new Line(0,0,0,0);
	
	@test
	public void getSlopeTest() {
		assertEquals( int(0), line.getSlope());
	}
	
	@test
	public void getDistanceTest() {
		assertNotEquals(new Integer(100), line.getDistance());
	}
	
	@test
	public void getParallelToTest() {
		assertEquals( false, line.getParallelTo());
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
