package com.part4;

public class Line {
	public Line(double x0, double y0, double x1, double y1) {
		this.x0 = x0;
		this.y0 = y0;
		this.x1 = x1;
		this.y1 = y1;
	}
	
	public double getSlope() throws ArithmeticException {
		if(!(x1==x0)) {
			return (y1-y0)/(x1-x0);
		}
		return 0;
		
	}
	
	public double getDistance() {
		return Math.sqrt(x1-x0)*(x1-x0) + (y1-y0)*(y1-y0));
	}
	
	public boolean parallelTo(Line l) {
	if(Math.abs(getSlope() - l.getSlope()) < .0001) {
		return true;
	}
	else {
		return false;
	}
	}
	private double x0, x1, y0, y1;
}