package com.part4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.part4.Line;

public class LineTest {
	Line line = new Line(0,0,1,1);
	Line line2 = new Line(1,1,2,2);
	
	@Test
	public void getSlopeTest() {
		assertEquals( 1.0, line.getSlope(), .0001);
		assertNotEquals( 10.0, line.getSlope());
	}
	
	@Test
	public void getDistanceTest() {
		assertEquals( Math.sqrt(2), line.getDistance(), .0001);
		assertNotEquals( 10.0, line.getDistance());
	}
	
	@Test
	public void parallelToTest() {
		assertTrue(line.parallelTo(line2));
	}

}
